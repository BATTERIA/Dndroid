package com.bilibili.bililive.socket.beans

data class Config(val host: String, val port: Int, val connectTimeOut: Long?) {
    fun dump(): String {
        return "connectTimeOut = $connectTimeOut host = $host port = $port tag = ${hashCode()}"
    }
}