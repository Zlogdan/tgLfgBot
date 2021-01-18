package ru.zlo.tgbot.services

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

@ConfigurationProperties(prefix = "bot")
@ConstructorBinding
data class BotConfigProps(
        val admin: Number,
        val token: String
)