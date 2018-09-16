package com.alekseysamoylov.patterns.service

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service


@Service
class HelloService {
  private val logger = LoggerFactory.getLogger(HelloService::class.java)

  fun hello() {
    logger.info("HelloWorld")
  }
}
