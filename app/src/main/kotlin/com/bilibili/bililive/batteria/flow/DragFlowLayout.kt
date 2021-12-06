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
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.max

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/6
 * @description:
 */
class DragFlowLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : FlowLayout(context, attrs, defStyle) {
    private var stubView: Space? = null
    // 动画过程中提前获取最终位置
    private var stubGoalLoc: Location? = null
    private var stubIndex = -1

    private var draggingView: View? = null

    fun setDraggingView(view: View) {
        draggingView = view
        stubGoalLoc = Location(view.left, view.top, view.right, view.bottom)
    }

    fun removeDraggingView() {
        draggingView = null
    }

    // 动态调整布局动画
    private var moveAnim: AnimatorSet? = null

    // 拖拽View移动到占位View动画
    private var replaceStubAnim: Animator? = null


    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        if (draggingView != null) return
        super.onLayout(changed, l, t, r, b)
    }

    private fun startAnimation() {
        if (moveAnim?.isRunning == true) return
        // todo 动画优化 合并

        var locIndex = 0
        val animatorSet = AnimatorSet()
        val animators: MutableList<Animator> = mutableListOf()
        for (i in 0 until childCount) {
            val child = getChildAt(i)
            // 拖拽View不走以下layout
            if (filterView(child)) continue

            val loc = goalLocations[locIndex++]
            // 是否需要动画
            if (child.left == loc.l && child.top == loc.t) continue
            val lAnim = ValueAnimator.ofFloat(1f)
            lAnim?.duration = 300
            lAnim?.addUpdateListener { animator ->
                val scale = animator.animatedValue as? Float ?: return@addUpdateListener
                val l = getCurrentData(child.left, loc.l, scale)
                val t = getCurrentData(child.top, loc.t, scale)
                val r = getCurrentData(child.right, loc.r, scale)
                val b = getCurrentData(child.bottom, loc.b, scale)
                child.layout(l, t, r, b)
            }
            animators.add(lAnim)
        }

        var isLayout = false

        fun layoutOnce() {
            if (isLayout) return
            isLayout = true
            doLayout()
        }

        animatorSet.addListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
            }

            override fun onAnimationEnd(animation: Animator?) {
                layoutOnce()
            }

            override fun onAnimationCancel(animation: Animator?) {
                layoutOnce()
            }

            override fun onAnimationRepeat(animation: Animator?) {
            }
        })
        animatorSet.playTogether(animators)
        animatorSet.start()
        moveAnim = animatorSet
    }

    private fun stopAnim() {
        moveAnim?.cancel()
        moveAnim = null
        replaceStubAnim?.cancel()
        replaceStubAnim = null
    }

    private fun getCurrentData(from: Int, to: Int, progress: Float): Int =
        (from + (to - from) * progress).toInt()

    override fun generateLayoutParams(attrs: AttributeSet): LayoutParams {
        return MarginLayoutParams(context, attrs)
    }

    override fun generateDefaultLayoutParams(): LayoutParams {
        return MarginLayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
    }

    override fun generateLayoutParams(p: LayoutParams): LayoutParams {
        return MarginLayoutParams(p)
    }

    override fun isChildrenDrawingOrderEnabled(): Boolean = true

    override fun getChildDrawingOrder(childCount: Int, drawingPosition: Int): Int {
        if (null == draggingView) return drawingPosition
        val draggingIndex = indexOfChild(draggingView)
        return when {
            drawingPosition == childCount - 1 -> draggingIndex
            drawingPosition >= draggingIndex -> drawingPosition + 1
            else -> drawingPosition
        }
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

    // todo 替换动画
    fun replaceStub(view: View, block: ()->Unit) {
        // 如果没有变化不需要动画

        val loc = stubGoalLoc ?: stubView?.run { Location(left, top, right, bottom) } ?: return

        animateTo(view, loc) {
            block()
            removeView(view)
            addView(view, stubIndex)
            removeStub()
        }
    }

    private fun animateTo(view: View, loc: Location, block: ()->Unit) {
        val lAnim = ValueAnimator.ofFloat(1f)
        lAnim?.duration = 300
        lAnim?.addUpdateListener { animator ->
            val scale = animator.animatedValue as? Float ?: return@addUpdateListener
            val l = getCurrentData(view.left, loc.l, scale)
            val t = getCurrentData(view.top, loc.t, scale)
            val r = getCurrentData(view.right, loc.r, scale)
            val b = getCurrentData(view.bottom, loc.b, scale)
            view.layout(l, t, r, b)
        }

        var isFirst = false

        fun executeOnce() {
            if (isFirst) return
            isFirst = true
            block()
        }

        lAnim.addListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
            }

            override fun onAnimationEnd(animation: Animator?) {
                executeOnce()
            }

            override fun onAnimationCancel(animation: Animator?) {
                executeOnce()
            }

            override fun onAnimationRepeat(animation: Animator?) {
            }
        })
        lAnim.start()
    }

    fun removeStub() {
        stubView?.let { removeView(it) }
        stubView = null
        stubIndex = -1
    }

    fun detectViewCollision(view: DragView, x: Int, y: Int) {
        // 在动不探测
        if (moveAnim?.isRunning == true) return

        val tx = x.coerceAtLeast(0)
        val ty = y.coerceAtLeast(0)
        val cCount = childCount
        for (i in 0 until cCount) {
            val child = getChildAt(i)
            if (child === stubView || filterView(child)) continue

            // todo: 动画。 动画结束后再实际调整children位置
            // todo: 动画开始前 设置该标志 预先调整children位置，进行measure，动画结束后，修改该标志
            // 调整当前占位Space的位置
            // 计算stub移动的目标位置
            var target = i
            when (hasCollision(tx, ty, child)) {
                0 -> continue
                2 -> target++
            }
            if (stubIndex < i) target--

            // 目标点和当前一致时不进行移动
            if (target == stubIndex) return

            val stub = stubView
            removeStub()

            if (null != stub) {
                insertStub(target, stub)
            } else {
                generateStub(target, Size(view.width, view.height))
            }

            // 记录当前位置，和目标位置
            evaluateChildrenSize()
            evaluateChildrenLocation()

            startAnimation()

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

    override fun tryUpdateStub(view: View, loc: Location) {
        if (view === stubView) stubGoalLoc = loc
    }

    override fun filterView(view: View): Boolean = view.visibility == View.GONE
        || (view is DragView && view.isDragging)

    companion object {
        private const val TAG = "DragFlowLayout"
    }
}