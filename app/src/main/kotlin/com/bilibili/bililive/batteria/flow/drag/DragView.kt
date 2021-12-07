package com.bilibili.bililive.batteria.flow.drag

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.FrameLayout
import com.bilibili.bililive.batteria.flow.internal.InnerDragController
import com.bilibili.bililive.batteria.flow.model.Size
import com.bilibili.bililive.batteria.util.HandlerThreads
import com.bilibili.bililive.batteria.util.LiveLogger
import com.bilibili.bililive.batteria.util.VibratorUtil

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/8/9
 * @description: 拖拽容器
 */
class DragView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attributeSet, defStyleAttr), LiveLogger {
    private var innerDragLayoutController: InnerDragController? = null
    private val dragLayoutController: InnerDragController?
        get() = innerDragLayoutController ?: parent as? InnerDragController

    // 是否处于拖拽中
    var isDragging = false

    private var vibrateEnable: Boolean = true
    private var vibrateDuration: Long = 100

    private var lastX = 0
    private var lastY = 0
    private var beginX = 0
    private var beginY = 0

    private val longTouchRunnable = Runnable {
        isDragging = true

        // 震动
        if (vibrateEnable) VibratorUtil.vibrate(vibrateDuration)

        dragLayoutController?.generateStub(this, Size(width, height))
        dragLayoutController?.setDraggingView(this)
    }

    init {
        isClickable = true
    }

    fun setLayoutController(controller: InnerDragController) {
        innerDragLayoutController = controller
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent): Boolean {
        val rawX = event.rawX.toInt()
        val rawY = event.rawY.toInt()
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                isDragging = false
                dragLayoutController?.removeDraggingView()

                // todo 延时使用协程
                HandlerThreads.postDelayed(HandlerThreads.THREAD_UI, longTouchRunnable, 500)

                lastX = rawX
                lastY = rawY
                beginX = lastX
                beginY = lastY
            }
            MotionEvent.ACTION_MOVE -> {
                if (!isDragging) return false

                dragLayoutController?.detectViewCollision(this, rawX, rawY)

                val dx = rawX - lastX
                val dy = rawY - lastY

                val lc = left + dx
                val tc = top + dy
                val rc = lc + measuredWidth
                val bc = tc + measuredHeight
                layout(lc, tc, rc, bc)

                lastX = rawX
                lastY = rawY
            }
            MotionEvent.ACTION_UP -> {
                HandlerThreads.remove(HandlerThreads.THREAD_UI, longTouchRunnable)

                if (!isDragging) return false

                // 落地
                dragLayoutController?.replaceStub(this) {
                    isDragging = false
                    dragLayoutController?.removeDraggingView()
                }

                return true
            }
        }
        return super.onTouchEvent(event)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        HandlerThreads.remove(HandlerThreads.THREAD_UI, longTouchRunnable)
    }

    override val logTag: String
        get() = TAG

    companion object {
        private const val TAG = "DragContainerView"
    }
}