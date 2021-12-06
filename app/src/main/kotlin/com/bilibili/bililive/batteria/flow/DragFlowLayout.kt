package com.bilibili.bililive.batteria.flow

import android.animation.Animator
import android.animation.ValueAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Space
import java.util.*

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
) : FlowLayout(context, attrs, defStyle), DragLayoutController {
    /**
     * 拖拽时的占位视图
     */
    private var stubView: Space? = null
    private var stubIndex = -1

    // 动画过程中提前获取最终位置
    private var stubGoalLoc: Location? = null

    /**
     * 拖拽中的视图
     */
    private var draggingView: View? = null

    // 动态调整布局动画
    private var moveAnim: Animator? = null

    // 拖拽View移动到占位View动画
    private var replaceStubAnim: Animator? = null


    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        if (draggingView != null) return
        super.onLayout(changed, l, t, r, b)
    }

    override fun generateStub(view: View, size: Size) {
        doGenerateStub(indexOfChild(view), size)
    }

    override fun replaceStub(view: View, onFinish: () -> Unit) {
        val loc = stubGoalLoc ?: stubView?.run { Location(left, top, right, bottom) } ?: return

        animateToStub(view, loc) {
            onFinish()
            removeView(view)
            addView(view, stubIndex)
            removeStub()
        }
    }

    override fun setDraggingView(view: View) {
        draggingView = view
        stubGoalLoc = Location(view.left, view.top, view.right, view.bottom)
    }

    override fun removeDraggingView() {
        draggingView = null
    }

    override fun detectViewCollision(view: DragView, x: Int, y: Int) {
        // 移动动画过程中不探测
        if (moveAnim?.isRunning == true) return

        val tx = x.coerceAtLeast(0)
        val ty = y.coerceAtLeast(0)
        val cCount = childCount
        for (i in 0 until cCount) {
            val child = getChildAt(i)
            if (child === stubView || filterView(child)) continue

            // stub需要移动的目标位置
            var target = i
            when (hasCollision(tx, ty, child)) {
                CollisionType.NONE -> {
                    // 未再区域内返回
                    continue
                }
                CollisionType.RIGHT -> target++
                else -> Unit
            }
            if (stubIndex < i) target--

            // 目标点和当前一致时不进行移动
            if (target == stubIndex) return

            // 调整stub在children中的位置
            moveStubOrder(target, view)

            // 调整重排children位置
            adjustChildren()
            break
        }
    }

    /**
     * 更新占位视图位置
     */
    override fun tryUpdateStub(view: View, loc: Location) {
        if (view === stubView) stubGoalLoc = loc
    }

    /**
     * 过滤不可见和拖拽视图
     */
    override fun filterView(view: View): Boolean = view.visibility == View.GONE
        || (view is DragView && view.isDragging)

    /**
     * 自定义配置绘制顺序
     */
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

    /**
     * 整体重排动画
     */
    private fun startMoveAnim() {
        if (moveAnim?.isRunning == true) return

        val anim = ValueAnimator.ofFloat(1f)
        anim?.duration = 300
        anim?.addUpdateListener { animator ->
            val scale = animator.animatedValue as? Float ?: return@addUpdateListener
            var locIndex = 0

            for (i in 0 until childCount) {
                val child = getChildAt(i)

                if (filterView(child)) continue

                val loc = goalLocations[locIndex++]

                // 是否需要动画
                if (child.left == loc.l && child.top == loc.t) continue

                val l = getCurrentData(child.left, loc.l, scale)
                val t = getCurrentData(child.top, loc.t, scale)
                val r = getCurrentData(child.right, loc.r, scale)
                val b = getCurrentData(child.bottom, loc.b, scale)
                child.layout(l, t, r, b)
            }
        }

        // 动画结束后再实际调整children位置
        anim.addListener(getAnimatorListener(::doLayout))
        anim.start()
        moveAnim = anim
    }

    /**
     * 获取动画进度
     */
    private fun getCurrentData(from: Int, to: Int, progress: Float): Int =
        (from + (to - from) * progress).toInt()

    /**
     * 调整stub在children中的位置
     */
    private fun moveStubOrder(target: Int, view: View) {
        val stub = stubView
        removeStub()
        if (null != stub) {
            insertStub(target, stub)
        } else {
            doGenerateStub(target, Size(view.width, view.height))
        }
    }

    private fun doGenerateStub(index: Int, size: Size) {
        val space = Space(context)
        space.minimumWidth = size.width
        space.minimumHeight = size.height
        insertStub(index, space)
    }

    /**
     * 插入占位视图
     */
    private fun insertStub(index: Int, stub: Space) {
        addView(stub, index)
        stubIndex = index
        stubView = stub
    }

    /**
     * 调整重排children位置
     */
    private fun adjustChildren() {
        // 记录当前位置，和目标位置
        evaluateChildrenSize()
        evaluateChildrenLocation()

        // 动画调整当前占位Space的位置，整体重排
        startMoveAnim()
    }

    /**
     * 拖拽视图移动到占位视图所在位置
     */
    private fun animateToStub(view: View, loc: Location, block: () -> Unit) {
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

        lAnim.addListener(getAnimatorListener(block))
        lAnim.start()
    }

    private fun removeStub() {
        stubView?.let { removeView(it) }
        stubView = null
        stubIndex = -1
    }

    /**
     * 检测是否到达其他区域内
     * 0无接触，1左半边，2右半边
     */
    private fun hasCollision(x: Int, y: Int, targetView: View): CollisionType =
        when {
            !(y > targetView.top && y < targetView.bottom) -> CollisionType.NONE
            x > targetView.left && x < (targetView.right + targetView.left) / 2 -> CollisionType.LEFT
            x >= (targetView.right + targetView.left) / 2 && x < targetView.right -> CollisionType.RIGHT
            else -> CollisionType.NONE
        }

    private fun getAnimatorListener(onFinish: () -> Unit): Animator.AnimatorListener {
        var isFirst = false

        fun wrapper() {
            if (isFirst) return
            isFirst = true
            onFinish()
        }
        return object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) = Unit

            override fun onAnimationEnd(animation: Animator?) {
                wrapper()
            }

            override fun onAnimationCancel(animation: Animator?) {
                wrapper()
            }

            override fun onAnimationRepeat(animation: Animator?) = Unit
        }
    }

    private fun stopAnim() {
        moveAnim?.cancel()
        moveAnim = null
        replaceStubAnim?.cancel()
        replaceStubAnim = null
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        stopAnim()
    }

    companion object {
        private const val TAG = "DragFlowLayout"
    }
}