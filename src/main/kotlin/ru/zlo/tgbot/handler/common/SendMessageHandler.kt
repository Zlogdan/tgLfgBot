package ru.zlo.tgbot.handler.common

import com.pengrad.telegrambot.TelegramBot
import com.pengrad.telegrambot.model.Update
import com.pengrad.telegrambot.request.SendMessage
import org.springframework.stereotype.Service
import ru.zlo.tgbot.handler.BaseHandler

@Service
class SendMessageHandler():BaseHandler {
    override fun handle(bot: TelegramBot, update: Update){
        val chatId = update.message().chat().id()
        val messageTo = update.message().text().substring(6).toBigInteger()
        bot.execute(SendMessage(messageTo, "SendMessageHandler:$chatId"))
    }

    override val action: String
        get() = "MESSAGE"
}