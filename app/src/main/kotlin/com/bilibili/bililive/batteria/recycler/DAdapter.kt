package com.bilibili.bililive.batteria.recycler

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.recyclerview.widget.RecyclerView
import com.bilibili.bililive.batteria.R
import kotlinx.android.synthetic.main.view_item_recycler.view.*

class DAdapter : RecyclerView.Adapter<DAdapter.ViewHolder>() {
    private val list = mutableListOf<Data>()
    private val vhs = mutableListOf<ViewHolder>()

    fun addData(d: Data) {
        list.add(d)
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.d(TAG, "onCreateViewHolder")
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.view_item_recycler, parent, false)
        return ViewHolder(view).apply { vhs.add(this) }
    }

    override fun getItemCount(): Int {
//        Log.d(TAG, "getItemCount ${list.size}")
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder ${holder.hashCode()}")
        holder.image.setImageResource(list[position].id)
        holder.name.text = list[position].text
//        holder.itemView.iv.setImageResource(list[position].id)
//        holder.itemView.tv.text = list[position].text
    }

    companion object {
        private const val TAG = "DAdapter"
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.iv
        val name: TextView = itemView.findViewById(R.id.tv)
    }
}

data class Data(val text: String, @DrawableRes val id: Int)