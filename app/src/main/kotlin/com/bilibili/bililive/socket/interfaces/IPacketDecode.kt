package com.bilibili.bililive.socket.interfaces

import com.bilibili.bililive.socket.beans.Packet
import java.nio.ByteBuffer

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/8/26 12:12 PM
 * @description:
 */
interface IPacketDecode {
    var buffer: ByteBuffer

    fun decode(): List<Packet>
}