package com.bilibili.bililive.batteria.flow.text

import android.view.View
import android.widget.TextView
import com.bilibili.bililive.batteria.R
import com.bilibili.bililive.batteria.flow.drag.IDragTagViewHolder

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/7
 * @description:
 */
class TextDragViewHolder(override val itemView: View, override var label: Int = -1) :
    IDragTagViewHolder {
    val content: TextView = itemView.findViewById(R.id.tv_content)
}