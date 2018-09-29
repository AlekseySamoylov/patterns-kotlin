package com.alekseysamoylov.patterns.domain.scoring


fun main(args: Array<String>) {
  val creditPolicy = UsCreditPolicy(UsScoring())

  println(creditPolicy.getDecision("John"))
}
