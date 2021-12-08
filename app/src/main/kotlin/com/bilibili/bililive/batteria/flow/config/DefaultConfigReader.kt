package com.bilibili.bililive.batteria.flow.config

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/8
 * @description:
 */
class DefaultConfigReader : ConfigReader {
    private val config = Config.default()

    override fun moveAnimDuration(): Int = config.moveAnimDuration

    override fun resumeAnimDuration(): Int = config.resumeAnimDuration

    override fun vibrateEnable(): Boolean = config.vibrateEnable

    override fun vibrateDuration(): Long = config.vibrateDuration
}