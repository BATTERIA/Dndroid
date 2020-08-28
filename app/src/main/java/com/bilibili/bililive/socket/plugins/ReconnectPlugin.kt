package com.bilibili.bililive.socket.plugins

import com.bilibili.base.connectivity.ConnectivityMonitor
import com.bilibili.bililive.socket.interfaces.Plugin
import log.LiveLogger
import log.logError
import log.logInfo

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/8/28 5:37 PM
 * @description:
 */
class ReconnectPlugin(resume: () -> Unit) : Plugin, LiveLogger {
    private val networkChangeListener = ConnectivityMonitor.OnNetworkChangedListener {
        try {
            val isActive = ConnectivityMonitor.getInstance().isNetworkActive
            logInfo { "OnNetworkChangedListener = $isActive" }
            if (isActive) {
                resume()
            }
        } catch (e: Throwable) {
            logError(e) { "OnNetworkChangedListener error" }
        }
    }

    private var hasRegisterNetWork = false

    override fun onStart() {
        logInfo { "registerNetWork = $hasRegisterNetWork" }
        if (hasRegisterNetWork) {
            return
        }
        hasRegisterNetWork = true
        ConnectivityMonitor.getInstance().register(networkChangeListener)
    }

    override fun onStop() {
        logInfo { "unRegisterNetWork = $hasRegisterNetWork" }
        if (!hasRegisterNetWork) {
            return
        }
        hasRegisterNetWork = false
        ConnectivityMonitor.getInstance().unregister(networkChangeListener)
    }

    override val id: String
        get() = ID

    override fun onRegister() = Unit

    override fun onUnregister() = Unit

    override val logTag: String
        get() = TAG

    companion object {
        const val ID = "socket.reconnect"
        private const val TAG = "ReconnectPlugin"
    }
}