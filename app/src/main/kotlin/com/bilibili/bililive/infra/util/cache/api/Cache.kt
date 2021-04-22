package com.bilibili.bililive.infra.util.cache.api

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/3/2 13:20 PM
 * @description:
 */
interface Cache<K, V> {
    fun get(key: K): V?
    fun put(key: K, value: V)
}