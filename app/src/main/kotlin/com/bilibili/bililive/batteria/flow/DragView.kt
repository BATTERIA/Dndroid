package com.bilibili.bililive.batteria.flow

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.FrameLayout
import com.bilibili.bililive.batteria.gesture.BorderView
import com.bilibili.bililive.batteria.gesture.DistrictData
import com.bilibili.bililive.batteria.gesture.DragConfig
import com.bilibili.bililive.batteria.gesture.DragInnerCallback
import com.bilibili.bililive.batteria.util.HandlerThreads
import com.bilibili.bililive.batteria.util.LiveLogger
import com.bilibili.bililive.batteria.util.VibratorUtil

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/8/9
 * @description: 拖拽容器
 * [setInnerView] 动态设置内部View
 */
class DragView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attributeSet, defStyleAttr), LiveLogger {
    // 标志位
    var isDragging = false

    var index = 0
    var data: DistrictData? = null

    private var lastX = 0
    private var lastY = 0
    private var beginX = 0
    private var beginY = 0

    private var borderWidth: Int = 20
    private var vibrateEnable: Boolean = true
    private var vibrateDuration: Long = 100
    private var shrinkScale: Float = 0.8f
    private var shrinkDuration: Long = 200
    private var exchangeDuration: Long = 500
    var dragEnable: Boolean = true
    var isInit = false

//    private var dragInnerCallback: DragInnerCallback? = null

    private val longTouchRunnable = Runnable {
        isDragging = true

        // 震动
        if (vibrateEnable) VibratorUtil.vibrate(vibrateDuration)

        getTemp().generateStub(getTemp().indexOfChild(this), Size(width, height))
        getTemp().setDraggingView(this)
    }

    init {
        isClickable = true
        setWillNotDraw(false)
    }

    fun setConfig(config: DragConfig?) {
        config ?: return
        borderWidth = config.borderWidth
        vibrateEnable = config.vibrateEnable
        shrinkScale = config.shrinkScale
        shrinkDuration = config.shrinkDuration
        exchangeDuration = config.exchangeDuration
        vibrateDuration = config.vibrateDuration
        dragEnable = config.dragEnable
    }

    fun setCallback(callback: DragInnerCallback) {
//        dragInnerCallback = callback
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (!dragEnable) return super.onTouchEvent(event)

        val rawX = event.rawX.toInt()
        val rawY = event.rawY.toInt()
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                isDragging = false
                getTemp().removeDraggingView()

                // todo 延时使用协程
                HandlerThreads.postDelayed(HandlerThreads.THREAD_UI, longTouchRunnable, 500)

                lastX = rawX
                lastY = rawY
                beginX = lastX
                beginY = lastY
            }
            MotionEvent.ACTION_MOVE -> {
                if (!isDragging) return false

                println("DTEST $rawX, $rawY")

                getTemp().detectViewCollision(this, rawX, rawY)

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
                getTemp().replaceStub(this) {
                    isDragging = false
                    getTemp().removeDraggingView()
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

    private fun getTemp(): DragFlowLayout = parent as DragFlowLayout

    override val logTag: String
        get() = TAG

    companion object {
        private const val TAG = "DragContainerView"
    }
}