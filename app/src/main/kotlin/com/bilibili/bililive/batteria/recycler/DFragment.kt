package com.bilibili.bililive.batteria.recycler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.bilibili.bililive.batteria.R

class DFragment(private val signal: String) : Fragment() {
    var recyclerView: DRecyclerView? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView?.signal = signal
        recyclerView?.layoutManager = LinearLayoutManager(context)
        DAdapter().apply {
//            for (i in 0..200) addData(Data(random(), getDrawable()))
            for (i in 0..10) addData(Data(i.toString(), list[i % 6]))
        }.let { recyclerView?.adapter = it }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_d, container, false)
    }

//    private fun random(): String = (0 until 100).random().toString()

//    private fun getDrawable(): Int = list[(0 until 6).random()]

    companion object {
        private const val TAG = "DFragment"
        private val list = listOf(
            R.drawable.list,
            R.drawable.web,
            R.drawable.image,
            R.drawable.network,
            R.drawable.progress,
            R.drawable.ic_more_cache
        )
    }
}