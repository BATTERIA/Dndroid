package com.bilibili.bililive.batteria.flow

import android.content.Context
import android.util.AttributeSet
import android.util.LayoutDirection
import android.view.View
import android.view.ViewGroup
import android.widget.Space
import androidx.core.text.TextUtilsCompat
import com.bilibili.bililive.batteria.R
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/11/30
 * @description:
 */
class FlowLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : ViewGroup(context, attrs, defStyle) {
    private var stubView: Space? = null
    private var stubIndex = -1

    protected var mAllViews: MutableList<MutableList<View?>> = ArrayList()
    protected var mLineHeight: MutableList<Int> = ArrayList()
    protected var mLineWidth: MutableList<Int> = ArrayList()
    private var mGravity: Int
    private var lineViews: MutableList<View?> = ArrayList()

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
            measureChild(child, widthMeasureSpec, heightMeasureSpec)
            val lp = child
                .layoutParams as MarginLayoutParams
            val childWidth = (child.measuredWidth + lp.leftMargin
                + lp.rightMargin)
            val childHeight = (child.measuredHeight + lp.topMargin
                + lp.bottomMargin)
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
        mAllViews.clear()
        mLineHeight.clear()
        mLineWidth.clear()
        lineViews.clear()
        val width = width
        var lineWidth = 0
        var lineHeight = 0
        val cCount = childCount
        for (i in 0 until cCount) {
            val child = getChildAt(i)
            if (child.visibility == GONE) continue
            if (isDraggingView(child)) {
                lineViews.add(child)
                continue
            }
            val lp = child.layoutParams as MarginLayoutParams
            val childWidth = child.measuredWidth
            val childHeight = child.measuredHeight
            if (childWidth + lineWidth + lp.leftMargin + lp.rightMargin > width - paddingLeft - paddingRight) {
                mLineHeight.add(lineHeight)
                mAllViews.add(lineViews)
                mLineWidth.add(lineWidth)
                lineWidth = 0
                lineHeight = childHeight + lp.topMargin + lp.bottomMargin
                lineViews = ArrayList()
            }
            lineWidth += childWidth + lp.leftMargin + lp.rightMargin
            lineHeight = max(lineHeight, childHeight + lp.topMargin + lp.bottomMargin)
            lineViews.add(child)
        }
        mLineHeight.add(lineHeight)
        mLineWidth.add(lineWidth)
        mAllViews.add(lineViews)
        var left = paddingLeft
        var top = paddingTop
        val lineNum = mAllViews.size
        for (i in 0 until lineNum) {
            lineViews = mAllViews[i]
            lineHeight = mLineHeight[i]

            // set gravity
            val currentLineWidth = mLineWidth[i]
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

                if (isDraggingView(child)) {
                    val lp = child.layoutParams as MarginLayoutParams
                    val lc =
                        if (lp.leftMargin == 0) (left - child.measuredWidth).coerceAtLeast(0)
                        else lp.leftMargin

                    val tc = if (lp.topMargin == 0) top else lp.topMargin
                    val rc = lc + child.measuredWidth
                    val bc = tc + child.measuredHeight
                    child.layout(lc, tc, rc, bc)
                } else {
                    val lp = child.layoutParams as MarginLayoutParams
                    val lc = left + lp.leftMargin
                    val tc = top + lp.topMargin
                    val rc = lc + child.measuredWidth
                    val bc = tc + child.measuredHeight
                    child.layout(lc, tc, rc, bc)
                    left += (child.measuredWidth + lp.leftMargin + lp.rightMargin)
                }
            }
            top += lineHeight
        }
    }

    private fun isDraggingView(view: View): Boolean = view is DragView && view.isDragging

    override fun generateLayoutParams(attrs: AttributeSet): LayoutParams {
        return MarginLayoutParams(context, attrs)
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
        return MarginLayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
    }

    override fun generateLayoutParams(p: LayoutParams): LayoutParams {
        return MarginLayoutParams(p)
    }

    fun generateStub(index: Int, size: Size) {
        val space = Space(context)
        space.minimumWidth = size.width
        space.minimumHeight = size.height
        insertStub(index, space)
    }

    private fun insertStub(index: Int, stub: Space) {
        addView(stub, index)
        stubIndex = index
        stubView = stub
    }

    fun replaceStub(view: View) {
        removeView(view)
        addView(view, stubIndex)
        removeStub()
    }

    fun removeStub() {
        stubView?.let { removeView(it) }
        stubView = null
        stubIndex = -1
    }

    fun detectViewCollision(view: DragView, x: Int, y: Int) {
        val tx = x.coerceAtLeast(0)
        val ty = y.coerceAtLeast(0)
        val cCount = childCount
        for (i in 0 until cCount) {
            val child = getChildAt(i)
            if (child is Space) continue

            if (isDraggingView(child)) continue

            // 调整当前DragView的位置
            var target = i
            when (hasCollision(tx, ty, child)) {
                0 -> continue
                1 -> {

                }
                2 -> {
                    target++
                }
            }

            if (stubIndex < i) target--

//                removeView(view)
            val stub = stubView
            removeStub()

//                addView(view, target)
            if (null != stub) {
                insertStub(target, stub)
            } else {
                generateStub(target, Size(view.width, view.height))
            }
            break
        }
    }

    // 0无接触，1左半边，2右半边
    private fun hasCollision(x: Int, y: Int, targetView: View): Int =
        when {
            !(y > targetView.top && y < targetView.bottom) -> 0
            x > targetView.left && x < (targetView.right + targetView.left) / 2 -> 1
            x >= (targetView.right + targetView.left) / 2 && x < targetView.right -> 2
            else -> 0
        }


    companion object {
        private const val TAG = "FlowLayout"
        private const val LEFT = -1
        private const val CENTER = 0
        private const val RIGHT = 1
    }

    init {
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
}
