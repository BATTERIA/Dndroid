package com.bilibili.bililive.batteria.network

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkManager {
    private val retrofit: Retrofit by lazy {
        Retrofit.Builder().baseUrl("https://app.bilibili.com/").addConverterFactory(
            GsonConverterFactory.create()).build()
    }
    private val service by lazy { retrofit.create(BatteriaService::class.java) }

    fun list() {
        service.list().enqueue(object : Callback<ResponseBody> {
            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                print(t.toString())
            }

            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                print("${response.body()}")
            }
        })

    }

}