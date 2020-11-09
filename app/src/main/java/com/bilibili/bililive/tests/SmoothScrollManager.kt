package com.bilibili.bililive.tests

import android.content.Context
import android.util.DisplayMetrics
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.RecyclerView

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/9/3 3:27 PM
 * @description:
 */
class SmoothScrollManager(context: Context) : LinearLayoutManager(context) {
    override fun smoothScrollToPosition(
        recyclerView: RecyclerView?,
        state: RecyclerView.State?,
        position: Int
    ) {
        
        val smoothScroller: LinearSmoothScroller =
            object : LinearSmoothScroller(recyclerView!!.context) {
                // 返回：滑过1px时经历的时间(ms)。
                override fun calculateSpeedPerPixel(displayMetrics: DisplayMetrics): Float {
                    recyclerView?.verticalScrollbarPosition
                    recyclerView?.height
                    recyclerView?.adapter

                    return 10f / displayMetrics.densityDpi
                }
            }
        smoothScroller.targetPosition = position
        startSmoothScroll(smoothScroller)
    }
}