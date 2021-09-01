package com.bilibili.bililive.batteria.wordmerge

import android.animation.Animator
import android.animation.ObjectAnimator
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.animation.AccelerateInterpolator
import android.view.animation.DecelerateInterpolator
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import com.bilibili.bililive.batteria.R
import com.bilibili.bililive.batteria.util.ScreenUtil
import com.blankj.utilcode.util.ConvertUtils
import org.jetbrains.anko.runOnUiThread
import java.util.*

class WordMergeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_merge)
        val decorView: View = window.decorView
        val uiOptions: Int = View.SYSTEM_UI_FLAG_FULLSCREEN
        decorView.systemUiVisibility = uiOptions

        test(R.drawable.ohh2)
//        test(R.drawable.ohh3)
    }

    fun test(@DrawableRes id: Int) {
        val screenHeight = ScreenUtil.getScreenHeight(this)
        val screenWidth = ScreenUtil.getScreenWidth(this)

        val drawable = resources.getDrawable(id) as BitmapDrawable
        val bitmap = drawable.bitmap

        val width = bitmap.width
        val height = bitmap.height
        val pixels = IntArray(width * height)
        bitmap.getPixels(pixels, 0, width, 0, 0, width, height)
        val matrix = Array(height) { ByteArray(width) }

        for (i in 0 until height) {
            for (j in 0 until width) {
                matrix[i][j] = if (pixels[i * width + j] == -1) 0 else 1
            }
        }

        val view = WordMergeView(this)
        view.setData(matrix)
        val lp = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT
        )
        lp.gravity = Gravity.CENTER
        view.layoutParams = lp
        val ll = findViewById<FrameLayout>(R.id.ll)
        ll.addView(view)
        view.translationX = screenWidth.toFloat()
        view.scaleX = 0.8f
        view.scaleY = 0.8f
        view.rotation = -11f
        view.translationY = ConvertUtils.dp2px(30f).toFloat()
        findViewById<ImageView>(R.id.iv).setOnClickListener {
            val animator = ObjectAnimator.ofFloat(view, "translationX", screenWidth.toFloat(), 0f)
            animator.duration = 1000L
            animator.interpolator = DecelerateInterpolator()
            animator.addListener(object : Animator.AnimatorListener {
                override fun onAnimationRepeat(animation: Animator?) = Unit

                override fun onAnimationEnd(animation: Animator?) {
                    VibrateThread(view) {
                        val animator1 = ObjectAnimator.ofFloat(view, "translationX", 0f, -screenWidth.toFloat())
                        animator1.duration = 1500L
                        animator1.interpolator = AccelerateInterpolator()
                        animator1.start()
                    }.start()
                }

                override fun onAnimationCancel(animation: Animator?) = Unit

                override fun onAnimationStart(animation: Animator?) = Unit
            })
            animator.start()
        }
    }
}

class VibrateThread(private val view: WordMergeView, private val finish: () -> Unit) : Thread() {
    val constant = 3
    val dx = listOf(constant, constant, -constant, -constant)
    val dy = listOf(constant, -constant, constant, -constant)
    val random = Random()
    var isPurple = false
    override fun run() {
        for (i in 0 until 11) {
            val index = random.nextInt(4)

            var originX = 0f
            var originY = 0f
            view.context.runOnUiThread {
                originX = view.translationX
                originY = view.translationY
                view.translationX =
                    view.translationX + ConvertUtils.dp2px(dx[index].toFloat()).toFloat()
                view.translationY =
                    view.translationY + ConvertUtils.dp2px(dy[index].toFloat()).toFloat()
            }

            sleep(100)
            view.context.runOnUiThread {
                view.translationX = originX
                view.translationY = originY
                isPurple = !isPurple
                view.changeColor(isPurple)
            }
            sleep(100)
        }
        sleep(500)
        view.context.runOnUiThread { finish() }
    }
}