package com.bilibili.bililive.batteria.util

import android.util.Log

class DTimer(private val tag: String) {
    private var start = 0L
    fun start() {
        start = System.nanoTime()
    }

    fun end(msg: String): Long {
        // s:ms
        if (start == 0L) return 0L
        val time = System.nanoTime() - start
        Log.d(tag, "$msg ${time / 1000000000}s ${time / 1000000 % 1000}ms ${time % 1000000}ns $time")
        return time
    }
}