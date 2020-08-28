package com.bilibili.bililive.socket.io

import android.content.Context
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.os.Build
import com.bilibili.bililive.socket.beans.Packet
import com.bilibili.bililive.socket.interfaces.IPacketEncode
import log.LiveLogger
import log.logDebug
import org.json.JSONObject
import java.nio.ByteBuffer

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/8/25 2:45 PM
 * @description:
 */
class PacketEncode @JvmOverloads constructor(
    private val uid: Long,
    private val identityId: Long, //直播间传roomid,回放间传vid
    private val token: String = "",
    private val group: String = ""
) : IPacketEncode, LiveLogger {
    private val mAppVersion: String by lazy {
        StringBuilder()
//            .append(getCurrentVersionName(BiliContext.application()))
            .append(".")
//            .append(getCurrentVersionCode(BiliContext.application()))
            .toString()
    }

    override fun encode(packet: Packet, buffer: ByteBuffer) {
        buffer.clear()
        val byteArray = getBody(packet)
        attachHead(buffer, packet, byteArray.size)
        buffer.put(byteArray)
    }

    /**
     * 给消息添加头部
     */
    private fun attachHead(buffer: ByteBuffer, packet: Packet, msgSize: Int) {
        val allSize = msgSize + HEAD_LENGTH
        buffer.limit(allSize)
        buffer.putInt(allSize)
        buffer.putShort(packet.header.headerLength)
        buffer.putShort(packet.header.version)
        buffer.putInt(packet.header.operation)
        buffer.putInt(packet.header.sequence)
    }

    private fun getBody(packet: Packet): ByteArray {
        packet.body?.run { return toByteArray() }
        val bodyJson = JSONObject()
        if (packet.header.operation == OPERATION_AUTH) {
            bodyJson.put("group", group)
            bodyJson.put("uid", uid)
            bodyJson.put("roomid", identityId)
            bodyJson.put("key", token)
            bodyJson.put("platform", "android")
            bodyJson.put("clientver", mAppVersion)
//            BiliContext.application()?.run {
//                val deviceId = HwIdHelper.getDid(this)
//                if (!TextUtils.isEmpty(deviceId)) {
//                    bodyJson.put("hwid", deviceId)
//                }
//                if (isUpperLollipop()) {
//                    bodyJson.put("protover", 2)
//                } else {
//                    bodyJson.put("protover", 0)
//                }
//            }
        }
        val msg = bodyJson.toString()
        logDebug { "encode msg is $msg" }
        return msg.toByteArray(Charsets.UTF_8)
    }

    private fun isUpperLollipop(): Boolean {
        return Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP
    }

    private fun getCurrentVersionName(context: Context?): String {
        if (context == null) {
            return UNKNOWN_VERSION_NAME
        }
        val manager = context.packageManager
        val info: PackageInfo
        try {
            info = manager.getPackageInfo(context.packageName, 0)
        } catch (e: PackageManager.NameNotFoundException) {
            return UNKNOWN_VERSION_NAME
        }

        return info.versionName
    }

    private fun getCurrentVersionCode(context: Context?): Int {
        if (context == null) {
            return UNKNOWN_VERSION_CODE
        }
        val manager = context.packageManager
        val info: PackageInfo
        try {
            info = manager.getPackageInfo(context.packageName, 0)
        } catch (e: PackageManager.NameNotFoundException) {
            return UNKNOWN_VERSION_CODE
        }

        return info.versionCode
    }

    companion object {
        private const val TAG = "PacketEncode"
        private const val UNKNOWN_VERSION_NAME = "Unknown"
        private const val UNKNOWN_VERSION_CODE = 1
        private const val HEAD_LENGTH = 16

        /**
         * socket连接成功后鉴权消息类型
         * */
        private const val OPERATION_AUTH = 7
    }

    override val logTag: String
        get() = TAG
}