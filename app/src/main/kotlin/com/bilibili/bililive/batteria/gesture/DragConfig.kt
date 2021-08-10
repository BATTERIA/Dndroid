package com.bilibili.bililive.batteria.gesture

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/8/10
 * @description:
 * [borderWidth] 边框宽度 单位dp
 * [shrinkScale] 长按缩小动画比例
 * [shrinkDuration] 长按缩小动画时长 单位ms
 * [exchangeDuration] 交换动画时长 单位ms
 * [vibrateEnable] 长按是否震动
 * [vibrateDuration] 震动时长
 */
data class DragConfig(
    val borderWidth: Int,
    val shrinkScale: Float,
    val shrinkDuration: Long,
    val exchangeDuration: Long,
    val vibrateEnable: Boolean,
    val vibrateDuration: Long = 0L
)