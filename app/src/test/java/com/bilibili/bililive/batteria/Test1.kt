package com.bilibili.bililive.batteria

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/5/8
 * @description:
 */
open class SuperClass

class SubClass : SuperClass() {
    val aProp: Int = 0
    fun aFun(param: String): Long {
        return 0
    }
}