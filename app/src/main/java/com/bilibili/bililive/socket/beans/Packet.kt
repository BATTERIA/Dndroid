package com.bilibili.bililive.socket.beans

import java.util.*

data class Packet(val header: Header, var body: List<Byte>?) {
    val id: String = UUID.randomUUID().toString()

    companion object {
        @JvmStatic
        fun getPacket(operation: Int): Packet = Packet(Header(0,
            Version.DEFAULT.value, operation), null)
    }
}