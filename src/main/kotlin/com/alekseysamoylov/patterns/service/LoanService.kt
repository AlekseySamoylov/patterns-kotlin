package com.alekseysamoylov.patterns.service

import com.alekseysamoylov.patterns.domain.loan.*
import org.springframework.stereotype.Service

@Service
class LoanService {

  fun getAutoLoanFactory(): AbstractLoanFactory<AutoLoan> {
    return AutoLoanFactory.getInstance()
  }

  fun getHousingLoanFactory(): AbstractLoanFactory<HousingLoan> {
    return HousingLoanFactory.getInstance()
  }
}
