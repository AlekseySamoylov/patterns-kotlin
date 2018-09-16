package com.alekseysamoylov.patterns.service

import com.alekseysamoylov.patterns.domain.Money
import com.alekseysamoylov.patterns.domain.loan.LoanType
import spock.lang.Specification


class LoanServiceTest extends Specification {

    def "Should return Auto Loan Long term"() {
        setup:
        def loanService = new LoanService()
        def autoLoanFactory = loanService.getAutoLoanFactory()

        when:
        def autoLoan = autoLoanFactory.returnLoan(LoanType.LONG, Money.valueOf("100"))

        then:
        autoLoan.name == "auto"
        autoLoan.type == LoanType.LONG
    }


    def "Should return Housing Loan Short term"() {
        setup:
        def loanService = new LoanService()
        def factory = loanService.getHousingLoanFactory()

        when:
        def autoLoan = factory.returnLoan(LoanType.SHORT, Money.valueOf("100"))

        then:
        autoLoan.name == "housing"
        autoLoan.type == LoanType.SHORT
    }


}
