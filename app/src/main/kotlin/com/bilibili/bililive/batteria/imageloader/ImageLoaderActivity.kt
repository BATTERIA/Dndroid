package com.bilibili.bililive.batteria.imageloader

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bilibili.bililive.batteria.R
import com.bilibili.bililive.batteria.danmaku.Danmaku
import com.bilibili.bililive.batteria.danmaku.TestView
import com.bilibili.bililive.batteria.imageloader.cache.DoubleCache
import com.bilibili.bililive.batteria.util.HandlerThreads
import java.io.File

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/7/2 3:48 PM
 * @description:
 */
class ImageLoaderActivity : AppCompatActivity() {
    var test: TestView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imageloader)

//        val imageView1 = findViewById<ImageView>(R.id.image1)
//
//        val imageLoader = ImageLoader()
//        imageLoader.cache = DoubleCache(this)
//        imageLoader.displayImage(imageView1, "http://i0.hdslb.com/bfs/live/user_cover/2a246a601047fbbe524af3849ce48cb7a170065d.jpg@420w_236h_1e_1c_85q.webp")
//
//        imageView1.setOnClickListener {
//            startAnimation(imageView1)
//            val file = getLiveModManagerCacheDir()
//            val list = file?.listFiles()
//            println()
//        }

        test = findViewById(R.id.test)

        findViewById<Button>(R.id.add).setOnClickListener {
            test?.add(Danmaku("测试", 0f, 1, 1))
        }

        findViewById<Button>(R.id.stop).setOnClickListener {
            test?.stopScroll()
            isRunning = false
        }

        findViewById<Button>(R.id.invalidate).setOnClickListener {
            test?.invalidate()
        }

        HandlerThreads.postDelayed(HandlerThreads.THREAD_UI, ::runnable, 100)
    }

    private var isRunning = true

    fun runnable() {
        test?.add(Danmaku("测试", 0f, 1, 1))
        if (isRunning) HandlerThreads.postDelayed(HandlerThreads.THREAD_UI, ::runnable, 100)
    }

    private fun startAnimation(image: ImageView) {
        val scaleXAnim = ObjectAnimator.ofFloat(image, "scaleX", 1.3f, 1f)
        val scaleYAnim = ObjectAnimator.ofFloat(image, "scaleY", 1.3f, 1f)
        val alphaAnim = ObjectAnimator.ofFloat(image, "alpha", 0f, 1f)
        val animSet = AnimatorSet()
        animSet.playTogether(scaleXAnim, scaleYAnim, alphaAnim)
        animSet.duration = 300
        animSet.start()
    }

    private fun hookObject() {
        val clazz = Class.forName("com.bilibili.bililive.tests.test.TestSingleton")
        val field = clazz.getField("INSTANCE")
        val a = field.get(null)
        val method = clazz.getDeclaredMethod("test")
        method.invoke(a)
    }

    private fun getLiveModManagerCacheDir(): File? {
        val appPath = applicationContext?.filesDir?.parentFile?.path
        try {
            return File("$appPath/app_mod_resource/cache/live")
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }
}