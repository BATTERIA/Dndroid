package com.bilibili.bililive.socket.interfaces

import android.support.annotation.WorkerThread
import org.json.JSONObject

interface MessageHandler {
    @WorkerThread
    fun onMessageReceived(cmd: String, rawJson: JSONObject, switches: IntArray?): Boolean
}