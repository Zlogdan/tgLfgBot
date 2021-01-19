package ru.zlo.tgbot.models

data class PartyEntity(
    val id: Int,
    val leaderUserId: Int,
    val maxMemberCount: Int,
    val message: String
)
