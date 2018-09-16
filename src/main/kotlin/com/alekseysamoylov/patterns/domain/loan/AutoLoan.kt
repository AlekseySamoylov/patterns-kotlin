package com.alekseysamoylov.patterns.domain.loan

import com.alekseysamoylov.patterns.domain.Money


class AutoLoan(private val name: String,
               private val type: LoanType,
               private val amount: Money) : Loan {
  override fun getName(): String {
    return name
  }

  override fun getAmount(): Money {
    return amount
  }

  override fun getType(): LoanType {
    return type
  }

}
