package com.bilibili.bililive.batteria.microsoft

import android.content.Context
import android.util.AttributeSet
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2022/3/5
 * @description:
 */
class MidTabLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : RecyclerView(context, attrs, defStyleAttr) {
    val currentPage: Int
        get() {
            // measure需要做一些保底判断之类的
            println("test-d ${computeHorizontalScrollOffset()} ${computeHorizontalScrollRange()} ${computeHorizontalScrollExtent()} $x $measuredHeight")
            return computeHorizontalScrollOffset() / measuredHeight
        }

    var x = 0

    init {
        addOnScrollListener(object : OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                x += dx
            }
        })
    }

    fun scrollToTab(position: Int) {
        val offset = (measuredWidth - measuredHeight) / 2
        println("d-test scrollToTab $position  $offset")
        (layoutManager as LinearLayoutManager).scrollToPositionWithOffset(position + 1, offset)
//        scrollTo(measuredHeight * position, 0)
    }

    fun scrollToTab(position: Int, positionOffset: Float) {
        val offset =
            (measuredWidth - measuredHeight) / 2 - (measuredHeight * positionOffset).toInt()
        println("d-test scrollToTab $position $offset")
        (layoutManager as LinearLayoutManager).scrollToPositionWithOffset(position + 1, offset)
        stopScroll()

    }
}