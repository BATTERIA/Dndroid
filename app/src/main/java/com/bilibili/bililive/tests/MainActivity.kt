package com.bilibili.bililive.tests

import android.animation.Animator
import android.animation.ObjectAnimator
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.JsonReader
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleObserver
import androidx.recyclerview.widget.RecyclerView
import com.alibaba.fastjson.JSON
import com.bilibili.bililive.tests.login.User
import com.bilibili.bililive.tests.webview.WebViewActivity
import com.google.gson.Gson
import com.guet.flexbox.TemplateNode
import com.guet.flexbox.litho.HostingView
import com.guet.flexbox.litho.LithoBuildTool
import com.guet.flexbox.litho.TemplatePage
import dagger.Binds
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import org.json.JSONObject
import java.io.Serializable
import java.lang.Exception
import java.lang.StringBuilder
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LithoBuildTool.init(this)

        lifecycle.addObserver(object : LifecycleObserver {

        })
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val manager = SmoothScrollManager(this)
        recyclerView.layoutManager = manager
        val adapter = ItemAdapter()
        adapter.setItems(listOf(Item("WebView", R.drawable.web) {
            startActivity(Intent(this, WebViewActivity::class.java))
        }, Item("ImageLoader", R.drawable.image) {
//            startActivity(Intent(this, ImageLoaderActivity::class.java))
            SocketDialogFragment().show(fragmentManager, "socket")
        }))
        recyclerView.adapter = adapter

        val o =
            Observable.fromIterable(listOf(1,2))
        val observer = object : Observer<Long> {
            override fun onComplete() {
                println("test**onComplete")
            }

            override fun onSubscribe(d: Disposable) {
                println("test**onSubscribe")
            }

            override fun onNext(t: Long) {
                println("test**onNext $t")
            }

            override fun onError(e: Throwable) {
                println("test**onError $e")
            }
        }
        Observable.just(1).buffer(1,1).map {
            15346548697869L
        }.subscribe(observer)

        val testView = findViewById<HostingView>(R.id.test_view)
        val json = getString(R.string.test)
        val tNode = Gson().fromJson<TemplateNode>(json, TemplateNode::class.java)

        Runnable {
            val view = TemplatePage.create(this).template(tNode).data(A()).build()
            testView.templatePage = view
        }.run()

        Toast(this).show()
    }

    data class A(var clicked: Boolean = false)
}