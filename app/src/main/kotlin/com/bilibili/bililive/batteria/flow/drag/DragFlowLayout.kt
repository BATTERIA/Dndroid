package com.bilibili.bililive.batteria.flow.drag

import android.animation.Animator
import android.animation.ValueAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Space
import com.bilibili.bililive.batteria.R
import com.bilibili.bililive.batteria.flow.*
import com.bilibili.bililive.batteria.flow.core.FlowLayout
import com.bilibili.bililive.batteria.flow.config.Config
import com.bilibili.bililive.batteria.flow.config.ConfigReader
import com.bilibili.bililive.batteria.flow.internal.InternalDragController
import com.bilibili.bililive.batteria.flow.model.Location
import com.bilibili.bililive.batteria.flow.model.Size
import com.bilibili.bililive.batteria.flow.text.DragTagState
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
) : FlowLayout(context, attrs, defStyle), InternalDragController, DataSynchronizer {
    private var dragTagAdapter: IDragTagAdapter<*, *>? = null
    private var viewHolders = mutableListOf<IDragTagViewHolder>()

    /**
     * 内部配置
     */
    private var config: Config = Config.default()

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

    private var draggingViewIndex: Int = -1

    // 动态调整布局动画
    private var moveAnim: Animator? = null

    // 拖拽View移动到占位View动画
    private var replaceStubAnim: Animator? = null

    val configReader = object : ConfigReader {
        override fun moveAnimDuration(): Int = config.moveAnimDuration

        override fun resumeAnimDuration(): Int = config.resumeAnimDuration

        override fun vibrateEnable(): Boolean = config.vibrateEnable

        override fun vibrateDuration(): Long = config.vibrateDuration
    }

    init {
        val attributes = context.obtainStyledAttributes(attrs, R.styleable.DragFlowLayout)
        config.moveAnimDuration = attributes.getInt(
            R.styleable.DragFlowLayout_move_anim_duration,
            Config.DEFAULT_MOVE_ANIM_DURATION
        )
        config.resumeAnimDuration = attributes.getInt(
            R.styleable.DragFlowLayout_resume_anim_duration,
            Config.DEFAULT_RESUME_ANIM_DURATION
        )
        config.vibrateEnable = attributes.getBoolean(
            R.styleable.DragFlowLayout_vibrate_enable,
            Config.DEFAULT_VIBRATE_ENABLE
        )
        config.vibrateDuration = attributes.getInteger(
            R.styleable.DragFlowLayout_vibrate_duration,
            Config.DEFAULT_VIBRATE_DURATION.toInt()
        ).toLong()
        attributes.recycle()
    }

    fun setMoveAnimDuration(duration: Int): DragFlowLayout {
        config.moveAnimDuration = duration
        return this
    }

    fun setResumeAnimDuration(duration: Int): DragFlowLayout {
        config.resumeAnimDuration = duration
        return this
    }

    fun setVibrateEnable(enable: Boolean): DragFlowLayout {
        config.vibrateEnable = enable
        return this
    }

    fun setVibrateDuration(duration: Long): DragFlowLayout {
        config.vibrateDuration = duration
        return this
    }

    fun <VH : IDragTagViewHolder> setLayoutAdapter(adapter: IDragTagAdapter<*, VH>): DragFlowLayout {
        dragTagAdapter = adapter
        adapter.setDataSynchronizer(this)

        repeat(adapter.getItemCount()) {
            createViewLast(adapter, it)
        }

        return this
    }

    private fun <VH : IDragTagViewHolder> createViewLast(
        adapter: IDragTagAdapter<*, VH>,
        index: Int
    ) {
        val viewHolder = adapter.onCreateViewHolder(this, adapter.getItemViewType(index))
        viewHolders.add(viewHolder)
        adapter.onBindViewHolder(viewHolder, index)
        val view = viewHolder.itemView
        if (view is DragView) {
            view.setLayoutController(this)
            view.setConfigReader(configReader)
        }
        addView(view)
    }

    // 目前该方法仅支持单一数据删除或者尾部增加，其他情况可能会出现不可预计的错误
    override fun updateData() {
        val adapter = dragTagAdapter ?: return
        if (adapter.getItemCount() == viewHolders.size) return

        var oldIndex = 0
        var newIndex = 0
        while (oldIndex < viewHolders.size || newIndex < adapter.getItemCount()) {
            if (oldIndex >= viewHolders.size) {
                createViewLast(adapter, oldIndex)
                return
            }
            if (viewHolders[oldIndex].label != adapter.getItemLabel(newIndex)) {
                removeView(viewHolders[oldIndex].itemView)
                viewHolders.removeAt(oldIndex)
            }
            oldIndex++
            newIndex++
        }
    }

    override fun setEditState(isEdit: Boolean) {
        viewHolders.forEach {
            val editableState =
                if (it.isEditable) DragTagState.EDITABLE else DragTagState.UNEDITABLE
            it.turnTo(if (isEdit) editableState else DragTagState.DEFAULT)
        }
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        if (draggingView != null) return
        super.onLayout(changed, l, t, r, b)
    }

    /**
     * 生成占位视图
     */
    override fun generateStub(view: View, size: Size) {
        doGenerateStub(indexOfChild(view), size)
    }

    /**
     * 拖拽视图移动至占位视图处，并移除占位视图
     */
    override fun replaceStub(view: View, onFinish: () -> Unit) {
        // 切换为普通编辑状态
        viewHolders[draggingViewIndex].turnTo(DragTagState.EDITABLE)

        val loc = stubGoalLoc ?: stubView?.run { Location(left, top, right, bottom) } ?: return

        animateToStub(view, loc) {
            onFinish()
            removeView(view)
            addView(view, stubIndex)
            removeStub()
            draggingViewIndex - 1
        }
    }

    override fun setDraggingView(view: View) {
        draggingView = view
        stubGoalLoc = Location(view.left, view.top, view.right, view.bottom)
        val index = indexOfChild(view)
        draggingViewIndex = if (-1 != stubIndex && stubIndex < index) index - 1 else index

        if (draggingViewIndex >= 0) viewHolders[draggingViewIndex].turnTo(DragTagState.DRAGGING)
    }

    override fun removeDraggingView() {
        draggingView = null
    }

    /**
     * 探测是否需要调整children排序
     */
    override fun detectViewCollision(view: DragView, rawX: Int, rawY: Int) {
        // 移动动画过程中不探测
        if (moveAnim?.isRunning == true) return

        // 使用视图中心检测
//        val tx = (view.left + (view.right - view.left) / 2).coerceAtLeast(0)
//        val ty = (view.top + (view.bottom - view.top) / 2).coerceAtLeast(0)

        // 使用触摸位置检测
        val array = IntArray(2)
        getLocationOnScreen(array)
        val tx = (rawX - array[0]).coerceAtLeast(0)
        val ty = (rawY - array[1]).coerceAtLeast(0)

        val cCount = childCount
        for (i in 0 until cCount) {
            val child = getChildAt(i)
            if (child === stubView || filterView(child) || (child is DragView && child.filterLongPress)) continue

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

            // 通知adapter数据更新
            val dragIndex = indexOfChild(draggingView)
            val to = if (dragIndex <= target) target - 1 else target
            itemMoved(draggingViewIndex, to)

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
        anim?.duration = config.moveAnimDuration.toLong()
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
        lAnim?.duration = config.resumeAnimDuration.toLong()
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

    /**
     * 拖拽过程中就通知调整 Holder和Adapter 中视图的位置
     */
    private fun itemMoved(from: Int, to: Int) {
        if (from == to) return
        dragTagAdapter?.notifyItemMoved(from, to)
        if (from == to || from !in 0 until viewHolders.size || to !in 0 until viewHolders.size) return
        val t = viewHolders.removeAt(from)
        viewHolders.add(to, t)
        draggingViewIndex = to
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