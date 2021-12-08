package com.bilibili.bililive.batteria.flow.drag

import android.view.ViewGroup
import com.bilibili.bililive.batteria.flow.text.DragTagState

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/6
 * @description:
 */
interface IDragTagAdapter<T, VH: IDragTagViewHolder> {
    // todo 待优化，需要调整内部逻辑
    fun setDataSynchronizer(synchronizer: DataSynchronizer)

    fun initData(list: List<T>)

    fun removeData(data: T)

    fun addData(data: T)

    fun getItemLabel(index: Int): Int

    fun notifyItemMoved(from: Int, to: Int)

    fun setEditable(editable: Boolean)

    fun getItemViewType(index: Int): Int

    fun getItemCount(): Int

    fun onBindViewHolder(viewHolder: VH, position: Int)

    fun onCreateViewHolder(parent: ViewGroup, itemView: Int): VH
}