package com.bilibili.bililive.batteria

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.Keep
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bilibili.bililive.batteria.danmaku.DanmakuActivity
import com.bilibili.bililive.batteria.gesture.GestureActivity
import com.bilibili.bililive.batteria.imageloader.ImageLoaderActivity
import com.bilibili.bililive.batteria.opengl.OpenglActivity
import com.bilibili.bililive.batteria.recycler.RecyclerActivity
import com.bilibili.bililive.batteria.webview.WebViewActivity
import com.bilibili.bililive.batteria.wordmerge.WordMergeActivity
import com.bilibili.bililive.infra.util.cache.api.CacheActivity

@Keep
class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
        }, Item("Fresco", R.drawable.image) {
            startActivity(Intent(this, ImageLoaderActivity::class.java))
        }, Item("DanmakuView", R.drawable.list) {
            startActivity(Intent(this, DanmakuActivity::class.java))
        }, Item("OpenGL", R.drawable.list) {
            startActivity(Intent(this, OpenglActivity::class.java))
        }, Item("Gesture", R.drawable.list) {
            startActivity(Intent(this, GestureActivity::class.java))
        }, Item("WordMerge", R.drawable.list) {
            startActivity(Intent(this, WordMergeActivity::class.java))
        }, Item("Touch", R.drawable.ic_more_cache) {
        }))
        recyclerView.adapter = adapter
    }
}

