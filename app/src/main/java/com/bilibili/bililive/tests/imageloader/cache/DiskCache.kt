package com.bilibili.bililive.tests.imageloader.cache

import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Log
import java.io.FileOutputStream

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/7/2 6:27 PM
 * @description:
 */
class DiskCache(context: Context) : ImageCache {
    private val cacheDir: String = context.cacheDir.path

    override fun get(url: String): Bitmap? {
        val bitmap = BitmapFactory.decodeFile("${cacheDir}url")
        bitmap?.let { Log.d(TAG, "got bitmap from disk cache") }
        return bitmap
    }

    override fun put(url: String, bitmap: Bitmap) {
        try {
            val outputStream = FileOutputStream("${cacheDir}url")
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
            outputStream.close()
        } catch (e: Exception) {
            Log.d(TAG, e.toString())
        }
    }

    companion object {
        private const val TAG = "DiskCache"
    }
}