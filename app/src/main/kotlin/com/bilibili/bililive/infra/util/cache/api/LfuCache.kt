package com.bilibili.bililive.infra.util.cache.api

import androidx.collection.ArrayMap
import java.util.*

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/3/2 13:20 PM
 * @description:
 */
class LfuCache<K, V> : Cache<K, V> {
    // 缓存容量
    private var mCapacity: Int = 25

    // 缓存过期时间
    private var mTimeout: Int = 150

    // 最小使用频率
    private var mMinFreq: Int = 0

    // use HashMap when capacity is very large(>1000)
    // 记录元数据
    private val mKeyMap = ArrayMap<K, Node>()
    // 相同使用频率的数据使用链表保存
    private val mFreqMap = ArrayMap<Int, LinkedList<Node>>()

    fun setCapacity(capacity: Int) {
        if (capacity <= 0) return
        mCapacity = capacity
    }

    fun setTimeout(timeout: Int) {
        if (timeout <= 0) return
        mTimeout = timeout
    }

    override fun get(key: K): V? {
        val node = mKeyMap[key] ?: return null
        val value = node.value
        updateFreq(node, key, value)
        return value
    }

    override fun put(key: K, value: V) {
        val node = mKeyMap[key]
        if (node == null) {
            if (mKeyMap.size == mCapacity) {
                mFreqMap[mMinFreq]?.last?.let {
                    mKeyMap.remove(it.key)
                    mFreqMap[mMinFreq]?.removeLast()
                    if (mFreqMap.isEmpty()) mFreqMap.remove(mMinFreq)
                }
            }
            val initNode = Node(key, value, 1)
            if (mFreqMap[1] == null) mFreqMap[1] = LinkedList()
            mFreqMap[1]?.addFirst(initNode)
            mKeyMap[key] = initNode
            mMinFreq = 1
        } else {
            updateFreq(node, key, value)
        }
    }

    private fun updateFreq(node: Node, key: K, value: V) {
        val freq = node.freq
        mFreqMap[freq]?.let {
            it.remove(node)
            if (it.isEmpty()) {
                mFreqMap.remove(freq)
                if (mMinFreq == freq) mMinFreq++
            }
        }
        if (mFreqMap[freq + 1] == null) mFreqMap[freq + 1] = LinkedList()
        val updateNode = Node(key, value, freq + 1)
        mFreqMap[freq + 1]?.addFirst(updateNode)
        mKeyMap[key] = updateNode
    }

    companion object {
        fun <K, V> newInstance(capacity: Int, timeout: Int): Cache<K, V> {
            return LfuCache<K, V>().apply {
                mCapacity = capacity
                mTimeout = timeout
            }
        }
    }

    inner class Node(val key: K, val value: V, val freq: Int)
}