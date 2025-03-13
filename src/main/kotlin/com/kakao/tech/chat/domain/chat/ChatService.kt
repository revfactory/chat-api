package com.kakao.tech.chat.domain.chat

import com.kakao.tech.chat.controller.dto.ChatResponse
import com.kakao.tech.chat.domain.chat.tools.DateTimeTools
import com.kakao.tech.chat.domain.chat.tools.PlaceTools
import org.springframework.ai.chat.client.ChatClient
import org.springframework.ai.chat.messages.Message
import org.springframework.stereotype.Service

@Service
class ChatService(
    private val chatClient: ChatClient,
    private val placeTools: PlaceTools
) {
    fun chat(messages: List<Message>): ChatResponse {
        val response = chatClient.prompt()
            .messages(messages)
            .tools(DateTimeTools(), placeTools)
            .call()
            .content()!!
        return ChatResponse("message", "assistant", response)
    }
}