package com.bilibili.bililive.socket.interfaces

import com.bilibili.bililive.socket.beans.Message

interface MessageObserver<in T : Message> {
    fun update(message: T)
}