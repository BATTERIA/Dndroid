package com.bilibili.bililive.batteria.recycler

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.bilibili.bililive.batteria.*
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.runOnUiThread
import java.lang.Thread.sleep
import java.util.*

class InteractionFragment : Fragment() {
    var recyclerView: DRecyclerView? = null
    var adapter: InteractionAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_interaction, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // interaction
        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView?.layoutManager = object : LinearLayoutManager(context) {
            override fun smoothScrollToPosition(recyclerView: RecyclerView, state: RecyclerView.State, position: Int) {
                val linearSmoothScroller = NewDanmuSmoothScroller(context)
                linearSmoothScroller.let {
                    it.setSpeedInterval(1000f)
                    it.targetPosition = position
                    startSmoothScroll(it)
                }
            }
        }
        recyclerView?.recycledViewPool
        adapter = InteractionAdapter()
        recyclerView?.adapter = adapter
        recyclerView?.smoothScrollToPosition(adapter!!.itemCount - 1)

        // buttons
        val recyclerViewButtons = view.findViewById<RecyclerView>(R.id.recycler_view_buttons)
        recyclerViewButtons.layoutManager = GridLayoutManager(context, 5)
        val adapter2 = ItemAdapter()
        adapter2.setItems(listOf(Item("addLast", R.drawable.ic_more_cache) {
            adapter?.addData(InteractionData("add last"))
//            recyclerView?.smoothScrollToPosition(adapter!!.itemCount - 1)
        }, Item("notifyAll", R.drawable.ic_more_cache) {
            adapter?.notifyDataSetChanged()
        }, Item("refresh", R.drawable.ic_more_cache) {
            adapter?.refresh()
            recyclerView?.smoothScrollToPosition(adapter!!.itemCount - 1)
        }, Item("clear", R.drawable.ic_more_cache) {
            adapter?.clear()
        }, Item("keepAdd", R.drawable.ic_more_cache) {
            if (isRunning) return@Item
            isRunning = true
            val thread = Worker()
            thread.start()
            workers.add(thread)
        }, Item("stopAdd", R.drawable.ic_more_cache) {
            interrupt()
            isRunning = false
        }, Item("moveToLast", R.drawable.ic_more_cache) {
            recyclerView?.smoothScrollToPosition(adapter!!.itemCount - 1)
        }, Item("addAndAnim10", R.drawable.ic_more_cache) {
            val size = adapter!!.itemCount
            for (i in 1..10) adapter?.addData(InteractionData("keep adding ${t++}"))
            adapter?.notifyItemRangeInserted(size, 10)
            recyclerView?.smoothScrollToPosition(adapter!!.itemCount - 1)
        }, Item("addAndAnim110", R.drawable.ic_more_cache) {
            val size = adapter!!.itemCount
            for (i in 1..110) adapter?.addData(InteractionData("keep adding ${t++}"))
            adapter?.notifyItemRangeInserted(size, 110)
            recyclerView?.smoothScrollToPosition(adapter!!.itemCount - 1)
        }))
        recyclerViewButtons.adapter = adapter2
    }

    private val workers = mutableListOf<Thread>()
    private var t = 1
    private var isRunning = false

    inner class Worker : Thread() {
        override fun run() {
            try {
                while(true) {
                    sleep(400)
                    context?.runOnUiThread {
                        val size = adapter!!.itemCount
                        for (i in 1..11) adapter?.addData(InteractionData("keep adding ${t++}"))
                        adapter?.notifyItemRangeInserted(size, 11)
                        recyclerView?.smoothScrollToPosition(adapter!!.itemCount - 1)
                    }
                }
            } catch (e: Exception) {
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        interrupt()
    }

    private fun interrupt() {
        workers.forEach {
            try {
                if (it.isAlive) {
                    it.interrupt()
                }
                workers.remove(it)
            } catch (e: Exception) {
            }
        }

    }
    companion object {

    }
}