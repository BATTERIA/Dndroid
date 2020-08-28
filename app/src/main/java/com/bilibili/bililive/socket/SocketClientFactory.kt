package com.bilibili.bililive.socket

import com.bilibili.bililive.socket.beans.SocketType
import com.bilibili.bililive.socket.interfaces.IPacketReader
import com.bilibili.bililive.socket.interfaces.IPacketWriter
import com.bilibili.bililive.socket.interfaces.ISocketCallback
import com.bilibili.bililive.socket.io.PacketDecode
import com.bilibili.bililive.socket.io.PacketEncode
import com.bilibili.bililive.socket.io.PacketReader
import com.bilibili.bililive.socket.io.PacketWriter

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/8/25 2:27 PM
 * @description:
 */
object SocketClientFactory {
    fun build(
        socketType: SocketType,
        uid: Long,
        identityId: Long,
        token: String,
        group: String,
        callback: ISocketCallback
    ): SocketClient = MessageSocketClient(
        socketType,
        PacketReader(PacketDecode()),
        PacketWriter(PacketEncode(uid, identityId, token, group)),
        callback
    )

    fun build(
        socketType: SocketType,
        packetReader: IPacketReader,
        packetWriter: IPacketWriter,
        callback: ISocketCallback
    ): SocketClient = MessageSocketClient(socketType, packetReader, packetWriter, callback)
}