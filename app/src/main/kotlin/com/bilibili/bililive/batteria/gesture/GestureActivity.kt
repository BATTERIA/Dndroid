package com.bilibili.bililive.batteria.gesture

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager

class GestureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val dl = DragLayout(this)
        setContentView(dl)
        dl.initDistrictData(
//            listOf(
//                DistrictData(
//                    DistrictScaleType.ABSOLUTE,
//                    0f,
//                    DistrictScaleType.MID,
//                    0f,
//                    SizeScaleType.WIDTH,
//                    0.62f,
//                    1.7778f,
//                    Color.BLUE
//                ),
//                DistrictData(
//                    DistrictScaleType.ABSOLUTE,
//                    0.62f,
//                    DistrictScaleType.MID,
//                    0f,
//                    SizeScaleType.WIDTH,
//                    0.38f,
//                    1.7778f,
//                    Color.GREEN
//                )
//            )
            listOf(
                DistrictData(
                    DistrictScaleType.ABSOLUTE,
                    0f,
                    DistrictScaleType.ABSOLUTE,
                    0f,
                    SizeScaleType.ABSOLUTE,
                    0.5f,
                    1f,
                    Color.BLUE
                ),
                DistrictData(
                    DistrictScaleType.ABSOLUTE,
                    0.5f,
                    DistrictScaleType.ABSOLUTE,
                    0f,
                    SizeScaleType.ABSOLUTE,
                    0.5f,
                    0.5f,
                    Color.GREEN
                ),
                DistrictData(
                    DistrictScaleType.ABSOLUTE,
                    0.5f,
                    DistrictScaleType.ABSOLUTE,
                    0.5f,
                    SizeScaleType.ABSOLUTE,
                    0.5f,
                    0.5f,
                    Color.RED
                )
            )
        )
    }
}