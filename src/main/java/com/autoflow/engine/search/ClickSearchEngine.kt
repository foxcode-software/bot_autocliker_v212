package com.autoflow.engine.search

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityNodeInfo
import com.autoflow.engine.utils.NodeUtils

class ClickSearchEngine {

    fun scanAndClick(root: AccessibilityNodeInfo, service: AccessibilityService) {
        val nodes = NodeUtils.flatten(root)

        for (node in nodes) {
            if (node.isClickable && node.isVisibleToUser) {
                node.performAction(AccessibilityNodeInfo.ACTION_CLICK)
                break
            }
        }
    }
}
