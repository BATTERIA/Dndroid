package com.bilibili.bililive.infra.util.cache.api

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.ImageView
import androidx.annotation.Keep
import androidx.collection.ArrayMap
import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.annotation.JSONField
import com.bilibili.bililive.batteria.R

class CacheActivity : AppCompatActivity() {
    private var iv: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cache)

        iv = findViewById(R.id.iv)
        iv?.setOnClickListener {
            it ?: return@setOnClickListener
            anim(it)
        }
    }

    private fun anim(view: View) {
        val animatorSet = AnimatorSet()
        animatorSet.interpolator = DecelerateInterpolator()
        val anim0 = ObjectAnimator.ofFloat(view, "translationX", 0f, 200f)
        val anim1 = ObjectAnimator.ofFloat(view, "translationY", 0f, 200f)
        animatorSet.playTogether(anim0, anim1)
        animatorSet.duration = 700
        animatorSet.start()
    }

    @Keep
    class Message {
        @JSONField(name = "path")
        var path: String = ""

        @JSONField(name = "total")
        var total: Int = 0

        @JSONField(name = "hit_count")
        var hitCount: Int = 0

        @JSONField(name = "timeout")
        var timeout: Int = 0

        @JSONField(name = "new_room")
        var newRoom: Int = 0

        @JSONField(name = "new_query")
        var newQuery: Int = 0
    }

    enum class Type {
        TIMEOUT, ROOM_ID, QUERY
    }

}