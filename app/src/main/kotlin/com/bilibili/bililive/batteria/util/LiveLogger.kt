/*
 * Copyright (c) 2015-2019 BiliBili Inc.
 */

package com.bilibili.bililive.batteria.util

import android.util.Log

/**
 * [LiveLog]辅助类，省去打日志时的tag参数
 * @author liuzundong
 * @version 1.0
 * @since: 2019/1/8 10:49 AM
 */

interface LiveLogger {
    val logTag: String
}

inline fun LiveLogger.logInfo(throwable: Throwable? = null, block: () -> String?) {
    Log.i(logTag, block.invoke() ?: "")
}

inline fun LiveLogger.logDebug(throwable: Throwable? = null, block: () -> String?) {
    Log.d(logTag, block.invoke() ?: "")
}

inline fun LiveLogger.logWarn(throwable: Throwable? = null, block: () -> String?) {
    Log.w(logTag, block.invoke() ?: "")
}

inline fun LiveLogger.logError(throwable: Throwable? = null, block: () -> String?) {
    Log.e(logTag, block.invoke() ?: "")
}
