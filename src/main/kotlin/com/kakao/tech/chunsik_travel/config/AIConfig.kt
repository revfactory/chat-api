package com.kakao.tech.chunsik_travel.config

import org.springframework.ai.chat.client.ChatClient
import org.springframework.ai.chat.prompt.ChatOptions
import org.springframework.ai.openai.OpenAiChatModel
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AIConfig {
    @Bean
    fun openAIChatClient(chatModel: OpenAiChatModel): ChatClient {
        return ChatClient.builder(chatModel)
            .defaultOptions(
                ChatOptions.builder()
                    .model("gpt-4o")
                    .temperature(0.0)
                    .build()
            )

            .build()
    }
}