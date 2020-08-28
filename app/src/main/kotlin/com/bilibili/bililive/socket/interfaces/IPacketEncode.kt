package com.bilibili.bililive.socket.interfaces

import com.bilibili.bililive.socket.beans.Packet
import java.nio.ByteBuffer

interface IPacketEncode {
    fun encode(packet: Packet, buffer: ByteBuffer)
}