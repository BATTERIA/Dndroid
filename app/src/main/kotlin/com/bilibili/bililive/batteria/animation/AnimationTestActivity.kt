package com.bilibili.bililive.batteria.animation

import android.animation.Animator
import android.animation.ValueAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bilibili.bililive.batteria.R

class AnimationTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation_test)
        val umbrella = findViewById<ImageView>(R.id.umbrella)
        var rAnim: ValueAnimator? = null
        var bAnim: ValueAnimator? = null
        findViewById<TextView>(R.id.right).setOnClickListener {
            rAnim?.cancel()
            val x = umbrella.x
            rAnim = ValueAnimator.ofFloat(x, x + 500)
            rAnim?.duration = 2000
            rAnim?.addUpdateListener { animator ->
                (animator.animatedValue as? Float)?.let { umbrella.x = it }
            }
            rAnim?.start()
        }
        findViewById<TextView>(R.id.bottom).setOnClickListener {
            bAnim?.cancel()
            val y = umbrella.y
            bAnim = ValueAnimator.ofFloat(y, y + 500)
            bAnim?.duration = 2000
            bAnim?.addUpdateListener { animator ->
                (animator.animatedValue as? Float)?.let { umbrella.y = it }
            }
            bAnim?.start()
        }
    }
}