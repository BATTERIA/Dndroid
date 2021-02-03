package com.bilibili.bililive.tests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar

class ProgressActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progress)

        val progress = findViewById<ProgressBar>(R.id.progress)
        findViewById<Button>(R.id.bt1).setOnClickListener {
            progress.incrementProgressBy(-10)
        }
        findViewById<Button>(R.id.bt2).setOnClickListener {
            progress.incrementProgressBy(10)
        }
    }
}