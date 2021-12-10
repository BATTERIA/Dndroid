package com.bilibili.bililive.batteria.flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.TextView
import com.bilibili.bililive.batteria.R
import com.bilibili.bililive.batteria.flow.drag.DragFlowLayout
import com.bilibili.bililive.batteria.flow.model.TagItem
import com.bilibili.bililive.batteria.flow.text.TextDragAdapter

class FlowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)

        setContentView(R.layout.activity_flow)

        val list = listOf(
            "1testtest",
            "2test",
            "3testtest",
            "4test",
            "5testtesttesttest",
            "6testtesttest",
            "7test",
            "8test",
            "9testtest",
            "10test",
            "11testtesttest",
            "12test",
            "13testtest",
            "14testtesttesttest",
            "15test",
            "16testtest"
        )
        val t = mutableListOf(TagItem("0test", false))
        t.addAll(list.map { TagItem(it) })
        val dfl = findViewById<DragFlowLayout>(R.id.dfl)
        val adapter = TextDragAdapter()
        adapter.initData(t)
        adapter.setItemClickListener {
            println("DTEST: ${it.value}")
        }
        dfl.setLayoutAdapter(adapter)

        var isEdit = false
        val switch = findViewById<TextView>(R.id.tv_switch)
        switch.setOnClickListener {
            switch.text = if (isEdit) {
                println("DTEST: ${adapter.getData()}")
                "编辑"
            } else "保存"
            isEdit = !isEdit
            adapter.setEditState(isEdit)
        }

        var time = 17
        val add = findViewById<TextView>(R.id.add_random)
        add.setOnClickListener {
            adapter.addData(TagItem("test${time++}"))
        }
    }
}