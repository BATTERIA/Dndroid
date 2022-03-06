package com.bilibili.bililive.batteria.microsoft

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bilibili.bililive.batteria.R

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2022/3/5
 * @description:
 */
class AvatarAdapter(private val list: MutableList<String> = mutableListOf()) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        if (ViewType.PLACEHOLDER.ordinal == viewType) {
            val view = View(parent.context)
//            val itemWidth = dp2px(80)
            val viewWidth = parent.measuredWidth / 2 - parent.measuredHeight / 2
            val params = RecyclerView.LayoutParams(viewWidth,RecyclerView.LayoutParams.WRAP_CONTENT)
            view.layoutParams = params
            return PlaceHolderViewHolder(view)
        }
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_avatar, parent, false)
        val params = RecyclerView.LayoutParams(parent.measuredHeight, parent.measuredHeight)
        view.layoutParams = params
        return UsualViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (isPlaceHolder(position)) return
        (holder as? UsualViewHolder)?.tv?.text = list[position - 1]
    }

    override fun getItemCount(): Int = list.size + 2

    override fun getItemViewType(position: Int): Int {
        if (isPlaceHolder(position)) {
            return ViewType.PLACEHOLDER.ordinal
        }
        return ViewType.USUAL.ordinal
    }

    private fun isPlaceHolder(position: Int): Boolean = 0 == position || itemCount - 1 == position

    class UsualViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv: TextView = itemView.findViewById(R.id.tv)
    }

    class PlaceHolderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    enum class ViewType {
        USUAL, PLACEHOLDER
    }
}