package com.bilibili.bililive.socket.io

import android.os.Build
import android.support.annotation.VisibleForTesting
import com.bilibili.bililive.socket.beans.*
import com.bilibili.bililive.socket.interfaces.IPacketDecode
import com.bilibili.bililive.socket.utils.ZLibUtils
import log.LiveLogger
import log.logError
import log.logInfo
import java.nio.ByteBuffer
import kotlin.math.min

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/8/26 12:14 PM
 * @description:
 */
class PacketDecode : IPacketDecode, LiveLogger {
    override var buffer: ByteBuffer = ByteBuffer.allocate(MIN_BUFFER_SIZE)

    override fun decode(): List<Packet> {
        val packets = mutableListOf<Packet>()
        while (buffer.hasRemaining()) {
            packets.addAll(encodePacket() ?: return packets)
        }
        buffer.clear()
        return packets
    }

    private fun encodePacket(): List<Packet>? {
        if (buffer.limit() < HEADER_LENGTH) {
            buffer.position(buffer.limit())
            return null
        }

        val header = findHeader() ?: return null
        val bodyLength = header.length - HEADER_LENGTH

        // buffer空间不足，需要扩容
        if (header.length > buffer.capacity()) {
            buffer = grow(buffer, header.length)
            // 扩容失败,抛弃异常数据包
            if (header.length > buffer.capacity()) {
                buffer.clear()
                return null
            }
        }

        // 出现粘包情况, body数据不足, 等待服务端数据
        if (buffer.remaining() < bodyLength) {
            logInfo { "return cause packet is't enough, wait for server" }
            buffer.position(buffer.limit())
            return null
        }

        val byteArray =
            buffer.array().slice(IntRange(buffer.position(), buffer.position() + bodyLength))

        buffer.position(buffer.position() + bodyLength)
        if (buffer.hasRemaining()) {
            buffer.compact()
        }

        return if (header.version == Version.COMPRESS.value) {
            getCompressedPackets(byteArray)
        } else {
            listOf(Packet(header, byteArray))
        }
    }

    /**
     * 搜索数据头位置
     * (头部可能存在脏数据，例如粘包情况下的前一个包没有接收到)
     */
    private fun findHeader(): Header? {
        var headerLength: Short = -1
        var version: Short = -1
        var operation = -1
        for (i in 4..buffer.limit() - 12) {
            buffer.position(i)
            headerLength = buffer.short
            if (headerLength == HEADER_LENGTH) {
                version = buffer.short
                operation = buffer.int
                if (Version.values().any { it.value == version } && Operation.values()
                        .any { it.value == operation }) {
                    break
                } else {
                    headerLength = -1
                    version = -1
                    operation = -1
                }
            }
        }

        if (headerLength != HEADER_LENGTH) {
            // 未找到数据头，保留最后15个字节，可能包含下一个的头信息
            logInfo { "didn't find header" }
            buffer.position(buffer.limit() - 11)
            buffer.compact()
            return null
        }

        buffer.position(buffer.position() - 12)
        val packetLength = buffer.int
        buffer.position(buffer.position() + 12)

        if (packetLength - HEADER_LENGTH <= 0) {
            // body长度需要大于0, 否则向后继续扫描header
            logInfo { "header error: body length <= 16" }
            buffer.compact()
            return findHeader()
        }

        return Header(packetLength, version, operation)
    }

    /**
     * 解压body
     */
    private fun getCompressedPackets(compressedBody: List<Byte>): List<Packet>? {
        val bytes = ZLibUtils.decompress(compressedBody.toByteArray())
        val byteBuffer = ByteBuffer.wrap(bytes)

        var position = 0
        val packets = mutableListOf<Packet>()

        while (byteBuffer.limit() > position) {
            byteBuffer.position(position)
            val packetLength = byteBuffer.int
            val headerLength = byteBuffer.short
            val version = byteBuffer.short
            if (headerLength != HEADER_LENGTH || packetLength < headerLength) {
                byteBuffer.clear()
                return packets
            }

            val operation = byteBuffer.int
            byteBuffer.position(position + HEADER_LENGTH)

            val bodyLength = packetLength - headerLength

            val byteArray =
                byteBuffer.array().slice(IntRange(byteBuffer.position(), byteBuffer.position() + bodyLength))
            packets.add(Packet(Header(packetLength, version, operation), byteArray))

            position += packetLength
        }
        return packets
    }

    /**
     * ByteBuffer扩容
     * @param exceptSize 期望的大小，不一定是size，而是包的长度
     * @return 如果成功扩容返回新的Buffer，否则返回传入的buffer
     * */
    @VisibleForTesting
    fun grow(buffer: ByteBuffer, exceptSize: Int): ByteBuffer {
        val currentCapacity = buffer.capacity()
        val maxDeviceSize = getDeviceMaxSize()
        if (currentCapacity > exceptSize) {
            logError { "grow but currentCapacity=$currentCapacity > maxDeviceSize" }
            return buffer
        }
        if (maxDeviceSize == currentCapacity) {
            logError { "grow but currentCapacity=$currentCapacity == maxDeviceSize" }
            return buffer
        }
        if (maxDeviceSize < exceptSize) {
            logError { "grow but currentCapacity=$exceptSize out of max" }
            return buffer
        }
        return capacityAndCopy(buffer, calculateNewCapacity(exceptSize))
    }

    @Throws(Exception::class)
    private fun capacityAndCopy(oldBuffer: ByteBuffer, newCapacity: Int): ByteBuffer {
        val mLastRecord =
            BufferRecord(oldBuffer.position(), oldBuffer.limit(), oldBuffer.capacity())
        val newBuffer = ByteBuffer.allocate(newCapacity)
        oldBuffer.position(0).limit(oldBuffer.capacity())
        newBuffer.position(0).limit(oldBuffer.capacity())
        newBuffer.put(oldBuffer)
        resetBufferRecord(mLastRecord, newBuffer)
        return newBuffer
    }

    private fun resetBufferRecord(record: BufferRecord, buffer: ByteBuffer) {
        buffer.position(record.limit)
        buffer.limit(record.capacity)
    }

    private fun calculateNewCapacity(exceptSize: Int): Int {
        val maxDeviceSize = getDeviceMaxSize()
        val times = exceptSize / MIN_BUFFER_SIZE
        var newCapacity = MIN_BUFFER_SIZE
        var i = 1
        while (i < times) {
            i *= 2
            newCapacity = newCapacity.shl(1)
        }
        //因为times取余，且单位是MIN_BUFFER_SIZE。所以又可能出现newCapacity < exceptSize情况
        if (newCapacity < exceptSize) {
            newCapacity = newCapacity.shl(1)
        }
        return min(newCapacity, maxDeviceSize)
    }

    @VisibleForTesting
    fun getDeviceMaxSize(): Int {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            BUFFER_SIZE_1M
        } else {
            BUFFER_SIZE_512K
        }
    }

    companion object {
        private const val TAG = "PacketDecode"
        private const val HEADER_LENGTH: Short = 16

        @VisibleForTesting
        const val MIN_BUFFER_SIZE = 0x10000
        private const val BUFFER_SIZE_512K = 0x80000
        private const val BUFFER_SIZE_1M = 0xfffff
    }

    override val logTag: String
        get() = TAG
}