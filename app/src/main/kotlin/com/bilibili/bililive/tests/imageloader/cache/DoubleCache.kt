package com.bilibili.bililive.tests.imageloader.cache

import android.content.Context
import android.graphics.Bitmap

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/7/2 7:07 PM
 * @description:
 */
class DoubleCache(context: Context) : ImageCache {
    private val diskCache = DiskCache(context)
    private val memoryCache = MemoryCache()

    override fun get(url: String): Bitmap? {
        return memoryCache.get(url) ?: diskCache.get(url)
    }

    override fun put(url: String, bitmap: Bitmap) {
        memoryCache.put(url, bitmap)
        diskCache.put(url, bitmap)
    }
}