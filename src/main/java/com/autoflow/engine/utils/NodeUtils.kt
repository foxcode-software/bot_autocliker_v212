package com.autoflow.engine.utils

import android.view.accessibility.AccessibilityNodeInfo

object NodeUtils {

    fun flatten(root: AccessibilityNodeInfo): List<AccessibilityNodeInfo> {
        val list = mutableListOf<AccessibilityNodeInfo>()
        traverse(root, list)
        return list
    }

    private fun traverse(node: AccessibilityNodeInfo, list: MutableList<AccessibilityNodeInfo>) {
        list.add(node)
        for (i in 0 until node.childCount) {
            node.getChild(i)?.let { traverse(it, list) }
        }
    }
}
