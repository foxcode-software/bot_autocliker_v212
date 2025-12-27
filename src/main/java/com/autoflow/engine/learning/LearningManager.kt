package com.autoflow.engine.learning

import android.view.accessibility.AccessibilityNodeInfo

object LearningManager {
    private val learned = mutableListOf<LearnedNode>()

    fun learn(node: AccessibilityNodeInfo) {
        learned.add(LearnedNode(node.viewIdResourceName, node.className?.toString()))
    }
}
