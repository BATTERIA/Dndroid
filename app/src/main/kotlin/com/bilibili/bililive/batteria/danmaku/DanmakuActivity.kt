package com.bilibili.bililive.batteria.danmaku

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.bilibili.bililive.batteria.R
import com.bilibili.bililive.batteria.danmaku.fake.FakeDanmakuView
import com.bilibili.bililive.batteria.view.Bezier
import com.blankj.utilcode.util.ConvertUtils.*
import master.flame.danmaku.controller.DrawHandler
import master.flame.danmaku.danmaku.model.BaseDanmaku
import master.flame.danmaku.danmaku.model.DanmakuTimer
import master.flame.danmaku.danmaku.model.IDanmakus
import master.flame.danmaku.danmaku.model.android.BaseCacheStuffer
import master.flame.danmaku.danmaku.model.android.DanmakuContext
import master.flame.danmaku.danmaku.model.android.Danmakus
import master.flame.danmaku.danmaku.model.android.SpannedCacheStuffer
import master.flame.danmaku.danmaku.parser.BaseDanmakuParser
import master.flame.danmaku.ui.widget.DanmakuView


class DanmakuActivity : AppCompatActivity() {
    private val workers = mutableListOf<Thread>()
    private var running = false
    private var auto = true

    private var fakeDanmakuView: FakeDanmakuView? = null

    private var dv: DanmakuView? = null
    private var danmakuContext: DanmakuContext? = null

    private val t = 0f
    private val b =
        Bezier(1000f + t, 0f + t, 600f + t, 200f + t, 400f + t, 1000f + t).generateSample()

    private val drawableManager =
        DrawableCachedManager(DrawableCachedManager.DrawableCreator {
            this@DanmakuActivity.resources
                .getDrawable(R.drawable.ic_new_danmaku_airborne_dfm)
        })


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danmaku)

        fakeDanmakuView = findViewById(R.id.fake_danmaku_view)
        fakeDanmakuView?.init(8)

        findViewById<Button>(R.id.bt1).setOnClickListener {
            sendMeteor(0.8f, 0.5f)
        }

        findViewById<Button>(R.id.bt2).setOnClickListener {
            sendMeteor(0.9f, 0.7f)
        }

        findViewById<Button>(R.id.bt3).setOnClickListener {
            sendMeteor(1f, 0.9f)
        }

        findViewById<Button>(R.id.bt4).setOnClickListener {
            sendMeteor(1.1f, 1f)
        }

        dv = findViewById(R.id.dv)
        val parser: BaseDanmakuParser = object : BaseDanmakuParser() {
            override fun parse(): IDanmakus {
                return Danmakus()
            }
        }

//        dv?.enableDanmakuDrawingCache(true)
        dv?.setCallback(object : DrawHandler.Callback {
            override fun prepared() {
                dv?.start()
            }

            override fun updateTimer(timer: DanmakuTimer?) {}
            override fun danmakuShown(danmaku: BaseDanmaku?) {}
            override fun drawingFinished() {}
        })
        danmakuContext = DanmakuContext.create()

        danmakuContext?.setCacheStuffer(SpannedCacheStuffer(), mCacheStufferAdapter);
        dv?.prepare(parser, danmakuContext)
    }

    private fun sendMeteor(scale: Float, alphaScale: Float) {
        val danmaku = danmakuContext?.mDanmakuFactory?.createDanmaku(BaseDanmaku.TYPE_SCROLL_RL)!!
        danmaku.textSize = sp2px(25f).toFloat()

        val text = "哔哩哔哩干杯"
        val content = SpannableString("$text")

        val span = LiveMeteorSpan(
            false,
            scale,
            alphaScale,
            Color.parseColor("#FFFFFF"),
            resources.getDrawable(R.drawable.blue_star)
        )
        content.setSpan(span, 0, text.length, 0)

        danmaku.text = content

        danmaku.padding = 5
        danmaku.textColor = Color.BLACK

        dv?.addDanmaku(danmaku)
    }

    private val mCacheStufferAdapter: BaseCacheStuffer.Proxy = object : BaseCacheStuffer.Proxy() {
        override fun prepareDrawing(
            danmaku: BaseDanmaku,
            fromWorkerThread: Boolean
        ) {
        }

        override fun releaseResource(danmaku: BaseDanmaku) {
            // 清理含有ImageSpan的text中的一些占用内存的资源 例如drawable
            if (danmaku.text is Spanned) {
                danmaku.text = null
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        interrupt()
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

    inner class Worker1 : Thread() {
        override fun run() {
            try {
                while (true) {
                    sleep(50)
                    runOnUiThread {
                        fakeDanmakuView?.generateRandomItem()
                        fakeDanmakuView?.startScrollToEnd()
                    }
                }
            } catch (e: Exception) {
            }
        }
    }
}

data class Bezier(
    private val x0: Float,
    private val y0: Float,
    private val x1: Float,
    private val y1: Float,
    private val x2: Float,
    private val y2: Float
) {
    fun generateSample(): List<List<Float>> {
        val ans = mutableListOf<List<Float>>()
        for (i in 0..20) {
            val t = 0.05f * i
            ans.add(bezier(t))
        }
        return ans
    }

    private fun bezier(t: Float): List<Float> {
        return listOf(algorithm(t, x0, x1, x2), algorithm(t, y0, y1, y2))
    }

    private fun algorithm(t: Float, t0: Float, t1: Float, t2: Float): Float {
        val a = 1f - t
        return a * a * t0 + 2 * t * a * t1 + t * t * t2
    }
}