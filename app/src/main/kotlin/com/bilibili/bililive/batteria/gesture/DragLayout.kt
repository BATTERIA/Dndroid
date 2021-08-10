package com.bilibili.bililive.batteria.gesture

import android.animation.AnimatorSet
import android.content.Context
import android.util.AttributeSet
import android.util.DisplayMetrics
import android.util.Log
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.FrameLayout

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/8/9
 * @description:
 */
class DragLayout @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attributeSet, defStyleAttr) {
    private val districtData: MutableList<DistrictData> = mutableListOf()
    // 由于查找比修改要多很多所以采用数组，并且实际使用场景容器大小不会很大，性能问题不大
    private val dragViews: MutableList<DragView> = mutableListOf()
    private var mWidth = 0
    private var mHeight = 0
    private var anims = mutableListOf<AnimatorSet>()

    private val dragInnerCallback = object : DragInnerCallback {
        override fun dragFinish(curView: DragView, x: Int, y: Int) {
            for (view in dragViews) {
                if (view == curView) continue
                val data = view.data ?: continue
                if (isInDistrict(x, y, data)) {
                    exchangeDestination(curView, view)
                    return
                }
            }
            curView.moveToDistrict(null)
        }

        override fun moveToTop(curView: DragView) {
            dragViews.remove(curView)
            dragViews.add(curView)
        }

        override fun isInOtherDistrict(curView: DragView, x: Int, y: Int) {
            for (view in dragViews) {
                if (view == curView) continue
                val data = view.data ?: continue
                if (isInDistrict(x, y, data)) {
                    view.showBorder = true
                    view.invalidate()
                    continue
                }
                view.showBorder = false
                view.invalidate()
            }
        }
    }

    init {
        initData(context)
        isMotionEventSplittingEnabled = false
        isChildrenDrawingOrderEnabled = true
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val mViewGroup = parent as ViewGroup
        if (mViewGroup.width > 0) mWidth = mViewGroup.width
        if (mViewGroup.height > 0) mHeight = mViewGroup.height
    }

    override fun getChildDrawingOrder(childCount: Int, drawingPosition: Int): Int {
        Log.e("d-test", "$childCount, $drawingPosition, ${dragViews[drawingPosition].index}")
        return dragViews[drawingPosition].index
    }

    fun initDistrictData(data: List<DistrictData>) {
        districtData.addAll(data)
        initChildren()
    }

    private fun initChildren() {
        var i = 0
        districtData.forEach {
            val view = DragView(context)
            view.index = i++
            view.setBackgroundColor(it.color)

            var w = 0
            var h = 0
            when(it.type) {
                SizeScaleType.ABSOLUTE -> {
                    w = (mWidth * it.x0).toInt()
                    h = (mHeight * it.x1).toInt()
                }
                SizeScaleType.WIDTH -> {
                    w = (mWidth * it.x0).toInt()
                    h = (w / it.x1).toInt()
                }
                SizeScaleType.HEIGHT -> {
                    h = (mHeight * it.x1).toInt()
                    w = (it.x1 * h).toInt()
                }
            }

            val lp = LayoutParams(w, h)

            val l = when(it.xType) {
                DistrictScaleType.ABSOLUTE -> (mWidth * it.xScale).toInt()
                DistrictScaleType.MID -> (mWidth - w) / 2
            }

            val t = when(it.yType) {
                DistrictScaleType.ABSOLUTE -> (mHeight * it.yScale).toInt()
                DistrictScaleType.MID -> (mHeight - h) / 2
            }

            val r = mWidth - l - w
            val b = mHeight - t - h
            it.initData(l, t, r, b, w, h)
            view.data = it
            view.setCallback(dragInnerCallback)

            lp.setMargins(l, t, r, b)
            view.layoutParams = lp
            addView(view)
            dragViews.add(view)
        }
    }

    private fun exchangeDestination(view1: DragView, view2: DragView) {
        val temp = view1.data
        view1.moveToDistrict(view2.data)
        view2.moveToDistrict(temp)
    }

    private fun isInDistrict(x: Int, y: Int, data: DistrictData): Boolean =
        x > data.left && x < data.left + data.width && y > data.top && y < data.top + data.height

    private fun initData(context: Context) {
        val wm = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val dm = DisplayMetrics()
        wm.defaultDisplay.getMetrics(dm)
        mWidth = dm.widthPixels
        mHeight = dm.heightPixels
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        anims.forEach { it.cancel() }
    }
}

interface DragInnerCallback {
    fun dragFinish(curView: DragView, x: Int, y: Int)

    fun moveToTop(curView: DragView)

    fun isInOtherDistrict(curView: DragView, x: Int, y: Int)
}