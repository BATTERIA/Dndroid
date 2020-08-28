package com.bilibili.bililive.socket.io

import com.bilibili.bililive.socket.beans.Packet
import com.bilibili.bililive.socket.interfaces.IPacketDecode
import com.bilibili.bililive.socket.interfaces.IPacketReader
import log.LiveLogger
import java.nio.channels.SocketChannel

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/8/25 5:19 PM
 * @description:
 */
class PacketReader(override val decode: IPacketDecode) : IPacketReader, LiveLogger {
    override var channel: SocketChannel? = null

    override fun read(): List<Packet> {
        decode.buffer.limit(decode.buffer.capacity())
        channel?.read(decode.buffer)
        decode.buffer.flip()
        return decode.decode()
    }

    companion object {
        private const val TAG = "PacketReaderImpl"

    }

    override val logTag: String
        get() = TAG
}