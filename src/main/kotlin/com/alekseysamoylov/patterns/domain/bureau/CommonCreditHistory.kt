package com.alekseysamoylov.patterns.domain.bureau

/**
 * Adapter
 */
interface CommonCreditHistory {
  fun sendHistories(histories: Set<String>)
}
