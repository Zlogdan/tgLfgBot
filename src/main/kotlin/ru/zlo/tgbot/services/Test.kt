package ru.zlo.tgbot.services

import okhttp3.OkHttpClient
import okhttp3.Request
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class Test {

    @EventListener(ApplicationReadyEvent::class)
    fun doSomethingAfterStartup() {
//        val response : Response = khttp.get(url="https://mangalib.me/manga-rss/i-alone-level-up",
//            headers = mapOf("header1" to "1", "header2" to "2"),
//            cookies = mapOf("cookie1" to "1", "cookie2" to "2"))
//        val obj : JSONObject = response.jsonObject


        val client = OkHttpClient()

        val request = Request.Builder()
            .url("https://mangalib.me/manga-rss/i-alone-level-up")
            .get()
            .addHeader("cookie", "__cfduid=daa3ac8e8e2a4c6fda4aef7076ad7f2471610610856; XSRF-TOKEN=eyJpdiI6ImV2Q2d0SU5zcEMwb001VjBITDdlZlE9PSIsInZhbHVlIjoicXE5cUdkS0puQ1doaUhpVWUwV2VaeHlUUkpvOWZmU1pydjlyUDRhdzhtYVcyV2JSalp2UXJqVG84S2pRSFVsaiIsIm1hYyI6IjRmNTM0ZmE0MTVmNzFlNjdlMTczMDAzMjk2OTFkOGNlMjQwZGE0ZWViODk3NTkxMDA1NTIzNjVhOGJkNjEwMzMifQ%253D%253D; mangalib_session=eyJpdiI6Im5IbHhtRDFmcXNOS0FnRjd3UEJ5UWc9PSIsInZhbHVlIjoiTkptZzZMdDJnSitTT04rcjIzNnhsZlREN0lwTk45MmZkd2Vnd0ZmUmNISUE0c3FOK1VvMGFWWjhiQnh4NnprLyIsIm1hYyI6IjVhOTAwNGY4OTU5NDBmNTc5OTkyZWJhNDQ2ZmNkYzEzY2E1YzIyZjE3MTI1NDZmNjQwNmY1ZjAwMTEwMDA1YWUifQ%253D%253D")
            .build()

        val response = client.newCall(request).execute()
        val body = response.body().toString()
        print(body)

    }
}
