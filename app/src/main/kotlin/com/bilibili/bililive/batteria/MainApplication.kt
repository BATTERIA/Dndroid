package com.bilibili.bililive.batteria

import android.app.Application
import android.util.Log
import com.bilibili.bililive.batteria.util.BiliContext
import com.didi.hummer.Hummer
import com.didi.hummer.HummerConfig


/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/10/16 5:35 PM
 * @description:
 */
class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        BiliContext.application = this
        val config = HummerConfig.Builder()
            .setJSLogger { _: Int, msg: String ->
                Log.d(
                    "HummerJS",
                    msg
                )
            }
            .setExceptionCallback { e: Exception? ->
                Log.e(
                    "HummerException",
                    "Hummer Exception",
                    e
                )
            }
            .builder()
        Hummer.init(this, config)
    }
}