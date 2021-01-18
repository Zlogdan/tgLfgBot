package ru.zlo.tgbot.config

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration
import ru.zlo.tgbot.services.BotConfigProps

@Configuration
@EnableConfigurationProperties(BotConfigProps::class)
open class CommonConfig
