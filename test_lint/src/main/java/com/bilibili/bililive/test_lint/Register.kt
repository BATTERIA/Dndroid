package com.bilibili.bililive.test_lint

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.Issue

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/11/5 5:35 PM
 * @description:
 */
class Register : IssueRegistry() {
    override val issues: List<Issue>
        get() = listOf(NamingConventionDetector.ISSUE, SerializableClassDetector.ISSUE, TestDetector.ISSUE)
}