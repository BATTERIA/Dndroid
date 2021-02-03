package com.bilibili.bililive.tests

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleObserver
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bilibili.bililive.tests.imageloader.ImageLoaderActivity
import com.bilibili.bililive.tests.webview.WebViewActivity
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
        }))
        recyclerView.adapter = adapter
    }
}

