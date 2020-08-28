package com.bilibili.bililive.socket.interfaces

import com.bilibili.bililive.socket.beans.Packet
import java.nio.channels.SocketChannel

interface IPacketReader {
    val decode: IPacketDecode

    var channel: SocketChannel?

    fun read(): List<Packet>
}