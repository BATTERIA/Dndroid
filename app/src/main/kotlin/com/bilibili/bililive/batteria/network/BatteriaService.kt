package com.bilibili.bililive.batteria.network

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface BatteriaService {
    @GET("x/v2/feed/index")
    fun list(): Call<ResponseBody>
}