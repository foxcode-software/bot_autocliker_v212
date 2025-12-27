package com.autoflow.engine.core

object BlacklistManager {

    private val blocked = listOf(
        "pl.gov.mobywatel",
        "com.google.android.apps.wallet",
        "com.android.bank",
        "pl.pkobp.iko",
        "pl.mbank"
    )

    fun isBlocked(pkg: String?): Boolean {
        if (pkg == null) return false
        return blocked.any { pkg.contains(it) }
    }
}
