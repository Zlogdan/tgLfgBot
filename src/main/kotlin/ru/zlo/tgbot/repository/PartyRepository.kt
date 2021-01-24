package ru.zlo.tgbot.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import ru.zlo.tgbot.models.PartyEntity

@Repository
interface PartyRepository:CrudRepository<PartyEntity,Long> {
    fun findByLeaderUserId(leaderUserId: Long)
}