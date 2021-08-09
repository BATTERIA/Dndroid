package com.bilibili.bililive.batteria.danmaku

import android.content.Context
import android.util.Log
import com.bilibili.bililive.batteria.util.ScreenUtil
import com.blankj.utilcode.util.SizeUtils.dp2px
import java.util.*
import kotlin.math.sqrt

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/7/19
 * @description:
 */
class MeteorPathMeter(context: Context) {
    // 计算轨道
    private val screenHeight: Int = ScreenUtil.getScreenHeight(context)
    private val screenWidth: Int = ScreenUtil.getScreenWidth(context)

    private val startLowX = screenHeight / 2
    private val startLowY = -screenHeight / 2

    private val startHighX = screenHeight + screenWidth / 2
    private val startHighY = screenWidth / 2

    private val endLowX = -screenHeight / 2
    private val endLowY = screenHeight / 2

    private val endHighX = screenWidth / 2
    private val endHighY = screenHeight + screenWidth / 2

    private val motionWidth = startHighX - startLowX
    private val motionHeight = startHighY - startLowY

    private val wholePath: Double = sqrt((motionHeight * motionHeight + motionWidth * motionWidth).toDouble())

    private val pathMaxHeight = dp2px(24f)

    private val pathNum: Int = (wholePath / pathMaxHeight).toInt()

    private val halfNum: Int = pathNum / 2

    private val quarterNum: Int = pathNum / 4

    private val step = pathMaxHeight / 1.414

    private val random = Random()

    private val list: LinkedList<Int> = LinkedList()

    // 获取轨道
    fun getRandomPath(isMain: Boolean = false) : List<Int> {
        // 去重逻辑
        var index = randomIndex(isMain)

        // 最多重试三次
        for (i in 0..2) {
            if (list.contains(index)) {
                index = randomIndex(isMain)
            } else {
                break
            }
        }
        // 减少重复情况
        if (list.size == 8) list.pollLast()
        list.push(index)

        Log.e("meteor_index", "$index / $pathNum")

        val instance = (step * index).toInt()
        return listOf(startLowX + instance, startLowY + instance, endLowX + instance, endLowY + instance)
    }

    /**
     * 高概率区域，中部1/2区域
     * 低概率区域，两侧1/4区域
     * 1-中部区域，0外部区域
     */
    private fun randomIndex(isMain: Boolean): Int {
        // 外部区域的概率设置为1/3概率
        val isOutArea = if (isMain) false else random.nextInt(3) == 1

        var index = 0
        if (isOutArea) {
            index = random.nextInt(halfNum)
            if (index > quarterNum) index += halfNum
        } else {
            index = random.nextInt(halfNum) + quarterNum
        }

        // 头尾过滤
        if (index <= 1) index = 2
        if (index >= pathNum) index = pathNum - 1
        return index
    }
}