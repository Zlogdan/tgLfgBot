package ru.zlo.tgbot.services

import com.pengrad.telegrambot.TelegramBot
import com.pengrad.telegrambot.UpdatesListener
import com.pengrad.telegrambot.model.Update
import com.pengrad.telegrambot.request.SendMessage
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class Bot (private val props: BotConfigProps): TelegramBot(props.token){

    @PostConstruct
    fun init() {
        this.execute(SendMessage (props.admin, "Hello! YOBA!\nYa Startanul!!!"))
        this.setUpdatesListener { it ->
            it.forEach {
                try {
                    onUpdateReceived(it)
                } catch (e: Exception) {
                }
            }
            UpdatesListener.CONFIRMED_UPDATES_ALL
        }
    }

    private fun onUpdateReceived(update: Update) {
        val id = update.message().chat().id()
        val chatId = update.message().chat().id()

        if (id == 503901317L){
            var response = this.execute(SendMessage (chatId, "Hello! LEHA"))
        }
        else {
            var response = this.execute(SendMessage(chatId, "Hello!"))
        }
    }


}