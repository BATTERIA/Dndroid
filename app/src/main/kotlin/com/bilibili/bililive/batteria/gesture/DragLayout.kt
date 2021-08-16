package com.bilibili.bililive.batteria.gesture

import android.animation.AnimatorSet
import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import android.widget.FrameLayout
import com.bilibili.bililive.batteria.util.LiveLogger
import com.bilibili.bililive.batteria.util.ScreenUtil
import com.bilibili.bililive.batteria.util.logError

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/8/9
 * @description: 拖拽布局
 *
 * [DragConfig] 大部分参数支持灵活配置
 * [DistrictData] 灵活配置子布局位置
 * 请全屏使用，否则需要调用initSize，设置宽高
 *
 * e.g.
 * val dl = DragLayout(this)
 * dl.initDistrictData(
 *     listOf(DistrictData(DistrictScaleType.ABSOLUTE, 0f, DistrictScaleType.MID,
 *             0f, SizeScaleType.WIDTH, 0.62f, 1.7778f, view1),
 *         DistrictData(DistrictScaleType.ABSOLUTE, 0.62f, DistrictScaleType.MID,
 *             0f, SizeScaleType.WIDTH, 0.38f, 1.7778f, view2)))
 * dl.initConfig(DragConfig(20, 0.8f, 200, 500, true, 100))
 */
class DragLayout @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ViewGroup(context, attributeSet, defStyleAttr), LiveLogger {
    private val districtData: MutableList<DistrictData> = mutableListOf()

    // 由于查找比修改要多很多所以采用数组，并且实际使用场景容器大小不会很大，性能问题不大
    private val dragViews: MutableList<DragContainerView> = mutableListOf()
    private var mWidth = 0
    private var mHeight = 0
    private val screenWidth = ScreenUtil.getScreenWidth(context)
    private val screenHeight = ScreenUtil.getScreenHeight(context)
    private var anims = mutableListOf<AnimatorSet>()

    private var dragConfig: DragConfig? = null

    private val dragInnerCallback = object : DragInnerCallback {
        override fun dragFinish(curView: DragContainerView, x: Int, y: Int) {
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

        override fun moveToTop(curView: DragContainerView) {
            dragViews.remove(curView)
            dragViews.add(curView)
        }

        override fun isInOtherDistrict(curView: DragContainerView, x: Int, y: Int) {
            for (view in dragViews) {
                if (view == curView) continue
                val data = view.data ?: continue
                if (isInDistrict(x, y, data)) {
                    view.borderEnable(true)
                    view.invalidate()
                    continue
                }
                view.borderEnable(false)
                view.invalidate()
            }
        }

        override fun stopAnim() {
            dragViews.forEach { it.stopAnim() }
        }
    }

    init {
        initData()
        isMotionEventSplittingEnabled = false
        isChildrenDrawingOrderEnabled = true
    }

    // 该方法需要在[initDistrictData]方法前调用
    fun initConfig(config: DragConfig) {
        dragConfig = config
    }

    fun initDistrictData(data: List<DistrictData>) {
        districtData.addAll(data)
        initChildren()
    }

    fun setDragEnable(enable: Boolean) {
        dragViews.forEach { it.dragEnable = enable }
    }

    fun updateDistrictData(data: List<DistrictData>) {
        dragViews.forEach {
            it.dragEnable = false
            it.removeAllViews()
        }
        dragViews.clear()
        districtData.clear()
        districtData.addAll(data)
        initChildren()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val parentWidth = MeasureSpec.getSize(widthMeasureSpec)
        val parentHeight = MeasureSpec.getSize(heightMeasureSpec)
        for (i in 0 until childCount) {
            val child = getChildAt(i) as? DragContainerView
            if (null == child) {
                logError { "onMeasure error child is null" }
                continue
            }
            val data = child.data
            if (null == data) {
                logError { "onMeasure error district data is null" }
                continue
            }

            var width = 0
            var height = 0
            if (child.isInit) {
                width = MeasureSpec.makeMeasureSpec(child.layoutParams.width, MeasureSpec.EXACTLY)
                height = MeasureSpec.makeMeasureSpec(child.layoutParams.height, MeasureSpec.EXACTLY)
            } else {
                var w = 0
                var h = 0

                when (data.type) {
                    SizeScaleType.ABSOLUTE -> {
                        w = (parentWidth * data.x0).toInt()
                        h = (parentHeight * data.x1).toInt()
                    }
                    SizeScaleType.WIDTH -> {
                        w = (parentWidth * data.x0).toInt()
                        h = (w / data.x1).toInt()
                    }
                    SizeScaleType.HEIGHT -> {
                        h = (parentHeight * data.x1).toInt()
                        w = (data.x1 * h).toInt()
                    }
                }
                width = MeasureSpec.makeMeasureSpec(w, MeasureSpec.EXACTLY)
                height = MeasureSpec.makeMeasureSpec(h, MeasureSpec.EXACTLY)
                (child.layoutParams as? FrameLayout.LayoutParams)?.let {
                    it.width = w
                    it.height = h
                    child.layoutParams = it
                }
            }

            child.measure(width, height)
        }

        setMeasuredDimension(parentWidth, parentHeight)
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        val parentWidth = right - left
        val parentHeight = bottom - top

        for (i in 0 until childCount) {
            val child = getChildAt(i) as? DragContainerView
            if (null == child) {
                logError { "onMeasure error child is null" }
                continue
            }
            val data = child.data
            if (null == data) {
                logError { "onMeasure error district data is null" }
                continue
            }
            val w = child.measuredWidth
            val h = child.measuredHeight

            var l = 0
            var t = 0

            val lp = child.layoutParams as? FrameLayout.LayoutParams

            if (child.isInit) {
                lp?.let {
                    l = it.leftMargin
                    t = it.topMargin
                }
            } else {
                child.isInit = true

                l = when (data.xType) {
                    DistrictScaleType.ABSOLUTE -> (parentWidth * data.xScale).toInt()
                    DistrictScaleType.MID -> (parentWidth - w) / 2
                }

                t = when (data.yType) {
                    DistrictScaleType.ABSOLUTE -> (parentHeight * data.yScale).toInt()
                    DistrictScaleType.MID -> (parentHeight - h) / 2
                }

                lp?.let {
                    it.width = w
                    it.height = h
                    it.setMargins(l, t, parentWidth - w - l, parentHeight - h - t)
                    child.layoutParams = it
                }
            }

            val r = l + w
            val b = t + h

            if (!data.isInit) data.initData(l, t, parentWidth - w - l, parentHeight - h - t, w, h)
            child.layout(l, t, r, b)
        }
    }

    // 初始化所有children
    private fun initChildren() {
        removeAllViews()
        var i = 0
        districtData.forEach {
            val view = DragContainerView(context)
            view.index = i++
            view.initSize(mWidth, mHeight)
            view.setConfig(dragConfig)
            view.setInnerView(it.view)
            view.data = it
            view.setCallback(dragInnerCallback)
            view.layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT)
            addView(view)
            dragViews.add(view)
        }
    }

    private fun exchangeDestination(view1: DragContainerView, view2: DragContainerView) {
        val temp = view1.data
        view1.moveToDistrict(view2.data)
        view2.moveToDistrict(temp)
    }

    private fun isInDistrict(x: Int, y: Int, data: DistrictData): Boolean =
        x > data.left && x < data.left + data.width && y > data.top && y < data.top + data.height

    private fun initData() {
        mWidth = screenWidth
        mHeight = screenHeight
    }

    override fun getChildDrawingOrder(childCount: Int, drawingPosition: Int): Int {
        return dragViews[drawingPosition].index
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        anims.forEach { it.cancel() }
    }

    override val logTag: String
        get() = TAG

    companion object {
        private const val TAG = "DragLayout"
    }
}

interface DragInnerCallback {
    fun dragFinish(curView: DragContainerView, x: Int, y: Int)

    fun moveToTop(curView: DragContainerView)

    fun isInOtherDistrict(curView: DragContainerView, x: Int, y: Int)

    fun stopAnim()
}