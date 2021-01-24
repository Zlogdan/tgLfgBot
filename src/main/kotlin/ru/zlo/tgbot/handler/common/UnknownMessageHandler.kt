package ru.zlo.tgbot.handler.common

import com.pengrad.telegrambot.TelegramBot
import com.pengrad.telegrambot.model.Update
import com.pengrad.telegrambot.request.AnswerCallbackQuery
import com.pengrad.telegrambot.request.SendMessage
import org.springframework.context.MessageSource
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import ru.zlo.tgbot.handler.BaseHandler

@Service
class UnknownMessageHandler() : BaseHandler {

    override fun handle(bot: TelegramBot, update: Update) {
        val chatId = update.message().chat().id()
        bot.execute(SendMessage(chatId, "UnknownMessageHandler:$chatId"))
    }

    override val action: String
        get() = "UNKNOWN_MESSAGE"

}
