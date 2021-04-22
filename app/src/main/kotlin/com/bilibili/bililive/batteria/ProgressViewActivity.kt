package com.bilibili.bililive.batteria

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bilibili.bililive.batteria.view.ProgressView

class ProgressViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress_view)
        print(findViewById<ProgressView>(R.id.test).test())
    }
}