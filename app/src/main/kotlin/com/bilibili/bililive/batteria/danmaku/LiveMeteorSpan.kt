package com.bilibili.bililive.batteria.danmaku

import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.text.style.ReplacementSpan
import com.blankj.utilcode.util.ConvertUtils.dp2px

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/7/7
 * @description:
 */
class LiveMeteorSpan(
    private val isMain: Boolean,
    private val sizeScale: Float,
    private val alphaScale: Float,
    private val textColor: Int, // text color
    private val star: Drawable // background color
) : ReplacementSpan() {

    private var width: Int = 0// span width
    private var height: Int = 0// span height
    private var textPaint = Paint()
    private val tagRect = RectF()

    private val verticalPadding = dp2px(4f) * sizeScale
    private val paddingLeft = dp2px(22f) * sizeScale

    private val tail = dp2px(64f)
    private val strokeWidth = dp2px(1.5f)
    private val radius = dp2px(100f)
    private val textSize = dp2px(20f) * sizeScale

    override fun getSize(
        paint: Paint,
        text: CharSequence?,
        start: Int,
        end: Int,
        fm: Paint.FontMetricsInt?
    ): Int {
        // 计算文字尺寸
        textPaint.textSize = textSize
        val bounds = Rect()
        textPaint.getTextBounds(text.toString(), start, end, bounds)


        width = (bounds.width() + paddingLeft).toInt()
        height = dp2px(25f * sizeScale)

        return width + tail
    }

    override fun draw(
        canvas: Canvas,
        text: CharSequence?,
        start: Int,
        end: Int,
        x: Float,
        top: Int,
        y: Int,
        bottom: Int,
        paint: Paint
    ) {
        // 纵向居中
        val bottomWithoutLineSpacing = y + paint.descent()
        val topWithoutLineSpacing = top + (paint.fontMetrics.ascent - paint.fontMetrics.top)
        val centerY =
            topWithoutLineSpacing + (bottomWithoutLineSpacing - topWithoutLineSpacing) / 2F

        val topRect = centerY - height / 2
        val bottomRect = centerY + height / 2
        drawBackground(canvas, x, topRect, bottomRect, paint)

        text?.run {
            drawText(canvas, this, x, start, end, topRect, bottomRect, textPaint)
        }
        drawStar(canvas, x, topRect, bottomRect, paint)
    }

    private fun drawBackground(canvas: Canvas, x: Float, top: Float, bottom: Float, paint: Paint) {
        // 绘制背景色
        paint.color = Color.argb(0x66, 0x0F, 0x12, 0x2F)
        updatePaintAlpha(paint)
        paint.isAntiAlias = true
        paint.style = Paint.Style.FILL
        paint.shader = LinearGradient(
            x + width,
            0f,
            x + width + tail,
            0f,
            Color.argb(0x66, 0x0F, 0x12, 0x2F),
            Color.argb(0x00, 0x0F, 0x12, 0x2F),
            Shader.TileMode.CLAMP
        )
        tagRect.set(x, top, x + width + tail + 100f, bottom)
        canvas.drawRoundRect(tagRect, radius.toFloat(), radius.toFloat(), paint)

        if (!isMain) return
        // 主态绘制边框
        paint.color = Color.argb(0xFF, 0x82, 0xF2, 0xFF)
        updatePaintAlpha(paint)
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = strokeWidth.toFloat()
        paint.shader = LinearGradient(
            x,
            0f,
            x + width + tail,
            0f,
            Color.argb(0xFF, 0x82, 0xF2, 0xFF),
            Color.argb(0x00, 0x82, 0xF2, 0xFF),
            Shader.TileMode.CLAMP
        )
        canvas.drawRoundRect(tagRect, radius.toFloat(), radius.toFloat(), paint)
    }

    private fun drawStar(canvas: Canvas, x: Float, top: Float, bottom: Float, paint: Paint) {
        paint.alpha = 0xFF
        updatePaintAlpha(paint)
        val starPadding = dp2px(3f)
        val starBottom = bottom - starPadding
        val starTop = top + starPadding
        val starLeft = x + starPadding
        val starRight = starLeft + (starBottom - starTop) / 54 * 111
        val rect = RectF(starLeft, starTop, starRight, starBottom)
        canvas.drawBitmap((star as BitmapDrawable).bitmap, null, rect, paint)
    }

    private fun drawText(
        canvas: Canvas,
        text: CharSequence,
        x: Float,
        start: Int,
        end: Int,
        top: Float,
        bottom: Float,
        paint: Paint
    ) {
        paint.style = Paint.Style.FILL
        paint.typeface = Typeface.DEFAULT_BOLD
        paint.color = textColor
        updatePaintAlpha(paint)
        paint.isAntiAlias = true
        paint.textAlign = Paint.Align.CENTER
        val textCenterX = x + width / 2 + paddingLeft
        val textBaselineY =
            top + (bottom - top) / 2 - (paint.ascent() + paint.descent()) / 2
        val tag = text.subSequence(start, end).toString()
        canvas.drawText(tag, textCenterX, textBaselineY, paint)
    }

    private fun updatePaintAlpha(paint: Paint) {
        paint.alpha = (paint.alpha * alphaScale).toInt()
    }
}