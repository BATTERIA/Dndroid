package com.bilibili.bililive.batteria.view

import android.content.Context
import android.graphics.*
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ImageSpan
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.VelocityTracker
import android.view.View
import android.widget.Scroller
import android.widget.TextView
import com.bilibili.bililive.batteria.R
import com.bilibili.bililive.batteria.util.HandlerThreads
import com.blankj.utilcode.util.ConvertUtils.dp2px
import java.util.*

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/6/1
 * @description:
 */
class BezierView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {
    private val paint = Paint()
    private val t = 50f
    private val b = Bezier(300f+t, 0f+t, 50f+t, 50f+t, 0f+t, 400f+t).generateSample()
    private val p = Path()

    init {
        paint.color = Color.BLACK
        paint.textSize = 80f
        paint.strokeWidth = 10f
        paint.isAntiAlias = true
        paint.style = Paint.Style.STROKE


    }

    override fun onDraw(canvas: Canvas?) {
//        var first = true
//        b.forEach {
//            if (first) {
//                p.moveTo(it[0], it[1])
//                first = false
//            } else {
//                p.lineTo(it[0], it[1])
//            }
//        }
//        canvas?.drawPath(p, paint)
        
        // image
        val spanString = SpannableString("test")

        val d = resources.getDrawable(R.drawable.web)

        d.setBounds(0, 0, d.intrinsicWidth, d.intrinsicHeight)

        val imageSpan = ImageSpan(d, ImageSpan.ALIGN_BASELINE)
        spanString.setSpan(imageSpan, 1, 3, 0)

        canvas?.drawText(spanString, 0, spanString.length, 100f, 100f, paint)

        val i = Random().nextInt(2)

        val s1 = listOf(Color.argb(0xFF, 0x42, 0xF9, 0xFE), Color.argb(0xFF, 0xFF, 0xDC, 0x64))
        val s2 = listOf(Color.argb(0x00, 0x42, 0xF9, 0xFE), Color.argb(0x00, 0xFF, 0xDC, 0x64))


        paint.shader = LinearGradient(100f, 0f, 400f, 0f, s1[i], s2[i], Shader.TileMode.CLAMP)
        canvas?.drawRoundRect(
            RectF(
                100f, 100f, 400f, 200f
            ), 100f, 100f,
            paint
        )
    }
}

data class Bezier(private val x0: Float, private val y0: Float, private val x1: Float, private val y1: Float, private val x2: Float, private val y2: Float) {
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