package com.bilibili.bililive.batteria.flow.drag

import android.view.View
import com.bilibili.bililive.batteria.flow.text.DragTagState

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/7
 * @description:
 */
interface IDragTagViewHolder {
    var label: Int
    val itemView: View
    var isEditable: Boolean

    fun turnTo(state: DragTagState)
}