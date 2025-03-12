package com.kakao.tech.chat.controller

import com.kakao.tech.chat.domain.chat.ChatService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux

@RestController
@RequestMapping("/api/chat")
class ChatController(
    private val chatService: ChatService
) {
    @GetMapping
    fun chat(@RequestParam("q") query: String): String {
        return chatService.chat(query)
    }

    @GetMapping("/stream")
    fun chatStream(@RequestParam("q") query: String): Flux<String> {
        return chatService.chatStream(query)
    }
}