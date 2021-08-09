package com.bilibili.bililive.batteria.opengl

import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/7/29
 * @description:
 */
class CustomRender : GLSurfaceView.Renderer {
    override fun onDrawFrame(gl: GL10?) {

    }

    override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {
    }

    override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {
    }
}