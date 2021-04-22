package com.bilibili.bililive.batteria.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bilibili.bililive.batteria.R
import com.bilibili.bililive.batteria.util.Statistics

class RecyclerActivity : AppCompatActivity() {
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        Statistics.start(baseContext)
        viewPager = findViewById(R.id.vp)
        viewPager?.adapter = object : FragmentPagerAdapter(supportFragmentManager) {
            val list = listOf(
                InteractionFragment(),
                PageFragment(),
                DFragment("B")
            )
            override fun getItem(position: Int): Fragment {
                return list[position]
            }

            override fun getCount(): Int {
                return list.size
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Statistics.end()
    }
}