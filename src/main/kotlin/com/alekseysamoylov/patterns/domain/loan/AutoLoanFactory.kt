package com.alekseysamoylov.patterns.domain.loan

import com.alekseysamoylov.patterns.domain.Money


class AutoLoanFactory private constructor() : AbstractLoanFactory<AutoLoan> {

  companion object {
    fun getInstance(): AbstractLoanFactory<AutoLoan> {
      return AutoLoanFactory()
    }
  }

  override fun returnLoan(loanType: LoanType, amount: Money): AutoLoan {
    return AutoLoan("auto", loanType, amount)
  }
}
