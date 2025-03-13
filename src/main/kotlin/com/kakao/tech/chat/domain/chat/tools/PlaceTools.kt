package com.kakao.tech.chat.domain.chat.tools

import com.kakao.tech.chat.domain.place.PlaceService
import com.kakao.tech.chat.domain.place.dto.PlaceResponse
import org.springframework.ai.tool.annotation.Tool
import org.springframework.stereotype.Component

@Component
class PlaceTools(
    private val placeService: PlaceService
) {
    @Tool(description = "Search Place Information by the given keyword")
    fun searchPlace(keyword: String): PlaceResponse {
        println("Tool Calling... searchPlace for $keyword")
        return placeService.searchPlace(keyword).block()!!
    }
}