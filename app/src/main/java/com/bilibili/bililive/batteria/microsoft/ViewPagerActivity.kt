package com.bilibili.bililive.batteria.microsoft

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.*
import com.bilibili.bililive.batteria.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        val tabLayout = findViewById<TabLayout>(R.id.tl)

        val list = mutableListOf(
            "hello",
            "world",
            "test",
            "world",
            "test",
            "world",
            "test",
            "world",
            "test",
            "world",
            "test",
            "world",
            "test"
        )

        val adapter = CustomViewPagerAdapter(list)
        val viewPager2: ViewPager2 = findViewById(R.id.view_pager)
        viewPager2.orientation = ORIENTATION_VERTICAL
        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, pos ->
            tab.text = list[pos]
        }.attach()

        val rv = findViewById<MidTabLayout>(R.id.rv)
        rv.adapter = AvatarAdapter(list)
        val llm = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv.layoutManager = llm
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rv)

        /**
         * mediator
         */

//        var isMovingViewPager = false

        rv.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            var moveX = 0
            var previousState = SCROLL_STATE_IDLE
            var state = SCROLL_STATE_IDLE

            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)

                previousState = state
                state = newState

                when (newState) {
//                    // 都在移动中
                    SCROLL_STATE_DRAGGING -> {
//                        isMovingViewPager = false
                        println("test-d DRAGGING")
                        viewPager2.beginFakeDrag()
                    }
                    SCROLL_STATE_SETTLING -> {
//                        isMovingViewPager = false
                        println("test-d SETTLING")
//                        viewPager2.beginFakeDrag()
                        //
//                        moveX / rv.measuredHeight
                    }
                    SCROLL_STATE_IDLE -> {
//                        isMovingViewPager = true
                        println("test-d IDLE")
                        viewPager2.endFakeDrag()
                        // 矫正位置
                        if (previousState == SCROLL_STATE_SETTLING) {
                            // 跳转到该到的 page
                            val t = llm.getPosition(snapHelper.findSnapView(llm)!!) - 1
//                            val t =rv.getChildAdapterPosition(snapHelper.findSnapView(llm)!!) -1
//                            println("curPage $t, ${rv.currentPage}")
                            viewPager2.setCurrentItem(t, true)
                            moveX = 0
                        }
                    }
                }
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (state != SCROLL_STATE_SETTLING || previousState == SCROLL_STATE_DRAGGING) {

                }

                moveX += dx
                if (state == SCROLL_STATE_IDLE) return

//                viewPager2.beginFakeDrag()
                viewPager2.fakeDragBy(
//                    0,
                    -(dx / rv.measuredHeight.toFloat() * viewPager2.measuredHeight)
                )
//                viewPager2.endFakeDrag()
            }
        })

        viewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                if (viewPager2.isFakeDragging) return
//                if (!isMovingViewPager) return
//                isMovingViewPager = true
//                println("d-test onPageScrolled $position, $positionOffset")
                rv.scrollToTab(position, positionOffset)
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (viewPager2.isFakeDragging) return
//                if (!isMovingViewPager) return
//                println("d-test onPageSelected $position")
                rv.scrollToTab(position)
//                isMovingViewPager = false
            }

//            override fun onPageScrollStateChanged(state: Int) {
//                super.onPageScrollStateChanged(state)
//                when (state) {
//                    // 都在移动中
//                    SCROLL_STATE_DRAGGING-> {
//                        isMovingViewPager = true
//                    }
//                    SCROLL_STATE_SETTLING -> {
//                        isMovingViewPager = true
//                    }
//                    SCROLL_STATE_IDLE -> {
//                        isMovingViewPager = false
//                    }
//                }
//            }
        })

        // todo ViewPager2和RecyclerView需要匹配下
//        scrollToTab(mViewPager.getCurrentItem());
    }
}