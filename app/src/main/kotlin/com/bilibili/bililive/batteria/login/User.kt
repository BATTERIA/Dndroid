package com.bilibili.bililive.batteria.login

import androidx.annotation.Keep

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/10/22 4:58 PM
 * @description:
 */
@Keep
class User(val id: Int, val userName: String, val password: String) {
    val test = 1
    fun print() {
        print(test + Test().testA)
    }

    class Test {
        val testA = 3
    }
}