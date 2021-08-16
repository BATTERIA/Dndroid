package com.bilibili.bililive.batteria.gesture

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import com.bilibili.bililive.batteria.R

class GestureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        val view1 = ImageView(this)
        view1.setBackgroundColor(Color.BLUE)

        val view2 = ImageView(this)
        view2.setBackgroundColor(Color.GREEN)
        view2.id = R.id.bt1
        val dl = DragLayout(this)
        dl.initConfig(DragConfig(20, 0.8f, 200, 800, true, 100))
//        dl.initDistrictData(
//            listOf(DistrictData(DistrictScaleType.ABSOLUTE, 0f, DistrictScaleType.MID,
//                    0f, SizeScaleType.WIDTH, 0.62f, 1.7778f, view1),
//                DistrictData(DistrictScaleType.ABSOLUTE, 0.62f, DistrictScaleType.MID,
//                    0f, SizeScaleType.WIDTH, 0.38f, 1.7778f, view2)))

        dl.initDistrictData(getData())
//        dl.initDistrictData(getHalfData())

        setContentView(dl)


//        HandlerThreads.postDelayed(HandlerThreads.THREAD_UI, {
//            dl.setSize(ViewGroup.LayoutParams.MATCH_PARENT, 500)
//            dl.updateDistrictData(listOf(DistrictData(DistrictScaleType.ABSOLUTE, 0f, DistrictScaleType.ABSOLUTE,
//                0f, SizeScaleType.ABSOLUTE, 1f, 1f, view1)))
//            dl.setDragEnable(false)
//        }, 2000)
    }

    private fun getData(): List<DistrictData> {
        val iv1 = ImageView(this)
        iv1.setBackgroundColor(Color.BLUE)

        val iv2 = ImageView(this)
        iv2.setBackgroundColor(Color.GREEN)

        val iv3 = ImageView(this)
        iv3.setBackgroundColor(Color.RED)

        return listOf(
            DistrictData(
                DistrictScaleType.ABSOLUTE,
                0f,
                DistrictScaleType.ABSOLUTE,
                0f,
                SizeScaleType.ABSOLUTE,
                0.5f,
                1f,
                iv1
            ),
            DistrictData(
                DistrictScaleType.ABSOLUTE,
                0.5f,
                DistrictScaleType.ABSOLUTE,
                0f,
                SizeScaleType.ABSOLUTE,
                0.5f,
                0.5f,
                iv2
            ),
            DistrictData(
                DistrictScaleType.ABSOLUTE,
                0.5f,
                DistrictScaleType.ABSOLUTE,
                0.5f,
                SizeScaleType.ABSOLUTE,
                0.5f,
                0.5f,
                iv3
            )
        )
    }

    private fun getHalfData(): List<DistrictData> {
        val iv1 = ImageView(this)
        iv1.setBackgroundColor(Color.BLUE)

        val iv2 = ImageView(this)
        iv2.setBackgroundColor(Color.GREEN)


        return listOf(
            DistrictData(
                DistrictScaleType.ABSOLUTE,
                0f,
                DistrictScaleType.ABSOLUTE,
                0f,
                SizeScaleType.ABSOLUTE,
                0.3f,
                1f,
                iv1
            ),
            DistrictData(
                DistrictScaleType.ABSOLUTE,
                0.5f,
                DistrictScaleType.ABSOLUTE,
                0f,
                SizeScaleType.ABSOLUTE,
                0.5f,
                1f,
                iv2
            )
        )
    }
}