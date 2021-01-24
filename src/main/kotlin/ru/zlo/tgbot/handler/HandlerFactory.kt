package ru.zlo.tgbot.handler

import org.springframework.beans.factory.annotation.Lookup
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Service
import ru.zlo.tgbot.handler.common.SendMessageHandler
import ru.zlo.tgbot.handler.common.StartHandler
import ru.zlo.tgbot.handler.common.UnknownMessageHandler
import kotlin.reflect.KClass

@Service
abstract class HandlerFactory(
    private val applicationContext: ApplicationContext
) {
    @get:Lookup
    abstract val startHandler: StartHandler

    @get:Lookup
    abstract val unknownMessageHandler: UnknownMessageHandler

    @get:Lookup
    abstract val sendMessageHandler: SendMessageHandler

    fun newHandler(kClass: KClass<out BaseHandler>): BaseHandler = applicationContext.getBean(kClass.java)
}
