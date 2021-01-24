package ru.zlo.tgbot.handler

import com.pengrad.telegrambot.TelegramBot
import com.pengrad.telegrambot.model.Update
import reactor.core.publisher.Mono


@FunctionalInterface
interface BaseHandler {

    val action: String

    fun handle(bot: TelegramBot, update: Update)

}
