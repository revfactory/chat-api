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
        val response = chatClient.prompt()
            .system("오늘 날짜는 2025년 4월 24일입니다.")
            .messages(messages)
            .call()
            .content()!!

        return ChatResponse("message", "assistant", response)
    }
}