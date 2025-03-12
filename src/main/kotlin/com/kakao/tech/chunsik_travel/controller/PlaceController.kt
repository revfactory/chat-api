package com.kakao.tech.chunsik_travel.controller

import com.kakao.tech.chunsik_travel.domain.place.PlaceService
import com.kakao.tech.chunsik_travel.domain.place.dto.PlaceResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/place")
class PlaceController(
    private val placeService: PlaceService,
) {
    @GetMapping("/search")
    fun search(@RequestParam("q") query: String): Mono<PlaceResponse> {
        return placeService.searchPlace(query)
    }
}