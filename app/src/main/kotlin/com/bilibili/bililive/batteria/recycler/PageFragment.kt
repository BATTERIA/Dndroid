package com.bilibili.bililive.batteria.recycler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.bilibili.bililive.batteria.R


class PageFragment : Fragment() {
    private var recyclerView: DRecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView?.layoutManager = LinearLayoutManager(context)
        recyclerView?.recycledViewPool
        val adapter = PagerAdapter()
        adapter.addData(PagerData(""))
        adapter.addData(PagerData(""))
        adapter.addData(PagerData(""))
        recyclerView?.adapter = adapter
        PagerSnapHelper().attachToRecyclerView(recyclerView)
    }

    companion object {

    }
}