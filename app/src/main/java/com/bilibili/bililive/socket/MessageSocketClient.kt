package com.bilibili.bililive.socket

import android.support.annotation.NonNull
import android.text.TextUtils
import com.bilibili.bililive.socket.beans.Command
import com.bilibili.bililive.socket.beans.Operation
import com.bilibili.bililive.socket.beans.Packet
import com.bilibili.bililive.socket.beans.SocketType
import com.bilibili.bililive.socket.interfaces.IPacketReader
import com.bilibili.bililive.socket.interfaces.IPacketWriter
import com.bilibili.bililive.socket.interfaces.ISocketCallback
import com.bilibili.bililive.socket.interfaces.MessageHandler
import log.*
import org.json.JSONObject
import java.io.UnsupportedEncodingException
import java.nio.charset.Charset
import java.util.concurrent.ConcurrentHashMap

class MessageSocketClient(
    private val socketType: SocketType,
    packetReader: IPacketReader,
    packetWriter: IPacketWriter,
    callback: ISocketCallback
) : SocketClient(packetReader, packetWriter, callback) {

    private val messageHandlers = ConcurrentHashMap<String, MessageHandler>()
    private var hybridHandler: MessageHandler? = null


    override fun messageReceived(packets: List<Packet>) {
        packets.forEach { packet ->
            packet.body?.let {
                handleBufferInfo(packet.header.operation, it)
            }
        }
    }

    fun addMessageHandler(@NonNull handler: MessageHandler): MessageSocketClient {
        /*
         * 获取配置可拦截的CMD命令
         */
        val command: Command = handler::class.java.getAnnotation(Command::class.java)
        for (value in command.value) {
            messageHandlers[value] = handler
        }
        return this
    }

    fun setMessageHandlerForHybrid(handler: MessageHandler) {
        hybridHandler = handler
    }

    private fun handleBufferInfo(operation: Int, body: List<Byte>) {
        callback.onMessageDecompressed(body.size + PACKET_HEAD_LENGTH)
        when (operation) {
            Operation.OP_AUTH_REPLY.value -> parseAuthMsg(body)
            Operation.OP_HEARTBEAT_REPLY.value -> parseEchoMsg(body)
            Operation.OP_SEND_SMS_REPLY.value -> parseMsg(body)
            else -> {
                logInfo { "undefined operation: $operation" }
                callback.onReceiveInvalidMsg()
            }
        }
    }

    // 分析服务器推送的弹幕消息包
    private fun parseMsg(body: List<Byte>) {
        try {
            val dataJson = String(body.toByteArray(), Charset.forName("UTF-8"))
            if (!TextUtils.isEmpty(dataJson) && dataJson.startsWith("{")) {
                parseJson(dataJson)
            } else {
                callback.onMessageReceived(dataJson)
            }
        } catch (e: UnsupportedEncodingException) {
            logWarn(e) { e.message }
        }
    }

    // 服务器收到鉴权包后的回复
    private fun parseAuthMsg(body: List<Byte>) {
        try {
            val dataJson = String(body.toByteArray(), Charset.forName("UTF-8"))
            if (!TextUtils.isEmpty(dataJson) && dataJson.startsWith("{")) {
                val code = JSONObject(dataJson).optInt("code", Int.MIN_VALUE)
                if (code == AUTH_SUCCESS_CODE) {
                    callback.onAuthSuccess()
                } else {
                    callback.onAuthFail(code)
                }
            } else {
                callback.onMessageReceived(dataJson)
            }
        } catch (e: UnsupportedEncodingException) {
            logWarn(e) { e.message }
        }
    }

    // 服务器收到心跳包的回复
    private fun parseEchoMsg(body: List<Byte>) {
        try {
            val onlineNumber = bytesToInt(body.slice(IntRange(0, 3)))
            if (onlineNumber >= 0) {
                callback.updateOnlineNumber(onlineNumber)
            }
        } catch (e: Exception) {
            logWarn(e) { e.message }
        }
    }

    private fun parseJson(json: String) {
        if (TextUtils.isEmpty(json)) {
            logInfo { "onMessageReceived json is empty " }
            return
        }
        try {
            val obj = JSONObject(json)
            var cmd = obj.optString("cmd")
            val cmds: Array<String>
            var switches: IntArray? = null
            if (cmd.contains(":")) {
                cmds = cmd.split(":").toTypedArray()
                logDebug { "onMessageReceived cmd = " + cmds.contentToString() }

                if (cmds.size == CMD_NUM_LENGTH) {
                    cmd = cmds[0]
                    switches = getSwitches(cmds)
                } else {
                    logError { "onMessageReceived cmd error = " + cmds.size + " return" }
                    return
                }
            }
            if (CMD_DANMU != cmd && CMD_SEND_GIFT != cmd && CMD_COMBO_SEND != cmd) {
                logInfo { "onMessageReceived = $json" }
            }
            var handled = false
            if (messageHandlers.containsKey(cmd)) {
                handled = messageHandlers[cmd]?.onMessageReceived(cmd, obj, switches) ?: false
            }
            // default handle
            if (!handled) {
                logError { "onMessageReceived error cmd = $cmd" }
                callback.onMessageReceived(json)
            }
            hybridHandler?.onMessageReceived(cmd, obj, null)
        } catch (e: java.lang.Exception) {
            logError(e) { "ops, error on danmaku message handle" }
        }
    }

    @Throws(NumberFormatException::class)
    private fun intToBinaryString(n: String): IntArray? {
        val switches = IntArray(SWITCH_NUM_LENGTH)
        val binary = Integer.toBinaryString(Integer.valueOf(n))
        val result = binary.toCharArray()
        val resultLength = result.size
        for (i in 1..SWITCH_NUM_LENGTH) {
            if (resultLength < i) {
                break
            }
            if (Character.isDigit(result[resultLength - i])) {  // 判断是否是数字
                switches[SWITCH_NUM_LENGTH - i] =
                    result[resultLength - i].toString().toInt()
            }
        }
        return switches
    }

    private fun getSwitches(cmds: Array<String>): IntArray? {
        return if (SocketType.PLAY_TYPE == socketType) {
            intToBinaryString(cmds[2])
        } else {
            intToBinaryString(cmds[1])
        }
    }

    private fun bytesToInt(src: List<Byte>): Int {
        return (src[0].toInt().and(0xFF).shl(24))
            .or(src[1].toInt().and(0xFF).shl(16))
            .or(src[2].toInt().and(0xFF).shl(8))
            .or(src[3].toInt().and(0xFF))
    }

    override val logTag: String
        get() = TAG

    companion object {
        private const val PACKET_HEAD_LENGTH = 16
        private const val AUTH_SUCCESS_CODE = 0
        private const val CMD_NUM_LENGTH = 7
        private const val SWITCH_NUM_LENGTH = 3
        private const val CMD_DANMU = "DANMU_MSG"
        private const val CMD_SEND_GIFT = "SEND_GIFT"
        private const val CMD_COMBO_SEND = "COMBO_SEND"
    }
}