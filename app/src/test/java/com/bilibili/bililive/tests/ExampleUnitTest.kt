package com.bilibili.bililive.tests

import org.junit.Test
import kotlin.math.abs
import kotlin.math.min


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        println(divisorGame(3))
    }

    fun divisorGame(N: Int): Boolean {
        return N % 2 == 0
    }
}
