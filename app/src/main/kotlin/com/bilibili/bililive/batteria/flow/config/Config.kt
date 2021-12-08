package com.bilibili.bililive.batteria.flow.config

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/8
 * @description:
 */
data class Config(
    var moveAnimDuration: Int,
    var resumeAnimDuration: Int,
    var vibrateEnable: Boolean,
    var vibrateDuration: Long
) {
    companion object {
        const val DEFAULT_MOVE_ANIM_DURATION = 300
        const val DEFAULT_RESUME_ANIM_DURATION = 300
        const val DEFAULT_VIBRATE_ENABLE = true
        const val DEFAULT_VIBRATE_DURATION = 100L

        fun default(): Config = Config(
            DEFAULT_MOVE_ANIM_DURATION,
            DEFAULT_RESUME_ANIM_DURATION,
            DEFAULT_VIBRATE_ENABLE,
            DEFAULT_VIBRATE_DURATION
        )
    }
}