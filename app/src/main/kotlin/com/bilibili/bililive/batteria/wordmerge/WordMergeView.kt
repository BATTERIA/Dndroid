package com.bilibili.bililive.batteria.wordmerge

import android.content.Context
import android.graphics.*
import android.text.TextPaint
import android.util.AttributeSet
import android.view.View
import com.bilibili.bililive.batteria.util.LiveLogger
import com.blankj.utilcode.util.ConvertUtils
import java.util.*

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/8/31
 * @description:
 */
class WordMergeView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attributeSet, defStyleAttr), LiveLogger {
    override val logTag: String
        get() = "WordMergeView"

    private val colors = listOf(Color.BLACK, Color.BLUE, Color.RED)

    private val texts = listOf("哔哩哔哩干杯", "英雄联盟", "圣诞节", "BILIBILI", "bilibili live", "OHH", "再见EVA", "ANIBER", "雷霆战记", "下次不一定", "干杯")

    private val textData = mutableListOf<TextData>()

    private val border = ConvertUtils.dp2px(2.toFloat()).toFloat()

    private val mockData = listOf(
        listOf(100, 50),
        listOf(200, 60),
        listOf(150, 70),
    )

    private var maxHeight = 0

    private var renderData = mutableListOf<RenderData>()

    private var length = 3

    private val paint = TextPaint()

    private val random = Random()

    private val textSizes = listOf(13, 14, 16, 16, 19, 19, 20)

    init {
        paint.style = Paint.Style.FILL_AND_STROKE
        paint.strokeWidth = 2f
//        paint.strokeWidth = ConvertUtils.dp2px(1.toFloat()).toFloat()
        paint.typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        paint.isFakeBoldText = true
        paint.setShadowLayer(20f, 0f, 0f, 0xFFEE82EE.toInt())

        paint.color = Color.BLACK
        paint.textSize = ConvertUtils.dp2px(9.toFloat()).toFloat()
        texts.forEach {
            val textSize = ConvertUtils.dp2px(textSizes[random.nextInt(5)].toFloat()).toFloat()
            paint.textSize = textSize
            val rect = Rect()
            paint.getTextBounds(it, 0, it.length, rect)
            val w = rect.width() + border.toInt() * 2
            val h = rect.height() + border.toInt() * 2
            textData.add(TextData(it, w, h, rect.bottom, textSize))
            if (h > maxHeight) maxHeight = h
        }
        length = texts.size
    }

    fun setData(pixels: Array<ByteArray>) {
        val h = pixels.size
        val w = pixels[0].size

        var i = 0
        while (i < h) {
            var j = 0
            while (j < w) {
                if (pixels[i][j] == 0.toByte()) {
                    j++
                    continue
                }
//                val goalHeight = textData[Random().nextInt(length)].height
                val goalHeight = maxHeight

                val top = i
                val bottom = i + goalHeight
                val list = mutableListOf<MutableList<Int>>()
                var isLeft = 1.toByte()
                for (k in 0 until w) {
                    if (pixels[bottom][k] != isLeft) continue
                    isLeft = if (isLeft == 1.toByte()) {
                        list.add(mutableListOf(k))
                        0.toByte()
                    } else {
                        list[list.size - 1].add(k)
                        1.toByte()
                    }
                }

                // 遍历横向联通区域
                list.forEach {
                    var left = it[0]
                    val right = it[1]
                    var goalWidth = right - left
                    // 删除太短的空间
                    if (goalWidth < 100) return@forEach

                    // 记录重试次数 length
                    var times = 0
                    while (goalWidth > 0 && times < length * 2) {
                        val index = Random().nextInt(length)

                        val d = textData[index]
                        val tW = d.width
                        val tH = d.height

                        // 随机文字过长跳过
                        if (tW <= goalWidth + 50) {
                            renderData.add(RenderData(d.text, Rect(left, top, left + tW, top + tH), d.bottom, d.textSize))
                            goalWidth -= tW
                            left += tW
                            times = 0
                        } else {
                            times++
                        }
                    }
                }

                i += (maxHeight - 1)
                break
            }
            i++
        }
    }

    fun changeColor(isPurple: Boolean) {
        paint.setShadowLayer(20f, 0f, 0f, (if (isPurple) 0xFFEE82EE else 0xFFA1F5F5).toInt())
        invalidate()
    }

    override fun onDraw(canvas: Canvas?) {
        renderData.forEach {
            paint.style = Paint.Style.FILL_AND_STROKE
            paint.color = Color.WHITE
            paint.textSize = it.textSize
            // debug用 外边框
//            canvas?.drawRect(it.rect, paint)

            canvas?.drawText(it.text, it.rect.left.toFloat() + border, it.rect.bottom.toFloat() - it.bottom - border, paint)

            paint.style = Paint.Style.STROKE
            paint.color = Color.BLACK

            canvas?.drawText(it.text, it.rect.left.toFloat() + border, it.rect.bottom.toFloat() - it.bottom - border, paint)

            // 需要提前计算好，并且加入到外边框里
//            paint.textSize = it.textSize + ConvertUtils.dp2px(1f)
//            val rect = Rect()
//            paint.getTextBounds(it.text, 0, it.text.length, rect)
//
//            it.rect.width() - rect.width()
//            canvas?.drawText(it.text, it.rect.left.toFloat() + border, it.rect.bottom.toFloat() - it.bottom - border, paint)
        }
    }
}

data class TextData(val text: String, val width: Int, val height: Int, val bottom: Int, val textSize: Float)

data class RenderData(val text: String, val rect: Rect, val bottom: Int, val textSize: Float)