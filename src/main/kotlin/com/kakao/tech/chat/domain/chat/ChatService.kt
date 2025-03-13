package com.kakao.tech.chat.domain.chat

import com.kakao.tech.chat.controller.dto.ChatResponse
import org.springframework.ai.chat.client.ChatClient
import org.springframework.ai.chat.messages.Message
import org.springframework.ai.openai.OpenAiChatModel
import org.springframework.ai.rag.Query
import org.springframework.ai.rag.preretrieval.query.expansion.MultiQueryExpander
import org.springframework.stereotype.Service

@Service
class ChatService(
    private val chatClient: ChatClient,
    private val chatModel: OpenAiChatModel
) {
    fun chat(messages: List<Message>): ChatResponse {
        val response = "Hello!"

        // TODO

        return ChatResponse("message", "assistant", response)
    }

    fun expand(query: String): List<Query> {
        val expander = MultiQueryExpander.builder()
            .chatClientBuilder(ChatClient.builder(chatModel))
            .numberOfQueries(3)
            .build()
        return expander.expand(Query(query))
    }
}