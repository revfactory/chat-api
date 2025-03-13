package com.kakao.tech.chat.domain.chat.tools

import org.springframework.ai.tool.annotation.Tool
import org.springframework.context.i18n.LocaleContextHolder
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class DateTimeTools {
    @Tool(description = "Get the current date and time in the user's timezone")
    fun getCurrentDateTime(): String {
        println("Tool Calling... getCurrentDateTime")
        return LocalDateTime.now().atZone(LocaleContextHolder.getTimeZone().toZoneId()).toString()
    }

    @Tool(description = "Set a user alarm for the given time, provided in ISO-8601 format")
    fun setAlarm(time: String) {
        println("Tool Calling... setAlarm for $time")
        val alarmTime = LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME)
        println("Alarm set for $alarmTime")
    }
}