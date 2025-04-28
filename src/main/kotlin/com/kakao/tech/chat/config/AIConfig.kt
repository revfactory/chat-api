package com.kakao.tech.chat.config

import io.modelcontextprotocol.client.McpSyncClient
import org.springframework.ai.chat.client.ChatClient
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor
import org.springframework.ai.chat.memory.InMemoryChatMemory
import org.springframework.ai.chat.model.ChatModel
import org.springframework.ai.mcp.SyncMcpToolCallbackProvider
import org.springframework.ai.openai.OpenAiChatModel
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AIConfig {

    @Bean
    fun chatClient(chatModel: ChatModel, mcpSyncClients: List<McpSyncClient>): ChatClient {
        return ChatClient
            .builder(chatModel)
            .defaultTools(SyncMcpToolCallbackProvider(mcpSyncClients))
            .defaultAdvisors(MessageChatMemoryAdvisor(InMemoryChatMemory()))
            .build();
    }
}