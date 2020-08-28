package com.bilibili.bililive.socket.beans

data class Header(var length: Int, val version: Short, val operation: Int, val sequence: Int = 0, val headerLength: Short = 16)