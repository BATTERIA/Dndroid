package com.bilibili.bililive.batteria.recycler

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import androidx.recyclerview.widget.RecyclerView
import com.bilibili.bililive.batteria.util.DTimer
import com.bilibili.bililive.batteria.util.Statistics

class DRecyclerView : RecyclerView {
    constructor(context: Context) : super(context)
    constructor(context: Context, set: AttributeSet) : super(context, set)
    constructor(context: Context, set: AttributeSet, def: Int) : super(context, set, def)
    var signal = ""
    override fun onMeasure(widthSpec: Int, heightSpec: Int) {
        val timer = DTimer("$TAG-$signal").apply { start() }
        super.onMeasure(widthSpec, heightSpec)
        timer.end("onMeasure")
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        val timer = DTimer("$TAG-$signal").apply { start() }
        super.onLayout(changed, l, t, r, b)
        timer.end("onLayout")
//        Statistics.test(timer.end("onLayout"))
    }

    override fun onDraw(c: Canvas?) {
        val timer = DTimer("$TAG-$signal").apply { start() }
        super.onDraw(c)
        timer.end("onDraw")
    }

    override fun onDetachedFromWindow() {
        val timer = DTimer("$TAG-$signal").apply { start() }
        super.onDetachedFromWindow()
        timer.end("onDetachedFromWindow")
    }

    companion object {
        private const val TAG = "DRecyclerView"
    }
}