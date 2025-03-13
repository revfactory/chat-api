package com.kakao.tech.chat.controller.dto

import org.springframework.ai.chat.messages.AssistantMessage
import org.springframework.ai.chat.messages.Message
import org.springframework.ai.chat.messages.SystemMessage
import org.springframework.ai.chat.messages.UserMessage

data class ChatMessageRequest(
    val messages: List<ChatMessage>
) {
    fun toChatMessages(): List<Message> {
        return messages
            .map {
                when (it.role) {
                    "system" -> SystemMessage(it.content)
                    "user" -> UserMessage(it.content)
                    "assistant" -> AssistantMessage(it.content)
                    else -> throw IllegalArgumentException("Invalid role: ${it.role}")
                }
            }
    }
}

data class ChatMessage(
    val role: String,
    val content: String
)

data class ChatResponse(
    val type: String,
    val role: String,
    val content: String
)