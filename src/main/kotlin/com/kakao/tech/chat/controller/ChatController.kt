package com.kakao.tech.chat.controller

import com.kakao.tech.chat.controller.dto.ChatMessageRequest
import com.kakao.tech.chat.controller.dto.ChatResponse
import com.kakao.tech.chat.domain.chat.ChatService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/chat")
class ChatController(
    private val chatService: ChatService
) {
    @PostMapping
    fun chat(@RequestBody messages: ChatMessageRequest): ChatResponse {
        return chatService.chat(messages.toChatMessages())
    }

}