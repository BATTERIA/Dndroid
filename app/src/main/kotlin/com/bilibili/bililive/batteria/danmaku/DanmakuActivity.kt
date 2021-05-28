package com.bilibili.bililive.batteria.danmaku

import android.graphics.Color
import android.os.Bundle
import android.os.HandlerThread
import android.text.TextUtils
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bilibili.bililive.batteria.R
import master.flame.danmaku.controller.DrawHandler
import master.flame.danmaku.danmaku.model.BaseDanmaku
import master.flame.danmaku.danmaku.model.DanmakuTimer
import master.flame.danmaku.danmaku.model.IDanmakus
import master.flame.danmaku.danmaku.model.android.DanmakuContext
import master.flame.danmaku.danmaku.model.android.Danmakus
import master.flame.danmaku.danmaku.parser.BaseDanmakuParser
import master.flame.danmaku.ui.widget.DanmakuView


class DanmakuActivity : AppCompatActivity() {
    private val workers = mutableListOf<Thread>()
    private var running = false
    private var auto = true

    val fakeSize = 8

    val recyclerViews = mutableListOf<RecyclerView>()
    val ads = mutableListOf<DanmakuAdapter>()

    //引入弹幕所需变量
    private var danmakuView: DanmakuView? = null
    private var danmakuContext: DanmakuContext? = null
    private var showDanmaku = false

    //发送弹幕的输入框和按钮
    private var editText: EditText? = null
    private var btl: Button? = null

//    private var recyclerView: RecyclerView? = null
//    private var adapter: DanmakuAdapter? = null

    private val parser: BaseDanmakuParser = object : BaseDanmakuParser() {
        override fun parse(): IDanmakus {
            return Danmakus()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danmaku)

        initFakeDanmaku()

        danmakuView = findViewById(R.id.danmaku_view)
//        recyclerView = findViewById(R.id.recycler)
        editText = findViewById(R.id.et)
        btl = findViewById(R.id.bt)
        danmakuView?.enableDanmakuDrawingCache(true)
        //点击发送按钮监听
        btl?.setOnClickListener {
//            val str = editText?.text.toString()
//            if (!TextUtils.isEmpty(str)) {
//                //添加弹幕，str为内容。true为是自己发送的，添加方框
//                addDanmaku(str, true)
//                editText?.setText("")
//            }

            if (auto) {
                interrupt()
                for (i in 0 until fakeSize) {
                    val rv = recyclerViews[i]
                    rv.stopScroll()
                }
                auto = false
//                HandlerThreads.postDelayed(HandlerThreads.THREAD_UI, { auto = false }, 500)
            } else {
                auto = true
                Worker1().apply { workers.add(this) }.start()
            }
        }
        danmakuView?.setCallback(object : DrawHandler.Callback {
            override fun prepared() {
                showDanmaku = true
                danmakuView?.start()
//                generateSomeDanmaku()
//                Worker().apply { workers.add(this) }.start()
            }

            override fun updateTimer(timer: DanmakuTimer?) {}
            override fun danmakuShown(danmaku: BaseDanmaku?) {}
            override fun drawingFinished() {}
        })
        danmakuContext = DanmakuContext.create()
        danmakuView?.prepare(parser, danmakuContext)

//        recyclerView?.layoutManager =
//            object : StaggeredGridLayoutManager(8, StaggeredGridLayoutManager.HORIZONTAL) {
//                override fun smoothScrollToPosition(
//                    recyclerView: androidx.recyclerview.widget.RecyclerView,
//                    state: androidx.recyclerview.widget.RecyclerView.State,
//                    position: Int
//                ) {
//                    val linearSmoothScroller = NewDanmuSmoothScroller(this@DanmakuActivity)
//                    linearSmoothScroller.let {
//                        it.setSpeedInterval(1000f)
//                        it.targetPosition = position
//                        startSmoothScroll(it)
//                    }
//                }
//            }
//        adapter = DanmakuAdapter()
//        for (i in 1..8) adapter?.addData(DanmakuData("", 1))
//        recyclerView?.adapter = adapter
//
//        recyclerView?.smoothScrollToPosition(adapter?.itemCount!! - 1)

        Worker1().apply { workers.add(this) }.start()
        running = true
    }

    fun generateSomeDanmaku() {
        for (i in 0..10) {
            addDanmaku("测试测试测试测试", false)
        }
    }

    /**
     * 添加一条弹幕
     *
     * @param content    弹幕的具体内容
     * @param withBorder 弹幕是否有边框
     */
    private fun addDanmaku(content: String, withBorder: Boolean) {
        val danmaku =
            danmakuContext!!.mDanmakuFactory.createDanmaku(BaseDanmaku.TYPE_SCROLL_RL)
        //设置弹幕内容和样式
        danmaku.text = content
        danmaku.padding = 5
        danmaku.textSize = sp2px(20f).toFloat()
        danmaku.textColor = Color.BLACK
        danmaku.time = danmakuView!!.currentTime
        if (withBorder) {
            danmaku.borderColor = Color.GREEN
        }
        danmakuView!!.addDanmaku(danmaku)
    }

    /**
     * sp转px的方法。
     */
    fun sp2px(spValue: Float): Int {
        val fontScale = resources.displayMetrics.scaledDensity
        return (spValue * fontScale + 0.5f).toInt()
    }

    private var mCurrentScrollView: RecyclerView? = null;
    private fun initFakeDanmaku() {
        val ll = findViewById<DanmuLinearLayout>(R.id.ll)
        for (i in 0 until fakeSize) {
            val rv = RecyclerView(this)
            rv.addOnScrollListener(object : RecyclerView.OnScrollListener() {
                override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                    super.onScrolled(recyclerView, dx, dy)
//                    if (auto) return
//
//                    if (RecyclerView.SCROLL_STATE_IDLE != recyclerView.scrollState) {
//                        if (mCurrentScrollView == null) {
//                            mCurrentScrollView = recyclerView;
//                        }
//                        for (j in 0 until fakeSize) {
//                            val rvt = recyclerViews[j]
//
//                            if (/*rvt === recyclerView ||*/ mCurrentScrollView === rvt) continue
//                            Log.e("testtest", "$j  ${recyclerView.scrollState}")
//                            rvt.scrollBy(dx, dy)
//                        }
//                    } else {
//                        if (mCurrentScrollView != null && mCurrentScrollView === recyclerView) {
//                            mCurrentScrollView = null;
//                        }
//                    }
//
                }
            })
            val layoutManager = object : LinearLayoutManager(this) {
                override fun smoothScrollToPosition(
                    recyclerView: androidx.recyclerview.widget.RecyclerView,
                    state: androidx.recyclerview.widget.RecyclerView.State,
                    position: Int
                ) {
                    val linearSmoothScroller =
                        UniformScroller(
                            this@DanmakuActivity
                        )
                    linearSmoothScroller.let {
                        it.setSpeed(1000f)
                        it.targetPosition = position
                        startSmoothScroll(it)
                    }
                }
            }
            layoutManager.orientation = LinearLayoutManager.HORIZONTAL
            rv.layoutManager = layoutManager

            val ad = DanmakuAdapter()
            ad.addData(DanmakuData("", 1))
            rv.adapter = ad
            ads.add(ad)
            recyclerViews.add(rv)

            ll.addView(rv)
        }

//        for (i in 0 until fakeSize) {
//            val ad = ads[i]
//            ad.addData(DanmakuData("", 1))
//        }

        for (i in 0 until fakeSize) {
            val ad = ads[i]
            val rv = recyclerViews[i]
            rv.smoothScrollToPosition(ad.itemCount - 1)
        }
    }

    override fun onPause() {
        super.onPause()
        if (danmakuView != null && danmakuView?.isPrepared == true) {
            danmakuView?.pause()
        }
    }

    override fun onResume() {
        super.onResume()
        if (danmakuView != null && danmakuView?.isPrepared == true && danmakuView?.isPaused == true) {
            danmakuView?.resume()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        interrupt()
        showDanmaku = false
        if (danmakuView != null) {
            danmakuView?.release()
            danmakuView = null
        }
    }

    private fun interrupt() {
        if (!running) return
        running = false
        workers.forEach {
            try {
                if (it.isAlive) {
                    it.interrupt()
                }
                workers.remove(it)
            } catch (e: Exception) {
            }
        }

    }

    inner class Worker : Thread() {
        override fun run() {
            try {
                while (true) {
                    sleep(400)
                    runOnUiThread {
                        addDanmaku("测试测试测试测试", false)
                    }
                }
            } catch (e: Exception) {
            }
        }
    }

    inner class Worker1 : Thread() {
        override fun run() {
            try {
                while (true) {
                    sleep(50)
                    runOnUiThread {
//                        for (i in 0..8) {
//                            var t = ""
//                            val blank = (0 until 2).random()
//                            val size = (0 until 5).random()
//                            for (j in 1..size) t += if (blank == 0) "测试" else "   "
//                            adapter?.addData(DanmakuData(t))
//                        }
//                        recyclerView?.smoothScrollToPosition(adapter?.itemCount!! - 1)


                        for (i in 0 until fakeSize) {
                            val ad = ads[i]

                            // 随机生成文案
                            var t = ""
                            val blank = (0 until 2).random()
                            val size = (0 until 5).random()
                            for (j in 1..size) t += if (blank == 0) "测试" else "   "

                            ad.addData(DanmakuData(t))
                        }

                        for (i in 0 until fakeSize) {
                            val ad = ads[i]
                            val rv = recyclerViews[i]
                            rv.smoothScrollToPosition(ad.itemCount - 1)
                        }
                    }
                }
            } catch (e: Exception) {
            }
        }
    }
}