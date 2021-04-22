package com.bilibili.bililive.infra.util.cache.api

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/3/2 13:20 PM
 * @description:
 */
object ApiCache : Cache<String, Int> {
    // Key为"$path/$roomid"; Value为body的实体类哈希值
    private val mCache: LfuCache<String, Int> =
        LfuCache()

    // 缓存开关
    private var mSwitch = false

    fun init(switch: Boolean, capacity: Int, timeout: Int) {
        mSwitch = switch
        mCache.setCapacity(capacity)
        mCache.setTimeout(timeout)
        // todo: 发起埋点上报
    }

    // 实验专用方法；p0p1接口请求完调用
    fun test(key: String, value: Int) {
        if (!mSwitch) return
        val hash = get(key)
        if (hash == null) {
            // 未命中 TODO("更新ApiMsg 时间戳刷新")
        } else{
            if (value == hash) {
                // 命中
            }
        }
        // todo: 存入本地缓存
    }

    // 调用接口前先从缓存获取
    override fun get(key: String): Int? {
        return mCache.get(key)
    }

    // 缓存未命中时put
    override fun put(key: String, value: Int) {
        mCache.put(key, value)
    }
}