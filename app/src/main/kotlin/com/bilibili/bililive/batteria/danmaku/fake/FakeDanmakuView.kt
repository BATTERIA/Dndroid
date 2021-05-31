package com.bilibili.bililive.batteria.danmaku.fake

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bilibili.bililive.batteria.danmaku.DanmakuAdapter
import com.bilibili.bililive.batteria.danmaku.DanmakuData

class FakeDanmakuView : LinearLayout {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) :
        super(context, attrs, defStyleAttr)

    private val mRecyclerViews = mutableListOf<RecyclerView>()

    // todo: 接入互动区adapter
    // private val mAdapters = mutableMapOf<Int, DanmakuAdapter>()
    private val mAdapters = mutableListOf<DanmakuAdapter>()

    private var mRecyclerPool: RecyclerView.RecycledViewPool? = null

    private var mRowSize = -1

    fun init(row: Int) {
        mRowSize = row
        for (i in 0 until mRowSize) {
            val recyclerView = RecyclerView(context)
            // 共用RecyclerPool
            if (null == mRecyclerPool) {
                mRecyclerPool = recyclerView.recycledViewPool
            } else {
                recyclerView.setRecycledViewPool(mRecyclerPool)
            }
            val layoutManager = object : LinearLayoutManager(context) {
                override fun smoothScrollToPosition(
                    recyclerView: RecyclerView,
                    state: RecyclerView.State,
                    position: Int
                ) {
                    val linearSmoothScroller =
                        UniformScroller(
                            context
                        )
                    linearSmoothScroller.let {
                        it.targetPosition = position
                        startSmoothScroll(it)
                    }
                }
            }
            layoutManager.orientation = LinearLayoutManager.HORIZONTAL
            recyclerView.layoutManager = layoutManager

            val adapter = DanmakuAdapter()
            // 占位
            adapter.addData(DanmakuData("", 1))
            mAdapters.add(adapter)
            mRecyclerViews.add(recyclerView)

            recyclerView.adapter = adapter
            addView(recyclerView)
        }
    }

    fun stopScrollAnimation() {
        for (i in 0 until mRowSize) mRecyclerViews[i].stopScroll()
    }

    fun startScrollToEnd() {
        for (i in 0 until mRowSize) mRecyclerViews[i].smoothScrollToPosition(mAdapters[i].itemCount - 1)
    }

    // todo: 测试代码 每行随机生成一个item
    fun generateRandomItem() {
        for (i in 0 until mRowSize) {
            val adapter = mAdapters[i]

            // 随机生成文案或者占位item
            var t = ""
            val blank = (0 until 2).random()
            val size = (0 until 5).random()
            for (j in 1..size) t += if (blank == 0) "测试" else "   "

            adapter.addData(DanmakuData(t))
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent): Boolean {
        for (i in 0 until childCount) getChildAt(i).onTouchEvent(event)
        return true
    }

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean = true
}