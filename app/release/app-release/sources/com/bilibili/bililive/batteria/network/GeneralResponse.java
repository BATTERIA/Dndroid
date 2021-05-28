package com.bilibili.bililive.batteria.network;

import androidx.annotation.Keep;

@Keep
public class GeneralResponse<T> extends BaseResponse {
    public T data;
}
