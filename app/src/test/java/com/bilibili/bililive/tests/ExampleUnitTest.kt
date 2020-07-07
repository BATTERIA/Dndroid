package com.bilibili.bililive.tests

import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.math.max

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)

        println(strStr("hello", "ll"))
    }

    // BM算法
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0
        val bmBc = bc(needle)
        val suff = suffix(needle)
        val bmGs = gs(suff, needle)
        val m = needle.length
        var a = m - 1
        while(a < haystack.length) {
            var add = 0
            for (i in a until a - m) {
                if (haystack[i] != needle[i]) {
                    add = max(bmGs[i], bmBc[needle[i]] ?: 0)
                }
            }
            if (0 == add) return a - m + 1
            a += add
        }
        return -1
    }

    // suffix
    fun suffix(needle: String): List<Int> {
        val m = needle.length
        val list = MutableList(m) { 0 }
        list[m - 1] = m
        // 剪枝策略
        var lastStart = m - 1
        for (i in m - 1..0) {
            var j = m - 1
            var k = i

            val lastEnd = lastStart - list[lastStart]
            if (i > lastEnd && list[m - 1 - (lastStart - i)] < i - lastEnd) {
                list[i] = list[m - 1 - (lastStart - i)]
                continue
            }

            while (needle[j] == needle[k] && k >= 0) {
                --j
                --k
            }
            list[i] = i - k
        }
        return list
    }

    // 寻找好后缀，最长子串
    fun gs(suff: List<Int>, needle: String): List<Int> {
        val m = needle.length
        val list = MutableList(m) { m }

        for (i in m - 1..0) {
            if (suff[i] == i + 1) {
                for (j in 0..m - 1 - i) {
                    list[j] = m - 1 - i
                }
            }
        }

        for (i in 0..m - 2) {
            list[m - 1 - suff[i]] = m - 1 - i
        }
        return list
    }

    // 寻找坏字符，只考虑第一个匹配的坏字符，如果是负数就只+1
    fun bc(needle: String): Map<Char, Int> {
        val map = mutableMapOf<Char, Int>()
        for (i in needle.indices) {
            map[needle[i]] = i
        }
        return map
    }
}
