package com.alekseysamoylov.patterns.domain

import spock.lang.Specification


class MoneyTest extends Specification {

    def "Should convert String into Money"() {
        setup:
        def amount = "100"

        when:
        Money result = Money.valueOf(amount)

        then:
        result != null
        result.amount == BigDecimal.valueOf(100)
        result.toString() == "\$100"
    }

    def "Should get default Money instance"() {
        when:
        Money result = Money.create()

        then:
        result != null
        result.amount == BigDecimal.ZERO
    }
}
