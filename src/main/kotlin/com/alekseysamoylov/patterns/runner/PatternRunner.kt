package com.alekseysamoylov.patterns.runner

import com.alekseysamoylov.patterns.service.HelloService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class PatternRunner(private val helloService: HelloService) : CommandLineRunner {
  override fun run(vararg args: String?) {
    helloService.hello()
  }
}
