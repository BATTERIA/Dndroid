package com.bilibili.bililive.batteria.danmaku

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.widget.Button
import android.widget.EditText
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

    //发送弹幕的输入框和按钮
    private var editText: EditText? = null
    private var btl: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danmaku)

        fakeDanmakuView = findViewById(R.id.fake_danmaku_view)
        fakeDanmakuView?.init(8)

        editText = findViewById(R.id.et)
        btl = findViewById(R.id.bt)
        //点击发送按钮监听
        btl?.setOnClickListener {
//            if (auto) {
//                interrupt()
//                fakeDanmakuView?.stopScrollAnimation()
//                auto = false
//            } else {
//                auto = true
//                Worker1().apply { workers.add(this) }.start()
//            }
            val danmaku =
                danmakuContext?.mDanmakuFactory?.createDanmaku(BaseDanmaku.TYPE_SCROLL_RL)!!
            danmaku.textSize = sp2px(30f).toFloat()


            val text = "哔哩哔哩干杯"
            val content = SpannableString("$text")


//            val params: MedalBackgroundSpanV2.LayoutParams = LayoutParams(
//                context, textSize, dip2px(context, 1),
//                dip2px(context, 0.5f), medal.length, guardDrawable != null
//            )
//            params.initColorInfo(
//                medalColor,
//                medalColorEnd,
//                medalColorBorder,
//                medalColorName,
//                medalColorLevel
//            )
//            params.setPadding(verticalPadding, verticalPadding)
//            params.mGuardDrawable = guardDrawable

//            content.setSpan(MeteorSpan(Color.parseColor("#12DBD1"),Color.parseColor("#FFFFFF"), danmaku), 0, text.length, 0)

            val padding = dp2px(5f)


            val span = LiveMeteorSpan(1.1f, Color.parseColor("#FFFFFF"), resources.getDrawable(R.drawable.blue_star))
            content.setSpan(span, 0, text.length, 0)

            danmaku.text = content

            danmaku.padding = 5
            danmaku.textColor = Color.BLACK

//            danmaku.time = dv!!.currentTime
//            val duration = 10000L
//            danmaku.duration = Duration(duration)
//            danmaku.rotationZ = -45f
//            danmakuContext?.mDanmakuFactory?.fillTranslationData(
//                danmaku,
//                0f,
//                0f,
//                1f,
//                1f,
//                duration,
//                0,
//                1f,
//                1f
//            )
//            danmakuContext?.mDanmakuFactory?.fillAlphaData(
//                danmaku,
//                (255 * 0.9).toInt(),
//                (255 * 0.9).toInt(),
//                duration
//            )
            dv?.addDanmaku(danmaku)

//            var data = ""
//            for (i in b.indices) {
//                data += b[i][0]
//                data += ','
//                data += b[i][1]
//                if (i != b.size - 1) {
//                    data += 'L'
//                }
//            }

//            val motionPathString: String = data
//            if (!TextUtils.isEmpty(motionPathString)) {
//                val pointStrArray =
//                    motionPathString.split("L".toRegex()).toTypedArray()
//                if (pointStrArray.isNotEmpty()) {
//                    val points =
//                        Array(pointStrArray.size) { FloatArray(2) }
//                    for (i in pointStrArray.indices) {
//                        val pointArray =
//                            pointStrArray[i].split(",".toRegex()).toTypedArray()
//                        if (pointArray.size >= 2) {
//                            points[i][0] = parseFloat(pointArray[0])
//                            points[i][1] = parseFloat(pointArray[1])
//                        }
//                    }
//                    DanmakuFactory.fillLinePathData(danmaku, points, 1.0f, 1.0f)
//                }
//            }


//            for (i in 0..3) {
//                val danmaku1 =
//                    DanmakuFactory.create()
//                        .createDanmaku(BaseDanmaku.TYPE_SCROLL_RL, danmakuContext)
//                //设置弹幕内容和样式
//                danmaku1.text = "content"
//                danmaku1.padding = 5
//                danmaku1.textSize = sp2px(20f).toFloat()
//                danmaku1.textColor = Color.BLACK
//                danmaku1.time = dv!!.currentTime
//                dv?.addDanmaku(danmaku1)
//            }
        }
//        Worker1().apply { workers.add(this) }.start()
//        running = true

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