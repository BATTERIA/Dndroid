package com.bilibili.bililive.batteria.gesture

import android.animation.AnimatorSet
import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import com.bilibili.bililive.batteria.util.ScreenUtil

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
) : FrameLayout(context, attributeSet, defStyleAttr) {
    private val districtData: MutableList<DistrictData> = mutableListOf()

    // 由于查找比修改要多很多所以采用数组，并且实际使用场景容器大小不会很大，性能问题不大
    private val dragViews: MutableList<DragContainerView> = mutableListOf()
    private var mWidth = 0
    private var mHeight = 0
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
    }

    init {
        initData(context)
        isMotionEventSplittingEnabled = false
        isChildrenDrawingOrderEnabled = true
    }

    fun initConfig(config: DragConfig) {
        dragConfig = config
    }

    fun initDistrictData(data: List<DistrictData>) {
        districtData.addAll(data)
        initChildren()
    }

    fun initSize(width: Int, height: Int) {
        mWidth = width
        mHeight = height
    }

    // 初始化所有children
    private fun initChildren() {
        var i = 0
        districtData.forEach {
            val view = DragContainerView(context)
            view.index = i++
            view.initSize(mWidth, mHeight)
            view.setConfig(dragConfig)
            view.setInnerView(it.view)

            var w = 0
            var h = 0
            when (it.type) {
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

            val l = when (it.xType) {
                DistrictScaleType.ABSOLUTE -> (mWidth * it.xScale).toInt()
                DistrictScaleType.MID -> (mWidth - w) / 2
            }

            val t = when (it.yType) {
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

    private fun exchangeDestination(view1: DragContainerView, view2: DragContainerView) {
        val temp = view1.data
        view1.moveToDistrict(view2.data)
        view2.moveToDistrict(temp)
    }

    private fun isInDistrict(x: Int, y: Int, data: DistrictData): Boolean =
        x > data.left && x < data.left + data.width && y > data.top && y < data.top + data.height

    private fun initData(context: Context) {
        mWidth = ScreenUtil.getScreenWidth(context)
        mHeight = ScreenUtil.getScreenHeight(context)
    }

    override fun getChildDrawingOrder(childCount: Int, drawingPosition: Int): Int {
        return dragViews[drawingPosition].index
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        anims.forEach { it.cancel() }
    }
}

interface DragInnerCallback {
    fun dragFinish(curView: DragContainerView, x: Int, y: Int)

    fun moveToTop(curView: DragContainerView)

    fun isInOtherDistrict(curView: DragContainerView, x: Int, y: Int)
}