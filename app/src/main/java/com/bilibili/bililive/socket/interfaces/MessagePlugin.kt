package com.bilibili.bililive.socket.interfaces

import com.bilibili.bililive.socket.beans.Message

interface MessagePlugin : Plugin {
    fun onMessageReceived(message: Message)
}