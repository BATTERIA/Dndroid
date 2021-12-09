package com.bilibili.bililive.batteria.flow.text

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.bilibili.bililive.batteria.R
import com.bilibili.bililive.batteria.flow.drag.DragView
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
    val corner: ImageView = itemView.findViewById(R.id.iv_corner)

    private var curState = DragTagState.DEFAULT

    override var isEditable: Boolean = true

    override fun turnTo(state: DragTagState) {
        if (curState == state) return
        when (state) {
            DragTagState.DEFAULT -> turnToDefault()
            DragTagState.UNEDITABLE -> turnToUneditable()
            DragTagState.EDITABLE -> turnToEditable()
            DragTagState.DRAGGING -> turnToDragging()
        }
        curState = state
    }

    fun turnToDefault() {
        setViewClickable(false)
        content.setTextColor(itemView.context.resources.getColor(R.color.live_area_edit_text_normal))
        content.setBackgroundResource(R.drawable.live_area_edit_text_normal_border)
        corner.visibility = View.GONE
    }

    fun turnToUneditable() {
        content.setTextColor(itemView.context.resources.getColor(R.color.live_area_edit_text_normal))
        content.setBackgroundResource(R.drawable.live_area_edit_text_unedit_border)
        corner.visibility = View.GONE
    }

    fun turnToEditable() {
        setViewClickable(true)
        content.setTextColor(itemView.context.resources.getColor(R.color.live_area_edit_text_normal))
        content.setBackgroundResource(R.drawable.live_area_edit_text_normal_border)
        corner.visibility = View.VISIBLE
    }

    fun turnToDragging() {
        content.setTextColor(itemView.context.resources.getColor(R.color.live_area_edit_text_drag))
        content.setBackgroundResource(R.drawable.live_area_edit_text_drag_border)
        corner.visibility = View.VISIBLE
    }

    private fun setViewClickable(clickable: Boolean) {
        if (itemView !is DragView) return
        itemView.filterTouch = !clickable
    }
}