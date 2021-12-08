package com.bilibili.bililive.batteria.flow.model

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2021/12/8
 * @description:
 */
data class TagItem<T>(
    val value: T,
    val isEditable: Boolean = true
)