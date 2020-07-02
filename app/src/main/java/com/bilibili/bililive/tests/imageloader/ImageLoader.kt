package com.bilibili.bililive.tests.imageloader

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import com.bilibili.bililive.tests.imageloader.cache.ImageCache
import com.bilibili.bililive.tests.imageloader.cache.MemoryCache
import java.net.URL
import java.util.concurrent.Executors

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/7/2 4:34 PM
 * @description:
 */
class ImageLoader {
    private val executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())
    private val handler = Handler(Looper.getMainLooper())

    var cache: ImageCache = MemoryCache()

    fun displayImage(imageView: ImageView, url: String) {
        imageView.tag = url
        executorService.submit {
            val bitmap = cache.get(url) ?: downloadImage(url) ?: return@submit

            if (imageView.tag == url) {
                updateImageView(bitmap, imageView)
            }
            cache.put(url, bitmap)
        }
    }

    private fun updateImageView(bitmap: Bitmap, imageView: ImageView) {
        handler.post {
            imageView.setImageBitmap(bitmap)
        }
    }

    private fun downloadImage(imageUrl: String): Bitmap? {
        return try {
            val url = URL(imageUrl)
            val conn = url.openConnection()
            val inputStream = conn.getInputStream()
            val bitmap = BitmapFactory.decodeStream(inputStream)
            inputStream.close()
            bitmap
        } catch (e: Exception) {
            null
        }
    }
}