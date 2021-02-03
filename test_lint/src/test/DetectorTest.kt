package com.bilibili.bililive.test_lint

import com.android.tools.lint.checks.infrastructure.LintDetectorTest
import com.android.tools.lint.detector.api.Detector
import com.android.tools.lint.detector.api.Issue
import com.rocketzly.checks.detector.DependencyApiDetector

/**
 * @author: yaobeihaoyu
 * @version: 1.0
 * @since: 2020/11/5 7:20 PM
 * @description:
 */
class DetectorTest : LintDetectorTest() {
    override fun getDetector(): Detector {
        return DependencyApiDetector()
    }

    override fun getIssues(): MutableList<Issue> {
        return mutableListOf(DependencyApiDetector.ISSUE)
    }

    fun test() {
        lint().files(kotlin("""
import android.animation.Animator
import android.animation.ObjectAnimator
class CommonBean {
    private var s: String = "abc"

    init {
        ObjectAnimator.ofInt(1, 3).start()
        val a: Animator = ObjectAnimator.ofInt(1, 3)
        a.start()
        val b = ObjectAnimator.ofInt(1, 3)
        b.start()
        b.cancel()
        val sb:StringBuilder = StringBuilder()
        sb.append(1)
        StringBuilder().append(1)
    }
}

        """)).run().expect("No warnings.")
    }
}