package com.alekseysamoylov.patterns.domain.deposit

import java.time.Period

/**
 * Prototype
 */
data class Deposit(var name: String = "Default Deposit",
                   var type: String = "Saving Deposit",
                   var timePeriod: Period = Period.ofMonths(12),
                   var percent: Int = 10)

fun main(args: Array<String>) {
  val deposit = Deposit()

  val customDeposit = deposit.copy(timePeriod = Period.ofMonths(24))

  print(customDeposit)
}
