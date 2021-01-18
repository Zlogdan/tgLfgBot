package ru.zlo.tgbot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication(exclude = [ErrorMvcAutoConfiguration::class])
@EnableScheduling
open class TgBotApplication

fun main(args: Array<String>) {
    runApplication<TgBotApplication>(*args)
}


