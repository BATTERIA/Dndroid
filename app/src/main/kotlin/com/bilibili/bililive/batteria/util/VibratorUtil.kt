package com.bilibili.bililive.batteria.util

import android.app.Service
import android.os.Vibrator

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/8/9
 * @description:
 */
object VibratorUtil {
    fun vibrate() {
        val service = BiliContext.application?.getSystemService(Service.VIBRATOR_SERVICE) as? Vibrator ?: return
        service.vibrate(100)
    }
}