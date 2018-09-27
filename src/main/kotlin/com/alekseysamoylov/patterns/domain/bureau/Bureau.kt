package com.alekseysamoylov.patterns.domain.bureau


/**
 * Adapter
 */
interface UsCentralBank {
  fun pushHistories(histories: List<String>)
}

class DefaultUsCentralBank: UsCentralBank {
  override fun pushHistories(histories: List<String>) {
    println("Sending histories: $histories to US Central Bank")
  }
}

fun UsCentralBank.toCommonCreditHistory(): CommonCreditHistory {
  return object : CommonCreditHistory {
    override fun sendHistories(histories: Set<String>) {
      DefaultUsCentralBank().pushHistories(histories.toList())
    }
  }
}

fun main(args: Array<String>) {
  val usCentralBankAdoptedToCommon = DefaultUsCentralBank().toCommonCreditHistory()
  perform(usCentralBankAdoptedToCommon)
}


fun perform(commonCreditHistory: CommonCreditHistory) {
  val histories = setOf("First History", "Second History")
  commonCreditHistory.sendHistories(histories)
}
