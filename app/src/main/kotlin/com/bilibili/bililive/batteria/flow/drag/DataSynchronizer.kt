package com.bilibili.bililive.batteria.flow.drag

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/8
 * @description:
 */
interface DataSynchronizer {
    fun updateData()

    fun setEditable(isEditable: Boolean)
}