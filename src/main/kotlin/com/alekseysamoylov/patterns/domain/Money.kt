package com.alekseysamoylov.patterns.domain

import java.math.BigDecimal

/**
 * Static Factory Method example
 */
class Money private constructor(val amount: BigDecimal, private val currency: String = "$") {

  companion object {
    @JvmStatic
    fun create(): Money {
      return Money(BigDecimal.ZERO)
    }

    @JvmStatic
    fun valueOf(input: String): Money {
      return Money(amount = BigDecimal(input))
    }
  }

  override fun toString(): String {
    return "$currency$amount"
  }
}
