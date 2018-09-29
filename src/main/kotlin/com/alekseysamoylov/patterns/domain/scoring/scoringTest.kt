package com.alekseysamoylov.patterns.domain.scoring


fun main(args: Array<String>) {
  val creditPolicy = UsCreditPolicy(UsScoring())

  for (i in 1..100) {
    println("Decision: " + creditPolicy.getDecision("Random Client"))
  }
}
