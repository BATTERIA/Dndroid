package com.bilibili.bililive.batteria

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/9/18
 * @description:
 */
class MainViewModel : ViewModel() {
    val testData = MutableLiveData<TData>()
}

data class TData(val data: String)