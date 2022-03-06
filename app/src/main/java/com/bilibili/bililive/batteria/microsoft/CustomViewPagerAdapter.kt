package com.bilibili.bililive.batteria.microsoft

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bilibili.bililive.batteria.R

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2022/3/5
 * @description:
 */
class CustomViewPagerAdapter(private val list: MutableList<String> = mutableListOf()) : RecyclerView.Adapter<CustomViewPagerAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder =
        MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false))

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tv.text = list[position]
    }

    override fun getItemCount(): Int = list.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tv: TextView = itemView.findViewById(R.id.tv)
    }

}