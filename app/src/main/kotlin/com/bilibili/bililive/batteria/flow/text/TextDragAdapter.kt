package com.bilibili.bililive.batteria.flow.text

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bilibili.bililive.batteria.R
import com.bilibili.bililive.batteria.flow.drag.DataSynchronizer
import com.bilibili.bililive.batteria.flow.drag.IDragTagAdapter
import com.bilibili.bililive.batteria.flow.model.TagItem

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/7
 * @description:
 */
class TextDragAdapter : IDragTagAdapter<TagItem<String>, TextDragViewHolder> {
    private var isEditing = false

    private val dataList = mutableListOf<TagItem<String>>()

    private var innerItemClickListener: ((TagItem<String>) -> Unit)? = null

    private var dataSynchronizer: DataSynchronizer? = null

    fun getData(): List<TagItem<String>> = dataList

    fun setItemClickListener(clickListener: (TagItem<String>) -> Unit) {
        innerItemClickListener = clickListener
    }

    override fun setDataSynchronizer(synchronizer: DataSynchronizer) {
        dataSynchronizer = synchronizer
    }

    override fun initData(list: List<TagItem<String>>) {
        dataList.addAll(list)
    }

    override fun removeData(data: TagItem<String>) {
        dataList.remove(data)
        dataSynchronizer?.updateData()
    }

    override fun addData(data: TagItem<String>) {
        dataList.add(data)
        dataSynchronizer?.updateData()
    }

    override fun getItemLabel(index: Int): Int {
        if (index !in 0 until dataList.size) return -1
        return dataList[index].hashCode()
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(viewHolder: TextDragViewHolder, position: Int) {
        if (position !in 0 until dataList.size) return

        val data = dataList[position]
        viewHolder.isEditable = data.isEditable
        viewHolder.label = getItemLabel(position)
        viewHolder.itemView.setOnClickListener {
            innerItemClickListener?.invoke(data)
        }
        viewHolder.content.text = data.value

        viewHolder.corner.setOnClickListener {
            removeData(data)
        }
        val editableState =
            if (viewHolder.isEditable) DragTagState.EDITABLE else DragTagState.UNEDITABLE
        viewHolder.turnTo(if (isEditing) editableState else DragTagState.DEFAULT)
    }

    override fun onCreateViewHolder(parent: ViewGroup, itemView: Int): TextDragViewHolder =
        TextDragViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_item_text, parent, false))

    override fun notifyItemMoved(from: Int, to: Int) {
        if (from == to || from !in 0 until dataList.size || to !in 0 until dataList.size) return
        val t = dataList.removeAt(from)
        dataList.add(to, t)
    }

    override fun getItemViewType(index: Int): Int {
        return -1
    }

    override fun setEditState(isEdit: Boolean) {
        isEditing = isEdit
        dataSynchronizer?.setEditState(isEdit)
    }

    override fun getCurrentData(): List<TagItem<String>> {
        return dataList
    }
}