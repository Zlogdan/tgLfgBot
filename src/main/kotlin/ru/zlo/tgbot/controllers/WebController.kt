package ru.zlo.tgbot.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.zlo.tgbot.repository.PlayerRepository

@RestController
class WebController {

    @Autowired
    lateinit var repository: PlayerRepository

    @RequestMapping("/save")
    fun save(): String {
        return "Done"
    }

    @RequestMapping("/findall")
    fun findAll() = repository.findAll()

    @RequestMapping("/findbyid/{id}")
    fun findById(@PathVariable id: Long) = repository.findById(id)

    @RequestMapping("findByGenshinUid/{genshinUid}")
    fun findByGenshinUid(@PathVariable genshinUid: Long) = repository.findByGenshinUid(genshinUid)

    @RequestMapping("findByUserId/{userId}")
    fun findByUserId(@PathVariable userId: Long) = repository.findByUserId(userId)

}