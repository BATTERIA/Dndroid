package com.bilibili.bililive.infra.util.cache.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.annotation.Keep
import androidx.collection.ArrayMap
import com.alibaba.fastjson.JSON
import com.alibaba.fastjson.annotation.JSONField
import com.bilibili.bililive.batteria.R

class CacheActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cache)

    }

    @Keep
    class Message {
        @JSONField(name = "path")
        var path: String = ""

        @JSONField(name = "total")
        var total: Int = 0

        @JSONField(name = "hit_count")
        var hitCount: Int = 0

        @JSONField(name = "timeout")
        var timeout: Int = 0

        @JSONField(name = "new_room")
        var newRoom: Int = 0

        @JSONField(name = "new_query")
        var newQuery: Int = 0
    }

    enum class Type {
        TIMEOUT, ROOM_ID, QUERY
    }

}