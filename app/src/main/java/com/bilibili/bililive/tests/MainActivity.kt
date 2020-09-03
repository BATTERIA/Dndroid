package com.bilibili.bililive.tests

import android.arch.lifecycle.LifecycleObserver
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import com.bilibili.bililive.tests.webview.WebViewActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycle.addObserver(object : LifecycleObserver {

        })
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        val adapter = ItemAdapter();
        adapter.setItems(listOf(Item("WebView", R.drawable.web) {
            startActivity(Intent(this, WebViewActivity::class.java))
        }, Item("ImageLoader", R.drawable.image) {
//            startActivity(Intent(this, ImageLoaderActivity::class.java))
            SocketDialogFragment().show(fragmentManager, "socket")
        }))
        recyclerView.adapter = adapter
        Int.MIN_VALUE
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}
