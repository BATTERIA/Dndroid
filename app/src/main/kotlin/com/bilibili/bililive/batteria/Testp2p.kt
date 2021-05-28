package com.bilibili.bililive.batteria

import android.util.Log
import androidx.annotation.Keep
import com.alibaba.fastjson.annotation.JSONField
import java.lang.StringBuilder
import kotlin.reflect.KFunction
import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.*
import kotlin.reflect.jvm.isAccessible

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/5/12
 * @description:
 */
@Keep
open class Testp2p {
    @Keep
    companion object {
        var trackerServer = "wss://hw-bj-live-p2p-01.chat.bilibili.com/"
    }
}

fun <T> Any.setField(fieldName: String, value: T): Boolean {
    val sb = StringBuilder(fieldName)
    sb[0] = sb[0] - 32
    val setMethod = this::class.memberFunctions.find { "set$sb" == it.name }
    return if (setMethod is KFunction<*>) {
        setMethod.call(this, value)
        true
    } else {
        false
    }
}

inline fun <reified T> Any.getField(fieldName: String): T? {
    val property = this::class.memberProperties.find { fieldName == it.name }
    return if (property == null) {
        null
    } else {
        property.getter.call(this) as T?
    }
}