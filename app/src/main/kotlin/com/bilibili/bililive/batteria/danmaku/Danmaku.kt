package com.bilibili.bililive.batteria.danmaku

import android.graphics.Paint

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/6/1
 * @description:
 */
data class Danmaku(
    val text: String,
    val size: Float,
    val color: Int,
    val speed: Int,
    var x: Float = 0f,
    var y: Float = 0f,
    var paint: Paint? = null,
    var width: Float = 0f
)