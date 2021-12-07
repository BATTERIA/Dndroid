package com.bilibili.bililive.batteria.flow.drag

import android.view.ViewGroup

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/6
 * @description:
 */
interface IDragTagAdapter<T, VH: IDragTagViewHolder> {
    var dataUpdate: DataUpdate?

    fun initData(list: List<T>)

    fun removeData(data: T)

    fun addData(data: T)

    fun getItemLabel(index: Int): Int

    fun getItemCount(): Int

    fun onBindViewHolder(viewHolder: VH, position: Int)

    fun onCreateViewHolder(parent: ViewGroup): VH
}

typealias DataUpdate = () -> Unit