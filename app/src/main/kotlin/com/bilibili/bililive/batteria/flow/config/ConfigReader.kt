package com.bilibili.bililive.batteria.flow.config

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/8
 * @description:
 */
interface ConfigReader {
    // 调整children重排动画时长
    fun moveAnimDuration(): Int

    // 拖拽视图归位动画时长
    fun resumeAnimDuration(): Int

    // 是否开启震动
    fun vibrateEnable(): Boolean

    // 震动持续时长
    fun vibrateDuration(): Long
}