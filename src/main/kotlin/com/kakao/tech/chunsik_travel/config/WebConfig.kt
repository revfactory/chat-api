package com.kakao.tech.chunsik_travel.config

import jakarta.servlet.MultipartConfigElement
import org.springframework.boot.web.servlet.MultipartConfigFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.util.unit.DataSize
import org.springframework.util.unit.DataUnit
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOriginPatterns("*")  // 모든 출처 허용
            .allowedMethods("*")  // 모든 HTTP 메소드 허용
            .allowedHeaders("*")  // 모든 헤더 허용
            .allowCredentials(true)
    }

    @Bean
    fun multipartConfigElement(): MultipartConfigElement {
        val factory = MultipartConfigFactory()
        factory.setMaxFileSize(DataSize.of(20, DataUnit.MEGABYTES))
        factory.setMaxRequestSize(DataSize.of(100, DataUnit.MEGABYTES))
        return factory.createMultipartConfig()
    }
}