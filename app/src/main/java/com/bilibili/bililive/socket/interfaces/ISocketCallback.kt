package com.bilibili.bililive.socket.interfaces

interface ISocketCallback {
    /**
     * 开始连接
     */
    fun onStartConnect(timestamp: Long)

    /**
     * 连接成功
     */
    fun onConnectSuccess(timestamp: Long)

    /**
     * 弹幕连接成功
     */
    fun onAuthSuccess()

    /**
     * 弹幕连接失败
     * @param errorCode
     * @param message
     */
    fun onOpenFail(errorCode: Int, message: String?)

    /**
     * 心跳更新人数
     * @param number
     */
    fun updateOnlineNumber(number: Int)

    /**
     * 接收到非法包
     */
    fun onReceiveInvalidMsg()

    /**
     * code=-101,重新调用弹幕调度接口，更新服务器列表和token
     * 其他连接下一个socket地址
     */
    fun onAuthFail(code: Int)

    /**
     * 消息解压成功
     * @param messageLength 消息长度，单位 byte
     */
    fun onMessageDecompressed(messageLength: Int)

    /**
     * 收到其它广播消息OR命令
     * @param commandResponse
     */
    fun onMessageReceived(rawData: String)
}