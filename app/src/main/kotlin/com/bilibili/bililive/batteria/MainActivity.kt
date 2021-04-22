package com.bilibili.bililive.batteria

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleObserver
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bilibili.bililive.batteria.imageloader.ImageLoaderActivity
import com.bilibili.bililive.batteria.recycler.DUtil
import com.bilibili.bililive.batteria.recycler.RecyclerActivity
import com.bilibili.bililive.batteria.webview.WebViewActivity
import com.bilibili.bililive.infra.util.cache.api.CacheActivity
import com.guet.flexbox.litho.LithoBuildTool


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        LithoBuildTool.init(this)

        lifecycle.addObserver(object : LifecycleObserver {

        })
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(this, 3)
        val adapter = ItemAdapter()
        adapter.setItems(listOf(Item("WebView", R.drawable.web) {
            startActivity(Intent(this, WebViewActivity::class.java))
        }, Item("ImageLoader", R.drawable.image) {
            startActivity(Intent(this, ImageLoaderActivity::class.java))
        }, Item("Socket", R.drawable.network) {
            SocketDialogFragment().show(fragmentManager, "socket")
        }, Item("Progress", R.drawable.progress) {
            startActivity(Intent(this, ProgressActivity::class.java))
        }, Item("ProgressView", R.drawable.progress) {
            startActivity(Intent(this, ProgressViewActivity::class.java))
        }, Item("Cache", R.drawable.ic_more_cache) {
            startActivity(Intent(this, CacheActivity::class.java))
        }, Item("RecyclerView", R.drawable.list) {
            startActivity(Intent(this, RecyclerActivity::class.java))
        }, Item("Touch", R.drawable.ic_more_cache) {
//            NetworkManager.list()
//            startActivity(Intent(this, HummerTestActivity::class.java))
//            showFragmentSafely("test") { TestFragment() }
            val list = mutableListOf(5,1,3,5,3,6,8,1)
            DUtil.test(list)
            test()
        }))
        recyclerView.adapter = adapter
    }

    private fun test() {
        var bitmap = BitmapFactory.decodeResource(resources, R.drawable.ic_bai)
        Thread {
            Log.e("Thread1", "enter")
            while (true) {
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height)
//                val canvas = Canvas(bitmap2)
//                val paint = Paint()
//                canvas.drawBitmap(bitmap, 1f, 1f, paint)
                Log.e("Thread1", "using")
            }
            Log.e("Thread1", "end")
        }.start()
        Thread {
            Log.e("Thread2", "enter")
            while (true) {
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height)
//                val canvas = Canvas(bitmap2)
//                val paint = Paint()
//                canvas.drawBitmap(bitmap, 1f, 1f, paint)
                Log.e("Thread2", "using")
            }
            Log.e("Thread2", "end")
        }.start()
        Thread {
            Log.e("Thread3", "enter")
            while (true) {
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height)
//                val canvas = Canvas(bitmap2)
//                val paint = Paint()
//                canvas.drawBitmap(bitmap, 1f, 1f, paint)
                Log.e("Thread3", "using")
            }
            Log.e("Thread3", "end")
        }.start()
        Thread {
            Log.e("Thread4", "enter")
            while (true) {
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.width, bitmap.height)
//                val canvas = Canvas(bitmap2)
//                val paint = Paint()
//                canvas.drawBitmap(bitmap, 1f, 1f, paint)
                Log.e("Thread4", "using")
            }
            Log.e("Thread4", "end")
        }.start()
    }
}

