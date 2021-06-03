package com.bilibili.bililive.batteria.danmaku

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.bilibili.bililive.batteria.R
import com.bilibili.bililive.batteria.danmaku.fake.FakeDanmakuView


class DanmakuActivity : AppCompatActivity() {
    private val workers = mutableListOf<Thread>()
    private var running = false
    private var auto = true

    private var fakeDanmakuView: FakeDanmakuView? = null

    //发送弹幕的输入框和按钮
    private var editText: EditText? = null
    private var btl: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_danmaku)

        fakeDanmakuView = findViewById(R.id.fake_danmaku_view)
        fakeDanmakuView?.init(8)

        editText = findViewById(R.id.et)
        btl = findViewById(R.id.bt)
        //点击发送按钮监听
        btl?.setOnClickListener {
            if (auto) {
                interrupt()
                fakeDanmakuView?.stopScrollAnimation()
                auto = false
            } else {
                auto = true
                Worker1().apply { workers.add(this) }.start()
            }
        }
//        Worker1().apply { workers.add(this) }.start()
//        running = true
    }

    override fun onDestroy() {
        super.onDestroy()
        interrupt()
    }

    private fun interrupt() {
        if (!running) return
        running = false
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

    inner class Worker1 : Thread() {
        override fun run() {
            try {
                while (true) {
                    sleep(50)
                    runOnUiThread {
                        fakeDanmakuView?.generateRandomItem()
                        fakeDanmakuView?.startScrollToEnd()
                    }
                }
            } catch (e: Exception) {
            }
        }
    }
}