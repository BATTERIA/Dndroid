package com.bilibili.bililive.batteria


import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

import androidx.collection.ArrayMap
import java.util.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    // 记录缓存时间
    private val mTimeList = TreeSet<TimeData>()

    @Test
    fun useAppContext() {
        val t = Test1()
//        val b: Map<String, Any> = t.map
//        val l: MutableList<out Fruit> = mutableListOf<Apple>()
//        t.test()
//        val a = mTimeList.pollLast()
//        mTimeList.add(TimeData("3", 1222))
        val a = t.findCircleNum(arrayOf(intArrayOf(1,1,0),intArrayOf(1,1,0),intArrayOf(0,0,1)))
        print(a)
    }

    interface Fruit

    class Apple : Fruit
}

data class TimeData(val key: String, val cacheTime: Long) : Comparable<TimeData> {
    override fun compareTo(other: TimeData): Int = (cacheTime - other.cacheTime).toInt()
}

class LfuCacheImpl<K, V> {
    // 缓存容量
    private var mCapacity: Int = 25

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

    fun get(key: K): V? {
        val node = mKeyMap[key] ?: return null
        val value = node.value
        updateFreq(node, key, value)
        return value
    }

    fun put(key: K, value: V) {
        val node = mKeyMap[key]
        if (node == null) {
            if (mKeyMap.size == mCapacity) {
                mFreqMap[mMinFreq]?.last?.let {
                    mKeyMap.remove(it.key)
                    mFreqMap[mMinFreq]?.let { list ->
                        list.removeLast()
                        if (list.isEmpty()) mFreqMap.remove(mMinFreq)
                    }
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
        fun <K, V> newInstance(capacity: Int, timeout: Int): LfuCacheImpl<K, V> {
            return LfuCacheImpl<K, V>().apply {
                mCapacity = capacity
            }
        }
    }

    private inner class Node(val key: K, val value: V, val freq: Int)
}