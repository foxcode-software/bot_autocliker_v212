package com.autoflow.engine.core

object ModeManager {
    private var mode = Mode.SEARCH

    enum class Mode { SEARCH, LEARNING, OFF }

    fun isSearch() = mode == Mode.SEARCH
    fun isLearning() = mode == Mode.LEARNING
}
