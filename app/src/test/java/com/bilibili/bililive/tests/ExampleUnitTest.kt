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

        println(strStr("mississippi", "pi"))
    }

    // BM算法
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) return 0
        val size = needle.length
        val bmBc = bc(needle)
        val suff = suffix(needle)
        val bmGs = gs(suff, needle)
        val m = needle.length
        var a = m - 1
        while (a < haystack.length) {
            var add = 0
            var j = m-1
            for (i in a downTo a - m + 1) {
                if (haystack[i] != needle[j]) {
                    add = max(bmGs[j], j - bmBc[needle[j].toInt()])
                    break
                }
                --j
            }
            if (0 == add) return a - m + 1
            a += add
        }
        return -1
    }

    // suffix
    fun suffix(needle: String): List<Int> {
        val m = needle.length
        val list = MutableList(m) { m }
        // 剪枝策略
        var lastStart = m - 1
        for (i in (m - 2) downTo 0) {
            var j = m - 1
            var k = i

            val lastEnd = lastStart - list[lastStart]
            if (i > lastEnd && list[m - 1 - (lastStart - i)] < i - lastEnd) {
                list[i] = list[m - 1 - (lastStart - i)]
                continue
            }
            var s = 0
            while (k >= 0 && needle[j] == needle[k]) {
                ++s
                --j
                --k
            }
            list[i] = s
        }
        return list
    }

    // 寻找好后缀，最长子串
    fun gs(suff: List<Int>, needle: String): List<Int> {
        val m = needle.length
        val list = MutableList(m) { m }

        var j = 0
        for (i in m - 1 downTo 0) {
            if (suff[i] == i + 1) {
                while (j < m - 1 - i) {
                    list[j] = m - 1 - i
                    ++j
                }
            }
        }

        for (i in 0..m - 2) {
            list[m - 1 - suff[i]] = m - 1 - i
        }
        return list
    }

    // 寻找坏字符，只考虑第一个匹配的坏字符，如果是负数就只+1
    fun bc(needle: String): List<Int> {
        val size = needle.length
        val list = MutableList(128) { size }

        for (i in needle.indices) {
            list[needle[i].toInt()] = i
        }
        return list
    }
}
