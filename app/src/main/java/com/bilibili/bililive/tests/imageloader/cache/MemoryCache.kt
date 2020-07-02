package com.bilibili.bililive.tests.imageloader.cache

import android.graphics.Bitmap
import android.os.Build
import android.util.LruCache

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/7/2 4:46 PM
 * @description:
 */
class MemoryCache : ImageCache {
    private val cache: LruCache<String, Bitmap>

    init {
        val maxMemory = (Runtime.getRuntime().maxMemory() / 1024).toInt()
        cache = object : LruCache<String, Bitmap>(maxMemory) {
            override fun sizeOf(key: String?, value: Bitmap?): Int {
                return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    (value?.allocationByteCount ?: 0) / 1024
                } else {
                    (value?.byteCount ?: 0) / 1024
                }
            }
        }
    }

    override fun get(url: String): Bitmap? {
        return cache[url]
    }

    override fun put(url: String, bitmap: Bitmap) {
        cache.put(url, bitmap)
    }
}