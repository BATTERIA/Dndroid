package com.bilibili.bililive.batteria.util

import android.app.Application
import android.os.*
import com.bilibili.bililive.batteria.MainApplication


/**
 * @property isForeground true if the process has bring an activity to foreground (created), false otherwise
 *  @see [registerActivityStateCallback]
 *  @see [unregisterActivityStateCallback]
 *  @see [ActivityStateCallback]
 *
 * @property isVisible true if the process has bring an activity to resume (visible), false otherwise
 *  @see [registerActivityStateCallback]
 *  @see [unregisterActivityStateCallback]
 *  @see [ActivityStateCallback]
 *
 * @property mainHandler handler wrap [Looper.getMainLooper]
 */
object BiliContext {

}

