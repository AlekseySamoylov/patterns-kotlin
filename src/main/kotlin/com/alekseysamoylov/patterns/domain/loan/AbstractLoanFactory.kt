package com.alekseysamoylov.patterns.domain.loan

import com.alekseysamoylov.patterns.domain.Money


interface AbstractLoanFactory<out T : Loan> {

  fun returnLoan(loanType: LoanType, amount: Money): T
}
