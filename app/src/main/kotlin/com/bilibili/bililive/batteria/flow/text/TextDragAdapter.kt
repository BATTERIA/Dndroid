package com.bilibili.bililive.batteria.flow.text

import android.view.LayoutInflater
import android.view.ViewGroup
import com.bilibili.bililive.batteria.R
import com.bilibili.bililive.batteria.flow.drag.DataUpdate
import com.bilibili.bililive.batteria.flow.drag.IDragTagAdapter
import com.bilibili.bililive.batteria.flow.drag.IDragTagViewHolder

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/7
 * @description:
 */
class TextDragAdapter : IDragTagAdapter<String, TextDragViewHolder> {
    private val dataList = mutableListOf<String>()
    private var defaultClickListener: ((String) -> Unit)? = null

    override var dataUpdate: DataUpdate? = null

    fun setDefaultClickListener(clickListener: (String) -> Unit) {
        defaultClickListener = clickListener
    }

    override fun initData(list: List<String>) {
        dataList.addAll(list)
    }

    override fun removeData(data: String) {
        dataList.remove(data)
        dataUpdate?.invoke()
    }

    override fun addData(data: String) {
        dataList.add(data)
        dataUpdate?.invoke()
    }

    override fun getItemLabel(index: Int): Int {
        if (index !in 0 until dataList.size) return -1
        return dataList[index].hashCode()
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(viewHolder: TextDragViewHolder, position: Int) {
        if (position !in 0 until dataList.size) return

        viewHolder.label = getItemLabel(position)
        viewHolder.itemView.setOnClickListener {
            defaultClickListener?.invoke(dataList[position])
        }
        viewHolder.content.text = dataList[position]
    }

    override fun onCreateViewHolder(parent: ViewGroup): TextDragViewHolder = TextDragViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.view_item_text, parent, false)
    )
}