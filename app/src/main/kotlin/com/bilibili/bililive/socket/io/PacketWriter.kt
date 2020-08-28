package com.bilibili.bililive.socket.io

import com.bilibili.bililive.socket.beans.Packet
import com.bilibili.bililive.socket.interfaces.IPacketWriter
import java.nio.ByteBuffer
import java.nio.channels.SocketChannel

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/8/26 11:37 AM
 * @description:
 */
class PacketWriter(override val encode: PacketEncode) : IPacketWriter {
    override var channel: SocketChannel? = null

    private var writeBuffer = ByteBuffer.allocate(MAX_SIZE)

    override fun write(packet: Packet) {
        encode.encode(packet, writeBuffer)
        writeBuffer.rewind()
        while (writeBuffer.hasRemaining()) {
            channel?.write(writeBuffer)
        }
        writeBuffer.clear()
    }

    companion object {
        //由于目前写入信息比较少，暂定为4096，如果后期业务拓展可能需要扩容
        private const val MAX_SIZE = 4096
    }
}