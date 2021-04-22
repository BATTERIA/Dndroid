package com.bilibili.bililive.batteria.hummer

import com.didi.hummer.HummerActivity
import com.didi.hummer.adapter.navigator.NavPage

class HummerTestActivity : HummerActivity() {
    override fun getPageInfo(): NavPage {
        return NavPage("HelloWorld.js")
    }
}