package com.bilibili.bililive.socket

import android.text.TextUtils
import com.bilibili.bililive.socket.beans.Operation
import com.bilibili.bililive.socket.beans.Packet
import com.bilibili.bililive.socket.interfaces.IPacketReader
import com.bilibili.bililive.socket.interfaces.IPacketWriter
import com.bilibili.bililive.socket.interfaces.ISocketCallback
import log.logInfo
import log.logWarn
import org.json.JSONObject
import java.io.UnsupportedEncodingException
import java.nio.charset.Charset

class MessageSocketClient(
    packetReader: IPacketReader,
    packetWriter: IPacketWriter,
    callback: ISocketCallback
) : SocketClient(packetReader, packetWriter, callback) {
    override fun messageReceived(packets: List<Packet>) {
        packets.forEach {packet->
            packet.body?.let {
                handleBufferInfo(packet.header.operation, it)
            }
        }
    }

    private fun handleBufferInfo(operation: Int, body: List<Byte>) {
//        mListener?.onMessageDecompressed(payloadLength + HEAD_LENGTH)
        when (operation) {
            Operation.OP_AUTH_REPLY.value -> parseAuthMsg(body)
            Operation.OP_HEARTBEAT_REPLY.value -> parseEchoMsg(body)
            Operation.OP_SEND_SMS_REPLY.value -> parseMsg(body)
            else -> {
                logInfo { "undefined operation: $operation" }
//                mListener?.onReceiveInvalidMsg()
            }
        }
    }

    // 分析服务器推送的弹幕消息包
    private fun parseMsg(body: List<Byte>) {
        try {
            val dataJson = String(body.toByteArray(), Charset.forName("UTF-8"))
            if (!TextUtils.isEmpty(dataJson) && dataJson.startsWith("{")) {
//                mListener?.onMessageReceived(dataJson)
            } else {
//                mListener?.onCommandReceived(dataJson)
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
//                    mListener?.onAuthSuccess()
                } else {
//                    mListener?.onAuthFail(code)
                }
            } else {
//                mListener?.onCommandReceived(dataJson)
            }
        } catch (e: UnsupportedEncodingException) {
            logWarn(e) { e.message }
        }
    }

    // 服务器收到心跳包的回复
    private fun parseEchoMsg(body: List<Byte>) {
        try {
            val onlineNumber = bytesToInt(body.slice(IntRange(0,3)))
            if (onlineNumber >= 0) {
//                mListener?.onOnlineNumberUpdate(onlineNumber)
            }
        } catch (e: Exception) {
            logWarn(e) { e.message }
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
        private const val AUTH_SUCCESS_CODE = 0
    }
}