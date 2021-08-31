package com.bilibili.bililive.batteria.wordmerge

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
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

    private val texts = listOf("哔哩哔哩干杯", "英雄联盟", "圣诞节", "BILIBILI", "bilibili live")

    private val textData = mutableListOf<TextData>()

    private val mockData = listOf(
        listOf(100, 50),
        listOf(200, 60),
        listOf(150, 70),
    )

    private var maxHeight = 0

    private var renderData = mutableListOf<RenderData>()

    private var length = 3

    private val paint = Paint()

    private val random = Random()

    private val textSizes = listOf(9, 12, 13)

    init {
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = ConvertUtils.dp2px(1.toFloat()).toFloat()
        paint.color = Color.BLACK
        paint.textSize = ConvertUtils.dp2px(9.toFloat()).toFloat()
        texts.forEach {
            val textSize = ConvertUtils.dp2px(textSizes[random.nextInt(3)].toFloat()).toFloat()
            paint.textSize = textSize
            val rect = Rect()
            paint.getTextBounds(it, 0, it.length, rect)
            val h = rect.height()
            textData.add(TextData(it, rect.width(), h, rect.bottom, textSize))
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

                // 删除太短的空间 10
                list.forEach {
                    var left = it[0]
                    val right = it[1]
                    var goalWidth = right - left
                    if (goalWidth < 10) return@forEach
                    while (goalWidth > 0) {
                        val index = Random().nextInt(length)

                        val d = textData[index]
                        val tW = d.width
                        val tH = d.height
                        renderData.add(RenderData(d.text, Rect(left, top, left + tW, top + tH), d.bottom, d.textSize))
                        goalWidth -= tW
                        left += tW
                    }
                }

                i += (maxHeight - 1)
                break
            }
            i++
        }
    }

    override fun onDraw(canvas: Canvas?) {
        renderData.forEach {
            paint.color = colors[random.nextInt(3)]
            paint.textSize = it.textSize
//            canvas?.drawRect(it.rect, paint)

            canvas?.drawText(it.text, it.rect.left.toFloat(), it.rect.bottom.toFloat() - it.bottom, paint)
        }
    }
}

data class TextData(val text: String, val width: Int, val height: Int, val bottom: Int, val textSize: Float)

data class RenderData(val text: String, val rect: Rect, val bottom: Int, val textSize: Float)