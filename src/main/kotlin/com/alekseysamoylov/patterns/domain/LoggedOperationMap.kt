package com.alekseysamoylov.patterns.domain

import org.slf4j.LoggerFactory

/**
 * Decorator
 */
class LoggedOperationMap<K, V>(private val map: MutableMap<K, V> = mutableMapOf()) : MutableMap<K, V> by map {

  val logger = LoggerFactory.getLogger("common-logger")

  override fun put(key: K, value: V): V? {
    key?.let { logger.info("log $it") }
    return map.put(key, value).apply {
      this?.let { logger.info("changed value $it") }
    }
  }
}
