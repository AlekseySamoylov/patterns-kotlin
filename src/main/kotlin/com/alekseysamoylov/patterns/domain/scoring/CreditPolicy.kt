package com.alekseysamoylov.patterns.domain.scoring


abstract class CreditPolicy(private val scoring: Scoring) {

  open fun getDecision(client: String): Boolean {
    val scoringResult = scoring.perform(client)
    return scoringResult >= DEFAULT_SCORING_RESULT_TO_APPROVE
  }
}
