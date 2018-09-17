package com.alekseysamoylov.patterns.domain


/**
 * Builder pattern
 */
class Borrower(private val email: String,
               private var firstName: String = "",
               var lastName: String = "",
               private var _phone: String = "",
               var type: String = "") {

  fun phone(phone: String): Borrower {
    _phone = phone
    return this
  }

  class ShortTimeBorrowerBuilder(email: String) {
    private var borrower: Borrower = Borrower(email = email, type = "Short time borrower")

    fun firstName(firstName: String): ShortTimeBorrowerBuilder {
      this.borrower.firstName = firstName
      return this
    }

    fun build(): Borrower {
      return borrower
    }
  }

}


fun main(args: Array<String>) {
  val borrower = Borrower.ShortTimeBorrowerBuilder("email@mail.com").firstName("John").build()

  val borrower1 = Borrower("Email").phone("234323")

  val borrower2 = Borrower("emaaill").apply {
    type = "new borrower"
    lastName = "Smith"
  }.phone("23434534")
}



