package com.bilibili.bililive.batteria.gesture

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import com.blankj.utilcode.util.ConvertUtils.dp2px

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/8/10
 * @description:
 */
class BorderView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attributeSet, defStyleAttr) {
    private val paint = Paint()
    private var borderWidth: Int = 20

    init {
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = dp2px(borderWidth.toFloat()).toFloat()
        paint.color = BORDER_COLOR.toInt()
    }

    fun setBorderWidth(width: Int) {
        borderWidth = width
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawRect(0f, 0f, width.toFloat(), height.toFloat(), paint)
    }

    companion object {
        private const val BORDER_COLOR = 0xFFFD6D8C
    }
}