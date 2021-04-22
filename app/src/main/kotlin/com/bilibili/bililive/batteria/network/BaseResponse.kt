/*
 * Copyright (c) 2015-2017 BiliBili Inc.
 */
package com.bilibili.bililive.batteria.network

import androidx.annotation.Keep
import com.alibaba.fastjson.annotation.JSONField

/**
 * Created by nero on 2017/3/13.
 */
@Keep
abstract class BaseResponse {
    @JvmField
    var code = 0
    @JvmField
    var message: String? = null
    @JvmField
    var ttl = 0

    @get:JSONField(serialize = false, deserialize = false)
    open val isSuccess: Boolean
        get() = code == 0
}
