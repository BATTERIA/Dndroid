package com.bilibili.bililive.batteria.flow

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ValueAnimator
import android.content.Context
import android.util.AttributeSet
import android.util.LayoutDirection
import android.view.View
import android.view.ViewGroup
import android.widget.Space
import androidx.core.text.TextUtilsCompat
import com.bilibili.bililive.batteria.R
import kotlinx.android.synthetic.main.activity_animation_test.view.*
import org.jetbrains.anko.doAsync
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/11/30
 * @description:
 */
open class FlowLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : ViewGroup(context, attrs, defStyle) {
    private var mGravity: Int
    private val viewsPerLine: MutableList<MutableList<View?>> = mutableListOf()
    private val heightsPerLine: MutableList<Int> = mutableListOf()
    private val widthsPerLine: MutableList<Int> = mutableListOf()
    protected val goalLocations: MutableList<Location> = mutableListOf()

    init {
        isMotionEventSplittingEnabled = false
        val ta = context.obtainStyledAttributes(attrs, R.styleable.TagFlowLayout)
        mGravity = ta.getInt(R.styleable.TagFlowLayout_tag_gravity, LEFT)
        val layoutDirection: Int = TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault())
        if (layoutDirection == LayoutDirection.RTL) {
            mGravity = if (mGravity == LEFT) {
                RIGHT
            } else {
                LEFT
            }
        }
        ta.recycle()
    }

    override fun generateLayoutParams(attrs: AttributeSet): LayoutParams {
        return MarginLayoutParams(context, attrs)
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
        return MarginLayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
    }

    override fun generateLayoutParams(p: LayoutParams): LayoutParams {
        return MarginLayoutParams(p)
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val sizeWidth = MeasureSpec.getSize(widthMeasureSpec)
        val modeWidth = MeasureSpec.getMode(widthMeasureSpec)
        val sizeHeight = MeasureSpec.getSize(heightMeasureSpec)
        val modeHeight = MeasureSpec.getMode(heightMeasureSpec)

        // wrap_content
        var width = 0
        var height = 0
        var lineWidth = 0
        var lineHeight = 0
        val cCount = childCount
        for (i in 0 until cCount) {
            val child = getChildAt(i)
            if (child.visibility == GONE) {
                if (i == cCount - 1) {
                    width = max(lineWidth, width)
                    height += lineHeight
                }
                continue
            }

            if (filterView(child)) continue

            measureChild(child, widthMeasureSpec, heightMeasureSpec)
            val lp = child.layoutParams as MarginLayoutParams
            val childWidth = (child.measuredWidth + lp.leftMargin + lp.rightMargin)
            val childHeight = (child.measuredHeight + lp.topMargin + lp.bottomMargin)
            if (lineWidth + childWidth > sizeWidth - paddingLeft - paddingRight) {
                width = max(width, lineWidth)
                lineWidth = childWidth
                height += lineHeight
                lineHeight = childHeight
            } else {
                lineWidth += childWidth
                lineHeight = max(lineHeight, childHeight)
            }
            if (i == cCount - 1) {
                width = max(lineWidth, width)
                height += lineHeight
            }
        }
        setMeasuredDimension(
            if (modeWidth == MeasureSpec.EXACTLY) sizeWidth else width + paddingLeft + paddingRight,
            if (modeHeight == MeasureSpec.EXACTLY) sizeHeight else height + paddingTop + paddingBottom //
        )
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        evaluateChildrenSize()
        evaluateChildrenLocation()
        doLayout()
    }

    protected fun evaluateChildrenSize() {
        clearContainer()

        var lineViews: MutableList<View?> = mutableListOf()

        val width = width
        var lineWidth = 0
        var lineHeight = 0
        val cCount = childCount
        for (i in 0 until cCount) {
            val child = getChildAt(i)
            if (filterView(child)) continue
            val lp = child.layoutParams as MarginLayoutParams
            val childWidth = child.measuredWidth
            val childHeight = child.measuredHeight
            if (childWidth + lineWidth + lp.leftMargin + lp.rightMargin > width - paddingLeft - paddingRight) {
                heightsPerLine.add(lineHeight)
                viewsPerLine.add(lineViews)
                widthsPerLine.add(lineWidth)
                lineWidth = 0
                lineHeight = childHeight + lp.topMargin + lp.bottomMargin
                lineViews = ArrayList()
            }
            lineWidth += childWidth + lp.leftMargin + lp.rightMargin
            lineHeight = max(lineHeight, childHeight + lp.topMargin + lp.bottomMargin)
            lineViews.add(child)
        }
        heightsPerLine.add(lineHeight)
        widthsPerLine.add(lineWidth)
        viewsPerLine.add(lineViews)
    }

    protected  fun evaluateChildrenLocation() {
        clearLocations()
        var lineHeight: Int

        var lineViews: MutableList<View?>
        var left = paddingLeft
        var top = paddingTop
        val lineNum = viewsPerLine.size
        for (i in 0 until lineNum) {
            lineViews = viewsPerLine[i]
            lineHeight = heightsPerLine[i]

            // set gravity
            val currentLineWidth = widthsPerLine[i]
            when (mGravity) {
                LEFT -> left = paddingLeft
                CENTER -> left = (width - currentLineWidth) / 2 + paddingLeft
                RIGHT -> {
                    //  适配了rtl，需要补偿一个padding值
                    left = width - (currentLineWidth + paddingLeft) - paddingRight
                    //  适配了rtl，需要把lineViews里面的数组倒序排
                    lineViews.reverse()
                }
            }
            // 按存储顺序排序
            for (j in lineViews.indices) {
                val child = lineViews[j]
                if (child!!.visibility == GONE) {
                    continue
                }

                val lp = child.layoutParams as MarginLayoutParams
                val lc = left + lp.leftMargin
                val tc = top + lp.topMargin
                val rc = lc + child.measuredWidth
                val bc = tc + child.measuredHeight
                val loc = Location(lc, tc, rc, bc)
                tryUpdateStub(child, loc)
                goalLocations.add(loc)
                left += (child.measuredWidth + lp.leftMargin + lp.rightMargin)
            }
            top += lineHeight
        }
        clearContainer()
    }

    protected fun doLayout() {
        var locIndex = 0
        for (i in 0 until childCount) {
            val child = getChildAt(i)
            if (filterView(child)) continue
            val loc = goalLocations[locIndex++]
            child.layout(loc.l, loc.t, loc.r, loc.b)
        }
        clearLocations()
    }

    private fun clearLocations() {
        goalLocations.clear()
    }

    private fun clearContainer() {
        viewsPerLine.clear()
        heightsPerLine.clear()
        widthsPerLine.clear()
    }

    protected open fun tryUpdateStub(view: View, loc: Location) = Unit

    protected open fun filterView(view: View): Boolean = false

    companion object {
        private const val TAG = "FlowLayout"
        private const val LEFT = -1
        private const val CENTER = 0
        private const val RIGHT = 1
    }
}
