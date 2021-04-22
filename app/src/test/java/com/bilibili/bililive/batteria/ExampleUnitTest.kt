package com.bilibili.bililive.batteria

import org.junit.Test
import java.lang.ref.PhantomReference
import java.lang.ref.ReferenceQueue
import java.lang.ref.WeakReference
import java.util.*
import kotlin.Comparator

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
//        TestClass().run()
        val s = TreeSet<TNode>(Comparator<TNode> { o1, o2 -> o1.level - o2.level })
        s.add(TNode(1,1))
        s.add(TNode(1,3))
        s.add(TNode(2,3))
    }
}

class TNode(val level: Int, val test: Int)

interface A

class B : A