package com.bilibili.bililive.socket

import android.os.SystemClock
import com.bilibili.base.connectivity.ConnectivityMonitor
import com.bilibili.bililive.socket.beans.Config
import com.bilibili.bililive.socket.beans.Operation
import com.bilibili.bililive.socket.beans.Packet
import com.bilibili.bililive.socket.interfaces.*
import com.bilibili.bililive.socket.plugins.HeartbeatPlugin
import com.bilibili.bililive.socket.plugins.ReconnectPlugin
import com.bilibili.droid.thread.HandlerThreads
import log.LiveLogger
import log.logError
import log.logInfo
import org.json.JSONException
import java.io.IOException
import java.net.InetSocketAddress
import java.net.UnknownHostException
import java.nio.channels.SelectionKey
import java.nio.channels.Selector
import java.nio.channels.SocketChannel
import java.nio.channels.UnresolvedAddressException

abstract class SocketClient(
    private val packetReader: IPacketReader,
    private val packetWriter: IPacketWriter,
    protected val callback: ISocketCallback
) : LiveLogger {
    private val plugins = mutableMapOf<String, Plugin>()
    private val executor = SocketExecutor
    private var socketChannel: SocketChannel? = null
    private var selector: Selector? = null
    private var config: Config? = null
    private val runnable = SocketRunnable()
    private var isConnected = false
    private val heartbeatPlugin: HeartbeatPlugin

    init {
        plugins[ReconnectPlugin.ID] = ReconnectPlugin { doConnect() }
        HeartbeatPlugin { packet -> write(packet) }.apply {
            heartbeatPlugin = this
            plugins[HeartbeatPlugin.ID] = this
        }
    }

    fun connect(host: String, port: Int, connectTimeOut: Long?) {
        config = Config(host, port, connectTimeOut)
        doConnect()
    }

    fun close() {
        isConnected = false
        runnable.closeSocket()
        stopPlugins()
    }

    fun registerPlugin(plugin: Plugin) {
        if (!plugins.containsValue(plugin)) {
            plugins[plugin.id] = plugin
            plugin.onRegister()
        }
    }

    fun unRegisterPlugin(plugin: Plugin) {
        if (plugins.containsValue(plugin)) {
            plugins.remove(plugin.id)
            plugin.onUnregister()
        }
    }

    fun write(packet: Packet) {
        doSocketAction {
            socketChannel?.register(selector, SelectionKey.OP_READ)

            packetWriter.write(packet)
        }
    }

    private fun doConnect() {
        if (isConnected) return
        logInfo { "socket connect config: ${config?.dump()}" }
        config?.run { executor.execute(runnable, this) }
        startPlugins()
    }

    private fun startPlugins() {
        plugins.forEach { it.value.onStart() }
    }

    private fun stopPlugins() {
        plugins.forEach { it.value.onStop() }
    }

    private fun connectSuccess() {
        write(Packet.getPacket(Operation.OP_AUTH.value))
        heartbeatPlugin.startHeartbeat()
        callback.onConnectSuccess(SystemClock.elapsedRealtime())
    }

    private fun closeResource() {
        try {
            socketChannel?.close()
            if (selector?.isOpen == true) {
                selector?.selectNow()
            }
            selector?.close()
        } catch (t: Exception) {
            logError(t) { "closeResource with exception" }
        }
    }

    private fun onSocketCloseWithError(errorCode: Int, errorMessage: String? = "") {
        closeResource()
        HandlerThreads.getHandler(HandlerThreads.THREAD_UI).post {
            close()
            val isNetAvailable = ConnectivityMonitor.getInstance().isNetworkActive
            logInfo { "onSocketCloseWithError  networkAvailable = $isNetAvailable, $errorMessage" }
            callback.onOpenFail(
                if (isNetAvailable) errorCode else ERROR_CODE_NETWORK_BROKEN,
                errorMessage
            )
        }
    }

    private fun logPacketError(t: Throwable) {
        logError(t) { "socket with exception" }
    }


    private fun initSocketChannel() {
        socketChannel = SocketChannel.open()
        socketChannel?.let {
            packetReader.channel = it
        }
    }

    private fun dealConnect() {
        // 判断是否连接上
        socketChannel?.apply {
            if (finishConnect()) {
                this@SocketClient.isConnected = true
                logInfo { "connectSocket: finishConnect" }
                connectSuccess()
                register(selector, SelectionKey.OP_READ)
            }
        }
    }

    private fun dealRead(key: SelectionKey) {
        messageReceived(packetReader.read())
        key.interestOps(SelectionKey.OP_READ)
    }

    private fun doSocketAction(action: () -> Unit) {
        try {
            action.invoke()
        } catch (e: UnknownHostException) {

            logPacketError(e)
            onSocketCloseWithError(ERROR_CODE_CONNECT_FAILED, e.message)
        } catch (e: UnresolvedAddressException) {

            logPacketError(e)
            onSocketCloseWithError(ERROR_CODE_CONNECT_FAILED, e.message)
        } catch (e: IllegalStateException) {

            logPacketError(e)
            onSocketCloseWithError(ERROR_CODE_OTHER, e.message)
        } catch (e: IOException) {

            logPacketError(e)
            onSocketCloseWithError(ERROR_CODE_CONNECT_FAILED, e.message)
        } catch (e: InterruptedException) {

            logPacketError(e)
            onSocketCloseWithError(ERROR_CODE_OTHER, e.message)
        } catch (e: JSONException) {

            logPacketError(e)
            onSocketCloseWithError(ERROR_CODE_PARSE_FAILED, e.message)
        } catch (e: RuntimeException) {

            logPacketError(e)
            onSocketCloseWithError(ERROR_CODE_READ_MSG_FAILED, e.message)
        } catch (t: Throwable) {

            logPacketError(t)
            onSocketCloseWithError(ERROR_CODE_OTHER, t.message)
        }
    }

    abstract fun messageReceived(packets: List<Packet>)

    private inner class SocketRunnable : Runnable, LiveLogger {
        @Volatile
        private var isStopThread = false
        private var connectTimeOut = 0L //外界设置一般为毫秒，内部使用nano(1000000L)
        private var lastConnectTimeoutCheckTimeNanos = 0L

        override fun run() {
            logInfo { "currentThreadName = ${Thread.currentThread().name}" }
            doSocketAction {
                lastConnectTimeoutCheckTimeNanos = System.nanoTime()
                doConnect()
                while (!isStopThread) {
                    runSocket()
                }
                logInfo { "socket thread been closed" }
                closeResource()
            }
        }

        /**
         * 连接后等待事件回调，处理各个事件
         * */
        private fun runSocket() {
            selector?.apply {
                //阻塞到有事件就绪
                selectKeys(this)

                if (selectedKeys().size == 0) {
                    checkConnTimeout()
                    return
                }
                val iterator = selectedKeys().iterator()
                while (iterator.hasNext()) {
                    val key = iterator.next()
                    iterator.remove()
                    when {
                        key.isConnectable -> dealConnect()
                        key.isReadable -> dealRead(key)
                    }
                }
                checkConnTimeout()
            }
        }

        /**
         * 执行socket连接初始化以及连接操作
         * */
        private fun doConnect() {
            connectTimeOut = (config?.connectTimeOut
                ?: SOCKET_CONNECT_TIMEOUT_DEFAULT) * 1000000L + System.nanoTime()
            logInfo { "connectSocket: connect to host = ${config?.host} , port = ${config?.port}" }
            initSocketChannel()
            selector = Selector.open()
            socketChannel?.apply {
                configureBlocking(false)
                //如果是同步阻塞则直接拿到结果，如果异步阻塞，则注册连接事件，等待回调
                callback.onStartConnect(SystemClock.elapsedRealtime())
                if (connect(InetSocketAddress("10.23.176.214", 5200))) {
                    logInfo { "connectSocket: connected sync" }
                    this@SocketClient.isConnected = true
                    connectSuccess()
                } else {
                    this@SocketClient.isConnected = false
                    register(selector, SelectionKey.OP_CONNECT)
                }
            }
        }

        /**
         * 关闭socket，同时终止线程
         * */
        fun closeSocket() {
            logInfo { "closeSocket = ${config?.dump()}" }
            isStopThread = true
        }

        private fun checkConnTimeout() {
            //每0.5s 检查下是否超时
            if (!isConnected) {
                val currentTimeNanos = System.nanoTime()
                if (currentTimeNanos - lastConnectTimeoutCheckTimeNanos >= SOCKET_SELECT_INTERVAL_TIME) {
                    lastConnectTimeoutCheckTimeNanos = currentTimeNanos
                    if (currentTimeNanos >= connectTimeOut) {
                        callback.onOpenFail(ERROR_CODE_CONNECT_TIMEOUT, "timeout")
                        closeSocket()
                    }
                }
            }
        }


        private fun selectKeys(selector: Selector) {
            try {
                var selectCnt = 0
                val currentTimeNano = System.nanoTime()
                while (!isStopThread) {
                    val selectTime = System.nanoTime()
                    if (currentTimeNano - selectTime + SOCKET_SELECT_INTERVAL_TIME < 0) {
                        break
                    }
                    val num = selector.select(SOCKET_CONNECT_TIMEOUT_CHECK_INTERVAL)
                    if (num == 0) {
                        selectCnt++
                    } else {
                        break
                    }

                    if (selectCnt > SOCKET_JDK_BUG_COUNT) {
                        logError { "encounter jdk bug" }
                        onSocketCloseWithError(ERROR_CODE_JDK_BUG)
                        break
                    }
                }
            } catch (e: Exception) {
                onSocketCloseWithError(ERROR_CODE_JDK_BUG)
                logError(e) { "select keys error" }
            }
        }

        override val logTag: String
            get() = "SocketRunnable"
    }

    companion object {
        const val TAG = "SocketClient"

        const val ERROR_CODE_CONNECT_FAILED = 100
        private const val ERROR_CODE_READ_MSG_FAILED = 101
        private const val ERROR_CODE_PARSE_FAILED = 102
        private const val ERROR_CODE_OTHER = 103
        const val ERROR_CODE_CONNECT_TIMEOUT = 104
        private const val ERROR_CODE_JDK_BUG = 105

        /**
         * 网络连接断开时，返回给上层的错误码
         */
        const val ERROR_CODE_NETWORK_BROKEN = 106
        private const val SOCKET_CONNECT_TIMEOUT_CHECK_INTERVAL = 500L
        private const val SOCKET_CONNECT_TIMEOUT_DEFAULT = 10000L //10s
        private const val SOCKET_SELECT_INTERVAL_TIME = 500 * 1000000L
        private const val SOCKET_JDK_BUG_COUNT = 512
    }
}