package com.bilibili.bililive.socket

import com.bilibili.bililive.socket.beans.Config
import java.lang.StringBuilder
import java.util.concurrent.*
import java.util.concurrent.ThreadPoolExecutor
import java.util.concurrent.atomic.AtomicInteger

object SocketExecutor {
    private const val MAX_SOCKET_SIZE = 4
    private const val KEEP_ALIVE_TIME = 30000L //心跳包间隔
    private val mSocketThreadPool: ThreadPoolExecutor
    private val runnableMap = mutableMapOf<Runnable, Config>()

    fun execute(runnable: Runnable, config: Config) {
        runnableMap[runnable] = config
        mSocketThreadPool.execute(runnable)
    }

    fun remove(runnable: Runnable) {
        runnableMap.remove(runnable)
        mSocketThreadPool.remove(runnable)
    }

    init {
        mSocketThreadPool = ThreadPoolExecutor(0, MAX_SOCKET_SIZE,
                KEEP_ALIVE_TIME, TimeUnit.MILLISECONDS,
                SynchronousQueue<Runnable>(),
                object : ThreadFactory {
                    private val mCount = AtomicInteger(1)

                    override fun newThread(r: Runnable): Thread {
                        return Thread(r, "LiveRoomSocket#" + mCount.getAndIncrement())
                    }
                },
                RejectedExecutionHandler { _, _ -> throw RejectedExecutionException("current socket dump = ${dumpAllSocket()}") })
    }

    private fun dumpAllSocket(): String {
        return StringBuilder().run {
            append("dumpAllSocket --> \n")
            runnableMap.forEach { (_, config) -> append("${config.dump()}\n") }
            return@run toString()
        }
    }
}