package ru.zlo.tgbot.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.zlo.tgbot.models.PlayerEntity

@Repository
interface PlayerRepository: CrudRepository<PlayerEntity,Long> {
    fun findByUserId(userId: Long): PlayerEntity
    fun findByGenshinUid(genshinUid: Long): PlayerEntity
}