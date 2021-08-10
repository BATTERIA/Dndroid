package com.bilibili.bililive.batteria.gesture

import android.view.View

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/8/9
 * @description: DragView配置信息
 *
 * [DistrictScaleType]              [xScale]        [yScale]
 * [DistrictScaleType.ABSOLUTE]     leftScale       topScale
 * [DistrictScaleType.MID]          horizontalMid   verticalMid
 * e.g.
 * [xType] = ABSOLUTE, [xScale] = 0.1f // 左边距 = 外部容器宽 * 0.1f
 * [xType] = MID // 横向居中
 *
 * [SizeScaleType]              [x0]           [x1]
 * [SizeScaleType.ABSOLUTE]     widthScale     heightScale
 * [SizeScaleType.WIDTH]        widthScale     ratio
 * [SizeScaleType.HEIGHT]       heightScale    ratio
 * e.g.
 * [type] = ABSOLUE, x0 = 0.5f, x1 = 1f // (x0是宽比例，x1是高比例) 宽 = 外部容器宽 * 0.5f, 高 = 外部容器高 * 1f
 * [type] = WIDTH, x0 = 0.5f, x1 = 0.25f // (x0是宽比例，x1是横纵比) 宽 = 外部容器宽 * 0.5f, 高 = 宽 / 0.25f
 *
 * [view] 内部view
 */
data class DistrictData(
    val xType: DistrictScaleType,
    val xScale: Float,
    val yType: DistrictScaleType,
    val yScale: Float,
    val type: SizeScaleType,
    val x0: Float,
    val x1: Float,
    val view: View
) {
    var left = 0
    var top = 0
    var right = 0
    var bottom = 0
    var width = 0
    var height = 0

    var midX = 0
    var midY = 0

    fun initData(l: Int, t: Int, r: Int, b: Int, w: Int, h: Int) {
        left = l
        top = t
        right = r
        bottom = b
        width = w
        height = h
        midX = left + width / 2
        midY = top + height / 2
    }
}

enum class SizeScaleType {
    ABSOLUTE, WIDTH, HEIGHT
}

enum class DistrictScaleType {
    ABSOLUTE, MID
}