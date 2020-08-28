package com.bilibili.bililive.socket.beans

enum class Operation(val value: Int) {
    OP_HEARTBEAT_REPLY(3), OP_SEND_SMS_REPLY(5), OP_AUTH_REPLY(8)
}