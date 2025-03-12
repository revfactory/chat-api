package com.kakao.tech.chat.controller

import com.kakao.tech.chat.domain.travel.TravelChatService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/api/chat")
class TravelChatController(
    private val travelChatService: TravelChatService
) {
    @GetMapping
    fun chat(@RequestParam("q") query: String): String {
        return travelChatService.chat(query)
    }

    @GetMapping("/stream")
    fun chatStream(@RequestParam("q") query: String): Flux<String> {
        return travelChatService.chatStream(query)
    }
}