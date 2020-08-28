package com.bilibili.bililive.socket.interfaces

interface Plugin {
    val id: String

    fun onRegister()

    fun onUnregister()

    fun onStart()

    fun onStop()
}