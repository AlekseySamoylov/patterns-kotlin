package com.alekseysamoylov.patterns.domain.scoring


interface Scoring {
  fun perform(client: String): ScoringResult
}
