package com.alekseysamoylov.patterns.domain.loan

import com.alekseysamoylov.patterns.domain.Money


class HousingLoanFactory private constructor() : AbstractLoanFactory<HousingLoan> {

  companion object {
    fun getInstance(): AbstractLoanFactory<HousingLoan> {
      return HousingLoanFactory()
    }
  }

  override fun returnLoan(loanType: LoanType, amount: Money): HousingLoan {
    return HousingLoan("housing", loanType, amount)
  }
}
