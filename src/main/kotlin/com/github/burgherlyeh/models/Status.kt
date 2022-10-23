package com.github.burgherlyeh.models

import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.io.File

@Serializable
data class Status(val code: Int, val name: String, val description: String)

val statuses = Json
    .decodeFromString<List<Status>>(
        File("HttpStatusCodes.json").readText()
    )