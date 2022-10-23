package com.github.burgherlyeh

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.github.burgherlyeh.plugins.*
import io.ktor.server.application.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.io.File

fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module() {
    configureTemplating()
    configureRouting()
    configureSerialization()
}
