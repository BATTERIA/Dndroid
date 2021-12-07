package com.bilibili.bililive.batteria.flow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import com.bilibili.bililive.batteria.R
import com.bilibili.bililive.batteria.flow.drag.DragFlowLayout
import com.bilibili.bililive.batteria.flow.text.TextDragAdapter

class FlowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_flow)

        val dfl = findViewById<DragFlowLayout>(R.id.dfl)
        val adapter = TextDragAdapter()
        adapter.initData(
            listOf(
                "test",
                "testtest",
                "test",
                "testtest",
                "test",
                "testtest",
                "testtest",
                "test",
                "testtest"
            )
        )
        dfl.setLayoutAdapter(adapter)

    }
}