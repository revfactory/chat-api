package com.kakao.tech.chunsik_travel.domain.place.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class PlaceResponse(
    @JsonProperty("documents") val documents: List<Place>,
    @JsonProperty("meta") val meta: Meta
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Place(
    @JsonProperty("address_name") val addressName: String,
    @JsonProperty("category_group_code") val categoryGroupCode: String,
    @JsonProperty("category_group_name") val categoryGroupName: String,
    @JsonProperty("category_name") val categoryName: String,
    @JsonProperty("distance") val distance: String?,
    @JsonProperty("id") val id: String,
    @JsonProperty("phone") val phone: String?,
    @JsonProperty("place_name") val placeName: String,
    @JsonProperty("place_url") val placeUrl: String,
    @JsonProperty("road_address_name") val roadAddressName: String?,
    @JsonProperty("x") val x: String,
    @JsonProperty("y") val y: String
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class Meta(
    @JsonProperty("is_end") val isEnd: Boolean,
    @JsonProperty("pageable_count") val pageableCount: Int,
    @JsonProperty("same_name") val sameName: SameName,
    @JsonProperty("total_count") val totalCount: Int
)

@JsonIgnoreProperties(ignoreUnknown = true)
data class SameName(
    @JsonProperty("keyword") val keyword: String?,
    @JsonProperty("region") val region: List<String>,
    @JsonProperty("selected_region") val selectedRegion: String
)