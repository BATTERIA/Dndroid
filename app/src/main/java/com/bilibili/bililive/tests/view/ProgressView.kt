package com.bilibili.bililive.tests.view

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.*
import android.os.Build
import android.support.annotation.RequiresApi
import android.util.AttributeSet
import android.view.View
import com.bilibili.bililive.tests.R

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/7/27 2:50 PM
 * @description:
 */
class ProgressView(context: Context, set: AttributeSet) : View(context, set) {
    private val paint: Paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val path = Path()
    val array = intArrayOf(resources.getColor(R.color.pk_battle_left_progress_start),
        resources.getColor(R.color.pk_battle_left_progress_end),
        resources.getColor(R.color.pk_battle_right_progress_start),
        resources.getColor(R.color.pk_battle_right_progress_end))

//
//    val array = intArrayOf(resources.getColor(R.color.pk_bg2),
//        resources.getColor(R.color.pk_bg),
//        resources.getColor(R.color.pk_bg),
//        resources.getColor(R.color.pk_bg2))
//    val array = intArrayOf(R.color.pk_bg, R.color.pk_bg)

    @SuppressLint("DrawAllocation")
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        paint.color = resources.getColor(R.color.pk_bg)
//        path.moveTo(0f, 0f)
//        path.lineTo(width.toFloat(), height.toFloat())
//        canvas?.drawPath(path, paint)

//        val linearGradient = LinearGradient(
//            0f, 0f, width.toFloat(), 0f,
//            array, floatArrayOf(0f, 0.5f, 0.5f, 1f),
//            Shader.TileMode.CLAMP
//        )
//        val linearGradient = LinearGradient(
//            0f, 0f, width.toFloat(), 0f,
//            array, floatArrayOf(0f, height / width.toFloat(), 1 - height / width.toFloat(), 1f),
//            Shader.TileMode.CLAMP
//        )
//
//        paint.shader = linearGradient
        val path = Path()
        path.addCircle(dip2px(context, 15f), dip2px(context, 15f), dip2px(context, 15f), Path.Direction.CW)
        path.addCircle(dip2px(context, 244f), dip2px(context, 15f), dip2px(context, 15f), Path.Direction.CW)
        path.addRect(dip2px(context, 15f), dip2px(context, 6f), dip2px(context, 244f), dip2px(context, 24f), Path.Direction.CW)
//        canvas?.drawCircle(dip2px(context, 15f), dip2px(context, 15f), dip2px(context, 15f), paint)
//        canvas?.drawCircle(dip2px(context, 244f), dip2px(context, 15f), dip2px(context, 15f), paint)
//        canvas?.drawRect(dip2px(context, 15f), dip2px(context, 6f), dip2px(context, 244f), dip2px(context, 24f), paint)
        canvas?.drawPath(path, paint)
    }

    fun dip2px(context: Context, dipValue: Float): Float {
        val scale = context.resources.displayMetrics.density
        return dipValue * scale + 0.5f
    }
}