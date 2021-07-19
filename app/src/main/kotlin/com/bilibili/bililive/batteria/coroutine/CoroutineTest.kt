package com.bilibili.bililive.batteria.coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/6/4
 * @description:
 */
class CoroutineTest {
    init {

    }

    suspend fun test() {
        withContext(Dispatchers.IO) {

        }
    }
}