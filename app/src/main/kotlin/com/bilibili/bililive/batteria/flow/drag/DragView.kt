package com.bilibili.bililive.batteria.flow.drag

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.FrameLayout
import com.bilibili.bililive.batteria.flow.config.ConfigReader
import com.bilibili.bililive.batteria.flow.config.DefaultConfigReader
import com.bilibili.bililive.batteria.flow.internal.InternalDragController
import com.bilibili.bililive.batteria.flow.model.Size
import com.bilibili.bililive.batteria.util.LiveLogger
import com.bilibili.bililive.batteria.util.VibratorUtil
import kotlinx.coroutines.*

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

    // 是否处于拖拽中
    var isDragging = false

    var filterLongPress = false

    private var internalDragLayoutController: InternalDragController? = null
    private val dragLayoutController: InternalDragController?
        get() = internalDragLayoutController ?: parent as? InternalDragController

    private var configReader: ConfigReader = DefaultConfigReader()

    private var lastX = 0
    private var lastY = 0
    private var beginX = 0
    private var beginY = 0

    private var coroutineScope: CoroutineScope? = null
    private var longPressJob: Job? = null
    private val longPressAction = {
        isDragging = true

        // 震动
        if (configReader.vibrateEnable()) VibratorUtil.vibrate(configReader.vibrateDuration())

        dragLayoutController?.generateStub(this, Size(width, height))
        dragLayoutController?.setDraggingView(this)
    }

    init {
        isClickable = true
    }

    fun setConfigReader(reader: ConfigReader) {
        configReader = reader
    }

    fun setLayoutController(controller: InternalDragController) {
        internalDragLayoutController = controller
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent): Boolean {
        val rawX = event.rawX.toInt()
        val rawY = event.rawY.toInt()
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                isDragging = false
                if (filterLongPress) return true
                parent.requestDisallowInterceptTouchEvent(true)

                dragLayoutController?.removeDraggingView()

                cancelLongPressJob()
                longPressJob = coroutineScope?.launch {
                    delay(PRESS_TIME)
                    longPressAction()
                }

                lastX = rawX
                lastY = rawY
                beginX = lastX
                beginY = lastY
            }
            MotionEvent.ACTION_MOVE -> {
                if (!isDragging || filterLongPress) return true

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
                cancelLongPressJob()

                if (!isDragging || filterLongPress) {
                    performClick()
                    return true
                }
                parent.requestDisallowInterceptTouchEvent(false)

                // 落地
                dragLayoutController?.replaceStub(this) {
                    isDragging = false
                    dragLayoutController?.removeDraggingView()
                }

                return true
            }
        }
        return true
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        coroutineScope = MainScope()
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        cancelLongPressJob()
        coroutineScope?.cancel()
        coroutineScope = null
    }

    private fun cancelLongPressJob() {
        longPressJob?.cancel()
        longPressJob = null
    }

    override val logTag: String
        get() = TAG

    companion object {
        private const val TAG = "DragContainerView"
        private const val PRESS_TIME = 300L
    }
}