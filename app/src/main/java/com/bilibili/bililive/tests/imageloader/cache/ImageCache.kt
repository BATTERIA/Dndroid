package com.bilibili.bililive.tests.imageloader.cache

import android.graphics.Bitmap

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/7/2 4:34 PM
 * @description:
 */
interface ImageCache {
    fun get(url: String): Bitmap?

    fun put(url: String, bitmap: Bitmap)
}