package com.bilibili.bililive.batteria.danmaku

import android.content.Context
import android.util.DisplayMetrics
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.RecyclerView

class UniformScroller1(context: Context) : LinearSmoothScroller(context) {

    /**
     * milliseconds per inch
     */
    private var test: Int = 1000

    init {
        test = 10
        Log.e("androidruntime test", test.toString())
    }

    /**
     * Calculates the scroll speed.
     *
     * @param displayMetrics DisplayMetrics to be used for real dimension calculations
     * @return The time (in ms) it should take for each pixel. For instance, if returned value is
     * 2 ms, it means scrolling 1000 pixels with LinearInterpolation should take 2 seconds.
     */
    override fun calculateSpeedPerPixel(displayMetrics: DisplayMetrics): Float {
        Log.e("androidruntime test", (displayMetrics.densityDpi.toFloat()).toString())
        Log.e("androidruntime test", test.toString())
        Log.e("androidruntime test", (test / displayMetrics.densityDpi.toFloat()).toString())
        return test / displayMetrics.densityDpi.toFloat()
    }

    override fun onTargetFound(targetView: View, state: RecyclerView.State, action: Action) = Unit


}