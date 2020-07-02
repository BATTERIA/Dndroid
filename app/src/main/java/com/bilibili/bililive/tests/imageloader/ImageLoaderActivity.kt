package com.bilibili.bililive.tests.imageloader

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import com.bilibili.bililive.tests.R
import com.bilibili.bililive.tests.imageloader.cache.DoubleCache

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/7/2 3:48 PM
 * @description:
 */
class ImageLoaderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imageloader)

        val imageView1 = findViewById<ImageView>(R.id.image1)

        val imageLoader = ImageLoader()
        imageLoader.cache = DoubleCache(this)
        imageLoader.displayImage(imageView1, "http://i0.hdslb.com/bfs/live/user_cover/2a246a601047fbbe524af3849ce48cb7a170065d.jpg@420w_236h_1e_1c_85q.webp")
    }
}