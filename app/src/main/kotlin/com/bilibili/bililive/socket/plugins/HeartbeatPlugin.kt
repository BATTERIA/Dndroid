package com.bilibili.bililive.socket.plugins

import android.os.Build
import android.os.Handler
import android.os.HandlerThread
import com.bilibili.bililive.socket.beans.Packet
import com.bilibili.bililive.socket.interfaces.Plugin

class HeartbeatPlugin(dealWrite: (packet: Packet) -> Unit) : Plugin {
    private var handlerThread = HandlerThread(TAG)
    private var handler: Handler? = null

    init {
        handler = Handler(handlerThread.looper, Handler.Callback { msg ->
            when (msg?.what) {
                HEART_BEAT -> {
                    dealWrite(Packet.getPacket(OPERATION_ECHO))
                    handler?.sendMessageDelayed(
                        handler?.obtainMessage(HEART_BEAT),
                        HEART_BEAT_INTERVAL
                    )
                    true
                }
                else -> false
            }
        })
    }

    override val id: String
        get() = ID

    override fun onRegister() {
        TODO("Not yet implemented")
    }

    override fun onUnregister() {
        TODO("Not yet implemented")
    }

    override fun onStart() {
        handlerThread.start()

    }

    override fun onStop() {
        handler?.removeCallbacksAndMessages(null)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
            handlerThread.quitSafely()
        } else {
            handlerThread.quit()
        }
    }

    companion object {
        const val ID = "socket.heartbeat"
        private const val TAG = "HeartbeatPlugin"

        /**
         * socket连接成功后鉴权消息类型
         */
        private const val OPERATION_AUTH = 7

        /**
         * socket连接成功后更新在线人数消息类型
         */
        private const val OPERATION_ECHO = 2

        /**
         * 心跳包消息
         */
        private const val HEART_BEAT = 0

        /**
         * 心跳包间隔
         */
        private const val HEART_BEAT_INTERVAL = 30000L
    }
}