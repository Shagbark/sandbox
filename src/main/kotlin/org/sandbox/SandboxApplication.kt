package org.sandbox

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@EnableScheduling
@SpringBootApplication
class SandboxApplication

fun main(args: Array<String>) {
    runApplication<SandboxApplication>(*args)
}