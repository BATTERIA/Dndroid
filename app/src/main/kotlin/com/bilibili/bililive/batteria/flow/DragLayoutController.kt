package com.bilibili.bililive.batteria.flow

import android.view.View

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/6
 * @description:
 */
interface DragLayoutController {
    fun generateStub(view: View, size: Size)

    fun replaceStub(view: View, onFinish: () -> Unit)

    fun setDraggingView(view: View)

    fun removeDraggingView()

    fun detectViewCollision(view: DragView, x: Int, y: Int)
}