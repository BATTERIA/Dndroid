package com.bilibili.bililive.batteria.danmaku

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.VelocityTracker
import android.view.View
import android.widget.Scroller
import com.bilibili.bililive.batteria.util.HandlerThreads
import com.blankj.utilcode.util.ConvertUtils.dp2px
import java.util.*

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/6/1
 * @description:
 */
class TestView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr), Runnable {
    private val danmakus = mutableListOf<Danmaku>()

    private var dxMove = 0

    // 100容积的队列
    private val historyDanmaku = ArrayDeque<Danmaku>(100)

    private var isRunning = true
    private val paint = Paint()

    private val scroller = Scroller(context)
    private var lastX = 0

    private var velocityTracker: VelocityTracker? = null

    init {
        paint.color = Color.BLACK
        paint.textSize = 80f
        paint.strokeWidth = 10f
        paint.isAntiAlias = true
    }

    fun add(danmaku: Danmaku) {
        if (danmaku.x == 0f) danmaku.x = width.toFloat()
        if (danmaku.y == 0f) danmaku.y = (1..6).random() * dp2px(40f).toFloat()
        danmakus.add(danmaku)
    }

    fun stopScroll() {
        isRunning = false
    }

    override fun run() {
        while (isRunning) {
            if (danmakus.isEmpty()) continue
//            val canvas = lockCanvas

        }
    }

    override fun onDraw(canvas: Canvas?) {
//        canvas?.drawColor(Color.TRANSPARENT)

        for (i in danmakus.size - 1 downTo 0) {
            val danmaku = danmakus[i]
            // todo: 删除逻辑待定
            // 太远的删除，不允许一直往前划
            if (danmaku.width == 0f) {
                danmaku.width = paint.measureText(danmaku.text)
            }
//            if (danmaku.x <= -danmaku.width) {
//                danmakus.remove(danmaku)
//                historyDanmaku.add(danmaku)
//                continue
//            }
            canvas?.drawText(danmaku.text, danmaku.x, danmaku.y, paint)
            if (isRunning) danmaku.x -= dp2px(3f)
        }

        invalidate()
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        event ?: return super.onTouchEvent(event)

        if (isRunning) return true

        if (velocityTracker == null) velocityTracker = VelocityTracker.obtain()
        velocityTracker?.addMovement(event)

        val x = event.rawX.toInt()

        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                if (!scroller.isFinished) scroller.abortAnimation()
                lastX = x
                return true
            }
            MotionEvent.ACTION_MOVE -> {
                val dx = x - lastX
                lastX = x

                dxMove -= dx
                Log.e("TestView", "$dxMove")

                scrollBy(-dx, 0)
                return true
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
//                scroller.startScroll(scrollX, scrollY, 20, 0, 1000)
//                invalidate()
                velocityTracker?.computeCurrentVelocity(1000)
                val xVelocity = velocityTracker?.xVelocity?.toInt() ?: 0
                scroller.fling(
                    scrollX, scrollY, -xVelocity, 0,
                    Int.MIN_VALUE,
                    Int.MAX_VALUE,
                    Int.MIN_VALUE,
                    Int.MAX_VALUE
                )

                velocityTracker?.recycle()
                velocityTracker = null
                return true
            }
        }

        return super.onTouchEvent(event)
    }

    override fun computeScroll() {
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.currX, scroller.currY)
            invalidate()
        }
    }
}