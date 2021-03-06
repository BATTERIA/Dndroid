package com.bilibili.bililive.batteria.recycler

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bilibili.bililive.batteria.R

class InteractionAdapter : RecyclerView.Adapter<InteractionAdapter.ViewHolder>() {
    private val list = mutableListOf<InteractionData>()
    private val vhs = mutableListOf<ViewHolder>()

    init {
//        addBaseData()
    }

    fun addFirst(d: InteractionData) {
        list.add(0, d)
        notifyItemInserted(0)
    }

    fun addData(d: InteractionData) {
        list.add(d)
        notifyItemInserted(list.size - 1)
    }

    fun add20Data() {
        for (i in 0..5) list.add(0, InteractionData("欢迎乔巴不小心～ $i"))
        notifyItemRangeInserted(0, 6)
    }

    fun refresh() {
        list.clear()
        for (i in 0..20) list.add(InteractionData("欢迎乔巴不小心～ $i"))
        notifyDataSetChanged()
    }

    fun clear() {
        list.clear()
        notifyDataSetChanged()
    }

    private fun addBaseData() {
        for (i in 0..20) list.add(InteractionData("欢迎乔巴不小心～ $i"))
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d(TAG, "onCreateViewHolder")
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.interaction_view_item_recycler, parent, false)
        return ViewHolder(view).apply { vhs.add(this) }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder ${holder.hashCode()}")
        holder.text.text = list[position].title
        if (list[position].height != -1) {
            holder.itemView.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
            holder.itemView.visibility = View.INVISIBLE
        } else {
            holder.itemView.layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
            holder.itemView.visibility = View.VISIBLE
        }
    }

    override fun onViewDetachedFromWindow(holder: ViewHolder) {
        super.onViewDetachedFromWindow(holder)
        Log.d(TAG, "onViewDetachedFromWindow ${holder.hashCode()}")
    }

    companion object {
        private const val TAG = "DAdapter"
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val text: TextView = itemView.findViewById(R.id.tv)
    }
}

data class InteractionData(val title: String, val height: Int = -1)