/*
 * Copyright (c) 2015-2016 BiliBili Inc.
 */

package com.bilibili.bililive.batteria.network;

import androidx.annotation.Keep;

/**
 * Created by nero on 2016/10/26.
 * 对应json结构:{"code":0, "message":"ok", "data":null},非此结构需另行定义Json格式对应的Model
 */

@Keep
public class GeneralResponse<T> extends BaseResponse {
    public T data;
}
