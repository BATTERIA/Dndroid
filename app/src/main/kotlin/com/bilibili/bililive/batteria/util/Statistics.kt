package com.bilibili.bililive.batteria.util

import android.content.Context
import android.widget.Toast

object Statistics {
    var context: Context? = null
    var sum = 0L
    var count = 0

    fun start(cnt: Context) {
        context = cnt
    }

    fun end() {
//        sum = 0
//        count = 0
    }

    fun test(data: Long) {
        sum += data
        count++
        val time = sum / count
        Toast.makeText(context!!, "avg: ${time / 1000000000}s ${time / 1000000 % 1000}ms ${time % 1000000}ns $time", Toast.LENGTH_SHORT).show()
    }
}