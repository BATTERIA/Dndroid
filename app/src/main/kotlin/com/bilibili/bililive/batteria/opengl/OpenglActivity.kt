package com.bilibili.bililive.batteria.opengl

import android.opengl.GLSurfaceView
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class OpenglActivity : AppCompatActivity() {
    var glSurfaceView: GLSurfaceView? = null
    var renderSet = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val glSurfaceView = GLSurfaceView(this)
        setContentView(glSurfaceView)


        glSurfaceView.setEGLContextClientVersion(2)
        glSurfaceView.setRenderer(TriggerRender())
        renderSet = true
    }

    override fun onPause() {
        super.onPause()
        if (renderSet) {
            glSurfaceView?.onPause()
        }
    }

    override fun onResume() {
        super.onResume()
        if (renderSet) {
            glSurfaceView?.onResume()
        }
    }
}