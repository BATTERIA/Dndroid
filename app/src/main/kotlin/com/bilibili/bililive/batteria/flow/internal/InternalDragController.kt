package com.bilibili.bililive.batteria.flow.internal

import android.view.View
import com.bilibili.bililive.batteria.flow.drag.DragView
import com.bilibili.bililive.batteria.flow.model.Size

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/6
 * @description:
 */
interface InternalDragController {
    fun generateStub(view: View, size: Size)

    fun replaceStub(view: View, onFinish: () -> Unit)

    fun setDraggingView(view: View)

    fun removeDraggingView()

    fun detectViewCollision(view: DragView)
}