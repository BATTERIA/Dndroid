package com.bilibili.bililive.batteria.wordmerge

import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.annotation.DrawableRes
import com.bilibili.bililive.batteria.R

class WordMergeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_merge)

        test(R.drawable.ohh2)
//        test(R.drawable.ohh3)
    }

    fun test(@DrawableRes id: Int) {
        val drawable = resources.getDrawable(id) as BitmapDrawable
        val bitmap = drawable.bitmap

        val width = bitmap.width
        val height = bitmap.height
        val pixels = IntArray(width * height)
        bitmap.getPixels(pixels, 0, width, 0, 0, width, height)
        val matrix = Array(height) { ByteArray(width) }

        for (i in 0 until height) {
            for (j in 0 until width) {
                matrix[i][j] = if (pixels[i * width + j] == -1) 0 else 1
            }
        }

        val view = WordMergeView(this)
        view.setData(matrix)
        findViewById<LinearLayout>(R.id.ll).addView(view)
    }
}