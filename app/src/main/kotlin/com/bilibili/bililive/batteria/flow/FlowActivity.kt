package com.bilibili.bililive.batteria.flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
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
            "testtest",
            "test",
            "testtest",
            "test",
            "testtesttesttest",
            "testtesttest",
            "test",
            "test",
            "testtest",
            "test",
            "testtesttest",
            "test",
            "testtest",
            "testtesttesttest",
            "test",
            "testtest"
        )
        val t = mutableListOf(TagItem("test", false))
        t.addAll(list.map { TagItem(it) })
        val dfl = findViewById<DragFlowLayout>(R.id.dfl)
        val adapter = TextDragAdapter()
        adapter.initData(t)
        dfl.setLayoutAdapter(adapter)


        var isEdit = false
        val switch = findViewById<TextView>(R.id.tv_switch)
        switch.setOnClickListener {
            switch.text = if (isEdit) "保存" else "编辑"
            adapter.setEditable(isEdit)
            isEdit = !isEdit
        }
    }
}