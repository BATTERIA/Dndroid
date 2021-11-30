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

    private var innerView: View? = null
    private var borderView: BorderView? = null

    private var anims = mutableListOf<AnimatorSet>()

//    private var dragInnerCallback: DragInnerCallback? = null

    private val longTouchRunnable = Runnable {
        isDragging = true

        // 震动
        if (vibrateEnable) VibratorUtil.vibrate(vibrateDuration)

        // 移动到顶部
//        dragInnerCallback?.moveToTop(this)

        // 边框
        borderEnable(true)

        getTemp().generateStub(getTemp().indexOfChild(this), Size(width, height))
    }

    init {
        isClickable = true
        setWillNotDraw(false)
    }

    fun setInnerView(view: View) {
        innerView = view
        addView(view)
        borderView = BorderView(context).apply {
            setBorderWidth(borderWidth)
            visibility = View.GONE
        }
        addView(borderView)
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

    fun borderEnable(enable: Boolean) {
        borderView?.visibility = if (enable) View.VISIBLE else View.GONE
    }

    fun stopAnim() {
        anims.forEach { it.cancel() }
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (!dragEnable) return super.onTouchEvent(event)

        val rawX = event.rawX.toInt()
        val rawY = event.rawY.toInt()
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                // todo 延时使用协程
                HandlerThreads.postDelayed(HandlerThreads.THREAD_UI, longTouchRunnable, 500)
                isDragging = false

                lastX = rawX
                lastY = rawY
                beginX = lastX
                beginY = lastY
            }
            MotionEvent.ACTION_MOVE -> {
                if (!isDragging) return false

//                dragInnerCallback?.isInOtherDistrict(this, rawX, rawY)
                getTemp().detectViewCollision(this, rawX, rawY)

                val dx = rawX - lastX
                val dy = rawY - lastY

                val left: Int = left + dx
                val top: Int = top + dy

                val lp = layoutParams as? MarginLayoutParams
                lp?.width = width
                lp?.height = height

                lp?.setMargins(left, top, 0, 0)
                layoutParams = lp
                lastX = rawX
                lastY = rawY
            }
            MotionEvent.ACTION_UP -> {
//                if (isLongTouch) dragInnerCallback?.dragFinish(this, rawX, rawY)

                borderEnable(false)
                isDragging = false
                HandlerThreads.remove(HandlerThreads.THREAD_UI, longTouchRunnable)

                val lp = layoutParams as? MarginLayoutParams
                lp?.setMargins(0, 0, 0, 0)
                layoutParams = lp

                getTemp().replaceStub(this)

                return true
            }
        }
        return super.onTouchEvent(event)
    }

    fun moveToDistrict(target: DistrictData?) {
        if (target != null) data = target
        val d = data ?: return
        val lp = layoutParams as MarginLayoutParams
        val l = lp.leftMargin
        val t = lp.topMargin

        val curX = l + width / 2
        val curY = t + height / 2
        val animatorSet = AnimatorSet()
        animatorSet.interpolator = DecelerateInterpolator()
        val anim0 = ObjectAnimator.ofFloat(this, "translationX", 0f, (d.midX - curX).toFloat())
        val anim1 = ObjectAnimator.ofFloat(this, "translationY", 0f, (d.midY - curY).toFloat())
        val anim2 = ObjectAnimator.ofFloat(this, "scaleX", shrinkScale, d.width.toFloat() / width)
        val anim3 = ObjectAnimator.ofFloat(this, "scaleY", shrinkScale, d.height.toFloat() / height)

        animatorSet.playTogether(anim0, anim1, anim2, anim3)
        animatorSet.duration = exchangeDuration
        animatorSet.start()
        borderEnable(false)
        animatorSet.addListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) = Unit

            override fun onAnimationEnd(animation: Animator?) {
                translationX = 0f
                translationY = 0f
                scaleX = 1f
                scaleY = 1f
                lp.width = d.width
                lp.height = d.height
                lp.setMargins(d.left, d.top, d.right, d.bottom)
                layoutParams = lp
            }

            override fun onAnimationCancel(animation: Animator?) = Unit

            override fun onAnimationStart(animation: Animator?) = Unit
        })
        anims.add(animatorSet)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        HandlerThreads.remove(HandlerThreads.THREAD_UI, longTouchRunnable)
        stopAnim()
    }

    private fun getTemp(): FlowLayout = parent as FlowLayout

    override val logTag: String
        get() = TAG

    companion object {
        private const val TAG = "DragContainerView"
    }
}