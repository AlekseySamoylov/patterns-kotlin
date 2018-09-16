package com.alekseysamoylov.patterns.domain.loan

import com.alekseysamoylov.patterns.domain.Money

interface Loan {
  fun getName(): String
  fun getAmount(): Money
  fun getType(): LoanType
}
