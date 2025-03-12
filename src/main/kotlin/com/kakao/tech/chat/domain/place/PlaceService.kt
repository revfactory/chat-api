package com.kakao.tech.chat.domain.place

import com.kakao.tech.chat.domain.place.dto.PlaceResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpHeaders
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.util.UriComponentsBuilder
import reactor.core.publisher.Mono

@Service
class PlaceService(
    @Value("\${place.apiKey}")
    private val apiKey: String,
    @Value("\${place.url}")
    private val url: String,
    private val webClient: WebClient
) {
    fun searchPlace(query: String): Mono<PlaceResponse> = webClient.get()
        .uri(UriComponentsBuilder
            .fromUriString(url)
            .queryParam("query", query)
            .build()
            .toUriString())
        .header(HttpHeaders.AUTHORIZATION, "KakaoAK $apiKey")
        .retrieve()
        .bodyToMono(PlaceResponse::class.java)
}