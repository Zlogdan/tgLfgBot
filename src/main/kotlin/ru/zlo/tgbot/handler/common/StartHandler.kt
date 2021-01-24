package ru.zlo.tgbot.handler.common

import com.pengrad.telegrambot.TelegramBot
import com.pengrad.telegrambot.model.Update
import com.pengrad.telegrambot.request.SendMessage
import org.springframework.context.MessageSource
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import ru.zlo.tgbot.handler.BaseHandler
import java.util.*

@Service
class StartHandler() : BaseHandler {
    override fun handle(bot: TelegramBot, update: Update){
        val chatId = update.message().chat().id()
        bot.execute(SendMessage(chatId, "StartHandler:$chatId"))
    }

    override val action: String
        get() = "START"
}