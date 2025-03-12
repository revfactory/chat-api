package com.kakao.tech.chunsik_travel.controller

import com.kakao.tech.chunsik_travel.domain.travel.TravelChatService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/api/chat")
class TravelChatController(
    private val travelChatService: TravelChatService
) {
    @PostMapping
    fun chat(@RequestParam("q") query: String): String {
        return travelChatService.chat(query)
    }

    @PostMapping("/stream")
    fun chatStream(@RequestParam("q") query: String): Flux<String> {
        return travelChatService.chatStream(query)
    }
}