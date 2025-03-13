package com.kakao.tech.chat.domain.chat

import com.kakao.tech.chat.controller.dto.ChatResponse
import org.springframework.ai.chat.client.ChatClient
import org.springframework.ai.chat.messages.Message
import org.springframework.stereotype.Service

@Service
class ChatService(
    private val chatClient: ChatClient
) {
    fun chat(messages: List<Message>): ChatResponse {
        val response = "Hello!"

        // TODO

        return ChatResponse("message", "assistant", response)
    }
}