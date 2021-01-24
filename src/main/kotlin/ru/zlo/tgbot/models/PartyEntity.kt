package ru.zlo.tgbot.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class PartyEntity(
    val leaderUserId: Long,
    val maxMemberCount: Int,
    val message: String,
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1
)
