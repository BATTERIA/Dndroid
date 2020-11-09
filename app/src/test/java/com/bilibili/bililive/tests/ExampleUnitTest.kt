package com.bilibili.bililive.tests

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        var a: A? = null
        var b: B? = B()
        println("1")
        test(b ?: return)
        println("2")
    }

    fun test( b: B) {
        println("enter test")
    }
}

class C(val cc: String = "cc")

class A(var c: C? = null) {
    fun a() {
        println(c?.cc)
    }
}

class B(val c: C? = null) {
    fun a() {
        println(c?.cc)
    }
}