package com.kakao.tech.chat.domain.chat

import org.springframework.ai.chat.client.ChatClient
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class ChatService(
    private val chatClient: ChatClient
) {
    fun chat(query: String): String {
        return "hello, $query!"
    }

    fun chatStream(query: String): Flux<String> {
        return Flux.just("hello, $query!")
    }
}