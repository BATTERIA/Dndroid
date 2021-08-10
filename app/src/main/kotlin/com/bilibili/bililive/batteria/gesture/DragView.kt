package com.bilibili.bililive.batteria.gesture

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.util.DisplayMetrics
import android.view.MotionEvent
import android.view.ViewGroup
import android.view.WindowManager
import android.view.animation.DecelerateInterpolator
import android.widget.FrameLayout
import com.bilibili.bililive.batteria.util.HandlerThreads
import com.bilibili.bililive.batteria.util.VibratorUtil
import com.blankj.utilcode.util.ConvertUtils.dp2px
import kotlin.math.abs

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/8/9
 * @description:
 */
class DragView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : androidx.appcompat.widget.AppCompatImageView(context, attributeSet, defStyleAttr) {
    var index = 0
    var data: DistrictData? = null

    private var isDrag = true
    private var isLongTouch = false

    private var lastX = 0
    private var lastY = 0
    private var beginX = 0
    private var beginY = 0
    private var parentWidth = 720
    private var parentHeight = 1280

    var showBorder = false

    private var anims = mutableListOf<AnimatorSet>()

    private val longTouchRunnable = Runnable {
        isLongTouch = true
        VibratorUtil.vibrate()
        dragInnerCallback?.moveToTop(this)

        // 边框
        showBorder = true

        // 缩小
        shrink()
    }

    private var dragInnerCallback: DragInnerCallback? = null

    private val paint = Paint()

    init {
        initData(context)
        initPaint()
        isClickable = true
    }

    fun setCallback(callback: DragInnerCallback) {
        dragInnerCallback = callback
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        val mViewGroup = parent as ViewGroup
        if (mViewGroup.width > 0) parentWidth = mViewGroup.width
        if (mViewGroup.height > 0) parentHeight = mViewGroup.height
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent): Boolean {
        val rawX = event.rawX.toInt()
        val rawY = event.rawY.toInt()
        requestLayout()
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
                isDrag = isDrag || (dx != 0 || dy != 0)

                var left: Int = left + dx
                var top: Int = top + dy
                var right: Int = right + dx
                var bottom: Int = bottom + dy

                if (left < 0) {
                    left = 0
                    right = width
                }
                if (right > parentWidth) {
                    right = parentWidth
                    left = parentWidth - width
                }
                if (top < 0) {
                    top = 0
                    bottom = height
                }
                if (bottom > parentHeight) {
                    bottom = parentHeight
                    top = parentHeight - height
                }

                val params = FrameLayout.LayoutParams(width, height)

                val r = parentWidth - left - width
                val b = parentHeight - top - height
                params.setMargins(left, top, r, b)
                layoutParams = params
                lastX = rawX
                lastY = rawY
            }
            MotionEvent.ACTION_UP -> {
                if (isLongTouch) dragInnerCallback?.dragFinish(this,rawX, rawY)

                showBorder = false
                isLongTouch = false
                HandlerThreads.remove(HandlerThreads.THREAD_UI, longTouchRunnable)

                if (!isDrag) performClick()
                return if (abs(lastX - beginX) < 10 && abs(lastY - beginY) < 10) {
                    super.onTouchEvent(event)
                } else {
                    isPressed = false
                    true
                }
            }
        }
        return super.onTouchEvent(event)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        if (showBorder) canvas?.drawRect(0f, 0f, width.toFloat(), height.toFloat(), paint)
    }

    fun moveToDistrict(target: DistrictData?) {
        if (target != null) data = target
        val d = data ?: return
        val lp = layoutParams as FrameLayout.LayoutParams
        val l = lp.leftMargin
        val t = lp.topMargin

        val curX = l + width / 2
        val curY = t + height / 2
        if (curX == d.midX && curY == d.midY) return
        val animatorSet = AnimatorSet()
        animatorSet.interpolator = DecelerateInterpolator()
        val anim0 = ObjectAnimator.ofFloat(this, "translationX", 0f, (d.midX - curX).toFloat())
        val anim1 = ObjectAnimator.ofFloat(this, "translationY", 0f, (d.midY - curY).toFloat())
        val anim2 = ObjectAnimator.ofFloat(this, "scaleX", 1f, d.width.toFloat() / width)
        val anim3 = ObjectAnimator.ofFloat(this, "scaleY", 1f, d.height.toFloat() / height)
        animatorSet.playTogether(anim0, anim1, anim2, anim3)
        animatorSet.duration = 500
        animatorSet.start()
        showBorder = false
        animatorSet.addListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) = Unit

            override fun onAnimationEnd(animation: Animator?) {
                translationX = 0f
                translationY = 0f
                scaleX = 1f
                scaleY = 1f
                val newLp = FrameLayout.LayoutParams(d.width, d.height)
                newLp.setMargins(d.left, d.top, d.right, d.bottom)
                layoutParams = newLp
            }

            override fun onAnimationCancel(animation: Animator?) = Unit

            override fun onAnimationStart(animation: Animator?) = Unit
        })
        anims.add(animatorSet)
    }

    private fun shrink() {
        val animatorSet = AnimatorSet()
        animatorSet.interpolator = DecelerateInterpolator()
        val anim0 = ObjectAnimator.ofFloat(this, "scaleX", 1f, 0.8f)
        val anim1 = ObjectAnimator.ofFloat(this, "scaleY", 1f, 0.8f)
        animatorSet.playTogether(anim0, anim1)
        animatorSet.duration = 200
        animatorSet.start()
        anims.add(animatorSet)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        HandlerThreads.remove(HandlerThreads.THREAD_UI, longTouchRunnable)
        anims.forEach { it.cancel() }
    }

    private fun initData(context: Context) {
        val wm = context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        val dm = DisplayMetrics()
        wm.defaultDisplay.getMetrics(dm)
        parentWidth = dm.widthPixels
        parentHeight = dm.heightPixels
    }

    private fun initPaint() {
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = dp2px(20f).toFloat()
        paint.color = BORDER_COLOR.toInt()
    }

    companion object {
        private const val BORDER_COLOR = 0xFFFD6D8C
    }
}