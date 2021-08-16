package com.bilibili.bililive.batteria.gesture

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
class DragContainerView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attributeSet, defStyleAttr), LiveLogger {
    var index = 0
    var data: DistrictData? = null

    private var isLongTouch = false

    private var lastX = 0
    private var lastY = 0
    private var beginX = 0
    private var beginY = 0
    private var parentWidth = 0
    private var parentHeight = 0

    private var borderWidth: Int = 20
    private var vibrateEnable: Boolean = true
    private var vibrateDuration: Long = 0
    private var shrinkScale: Float = 0.8f
    private var shrinkDuration: Long = 200
    private var exchangeDuration: Long = 500
    var dragEnable: Boolean = true
    var isInit = false

    private var innerView: View? = null
    private var borderView: BorderView? = null

    private var anims = mutableListOf<AnimatorSet>()

    private var dragInnerCallback: DragInnerCallback? = null

    private val longTouchRunnable = Runnable {
        isLongTouch = true

        // 震动
        if (vibrateEnable) VibratorUtil.vibrate(vibrateDuration)

        // 移动到顶部
        dragInnerCallback?.moveToTop(this)

        // 边框
        borderEnable(true)

        // 缩小
        dragInnerCallback?.stopAnim()
        shrink()
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
        dragInnerCallback = callback
    }

    fun borderEnable(enable: Boolean) {
        borderView?.visibility = if (enable) View.VISIBLE else View.GONE
    }

    fun initSize(width: Int, height: Int) {
        parentWidth = width
        parentHeight = height
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
                HandlerThreads.postDelayed(HandlerThreads.THREAD_UI, longTouchRunnable, 500)
                isLongTouch = false

                lastX = rawX
                lastY = rawY
                beginX = lastX
                beginY = lastY
            }
            MotionEvent.ACTION_MOVE -> {
                if (!isLongTouch) return false

                dragInnerCallback?.isInOtherDistrict(this, rawX, rawY)

                val dx = rawX - lastX
                val dy = rawY - lastY

                val left: Int = left + dx
                val top: Int = top + dy

                val lp = layoutParams as? MarginLayoutParams
                lp?.width = width
                lp?.height = height

                val r = parentWidth - left - width
                val b = parentHeight - top - height
                lp?.setMargins(left, top, r, b)
                layoutParams = lp
                lastX = rawX
                lastY = rawY
            }
            MotionEvent.ACTION_UP -> {
                if (isLongTouch) dragInnerCallback?.dragFinish(this, rawX, rawY)

                borderEnable(false)
                isLongTouch = false
                HandlerThreads.remove(HandlerThreads.THREAD_UI, longTouchRunnable)

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

    private fun shrink() {
        val animatorSet = AnimatorSet()
        animatorSet.interpolator = DecelerateInterpolator()
        val anim0 = ObjectAnimator.ofFloat(this, "scaleX", 1f, shrinkScale)
        val anim1 = ObjectAnimator.ofFloat(this, "scaleY", 1f, shrinkScale)
        animatorSet.playTogether(anim0, anim1)
        animatorSet.duration = shrinkDuration
        animatorSet.start()
        anims.add(animatorSet)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        HandlerThreads.remove(HandlerThreads.THREAD_UI, longTouchRunnable)
        stopAnim()
    }

    override val logTag: String
        get() = TAG

    companion object {
        private const val TAG = "DragContainerView"
    }
}