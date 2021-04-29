package com.bilibili.bililive.batteria.recycler

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView
import com.bilibili.bililive.batteria.R

class PagerAdapter : RecyclerView.Adapter<PagerAdapter.ViewHolder>() {
    private val list = mutableListOf<PagerData>()
    private val vhs = mutableListOf<ViewHolder>()

    fun addData(d: PagerData) {
        list.add(d)
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d(TAG, "onCreateViewHolder")
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.page_view_item_recycler, parent, false)
        return ViewHolder(view).apply { vhs.add(this) }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder ${holder.hashCode()}")
    }

    override fun onViewDetachedFromWindow(holder: ViewHolder) {
        super.onViewDetachedFromWindow(holder)
        Log.d(TAG, "onViewDetachedFromWindow ${holder.hashCode()}")
    }

    companion object {
        private const val TAG = "DAdapter"
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    }
}

data class PagerData(val title: String)