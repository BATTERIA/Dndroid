package com.bilibili.bililive.socket.interfaces

import com.bilibili.bililive.socket.beans.Packet
import java.nio.channels.SocketChannel

interface IPacketWriter {
    val encode: IPacketEncode

    var channel: SocketChannel?

    fun write(packet: Packet)
}