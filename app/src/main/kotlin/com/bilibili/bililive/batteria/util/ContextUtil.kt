package com.bilibili.bililive.batteria.util

import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentActivity

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/4/19
 * @description:
 */
inline fun FragmentActivity.showFragmentSafely(tag: String, fragmentFactory: () -> DialogFragment) {
    val fragment = supportFragmentManager.findFragmentByTag(tag)
    if (fragment != null && fragment.isAdded) {
        return
    }
    supportFragmentManager.beginTransaction()
        .add(fragmentFactory.invoke(), tag)
        .commitAllowingStateLoss()
}