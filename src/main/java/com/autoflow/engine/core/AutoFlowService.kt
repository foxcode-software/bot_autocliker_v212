package com.autoflow.engine.core

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import com.autoflow.engine.search.ClickSearchEngine

class AutoFlowService : AccessibilityService() {

    private val searchEngine = ClickSearchEngine()

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        val root = rootInActiveWindow ?: return

        if (BlacklistManager.isBlocked(event?.packageName?.toString())) return
        if (!ModeManager.isSearch()) return

        searchEngine.scanAndClick(root, this)
    }

    override fun onInterrupt() {}
}
