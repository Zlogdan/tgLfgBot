package ru.zlo.tgbot.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class PlayerEntity(
    val userId: Long,
    val genshinUid: Long,
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1
)
