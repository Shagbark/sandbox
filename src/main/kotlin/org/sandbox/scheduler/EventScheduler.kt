package org.sandbox.scheduler

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.util.concurrent.TimeUnit.SECONDS

@Component
class EventScheduler(
    private val log: Logger = LoggerFactory.getLogger(EventScheduler::class.java)
) {

    @Scheduled(fixedRate = 5L, timeUnit = SECONDS)
    fun logEvent() {
        log.info("Submitted event at {}", LocalDateTime.now())
    }

}