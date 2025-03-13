package com.kakao.tech.chat.controller

import com.kakao.tech.chat.controller.dto.ChatMessageRequest
import com.kakao.tech.chat.controller.dto.ChatResponse
import com.kakao.tech.chat.domain.chat.ChatService
import org.springframework.ai.rag.Query
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/chat")
class ChatController(
    private val chatService: ChatService
) {
    @PostMapping
    fun chat(@RequestBody messages: ChatMessageRequest): ChatResponse {
        return chatService.chat(messages.toChatMessages())
    }

    @GetMapping("expand")
    fun chat(@RequestParam query: String): List<Query> {
        return chatService.expand(query)
    }

}