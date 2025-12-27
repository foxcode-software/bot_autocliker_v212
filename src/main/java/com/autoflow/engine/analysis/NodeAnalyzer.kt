package com.autoflow.engine.analysis

import android.view.accessibility.AccessibilityNodeInfo

object NodeAnalyzer {
    fun isCandidate(node: AccessibilityNodeInfo): Boolean {
        return node.isClickable && node.isVisibleToUser
    }
}
