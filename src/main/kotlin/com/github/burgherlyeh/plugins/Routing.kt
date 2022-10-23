package com.github.burgherlyeh.plugins

import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.freemarker.*
import io.ktor.server.response.*
import com.github.burgherlyeh.models.statuses
import io.ktor.server.http.content.*
import io.ktor.server.util.*

fun Application.configureRouting() {
    routing {
        static("/static") {
            resources("static")
        }
        get("/") {
            call.respondRedirect("http-status-codes")
        }
        route("http-status-codes") {
            get {
//                call.respondText("asdf")
                call.respond(FreeMarkerContent("index.ftl", mapOf("statuses" to statuses)))
            }
            get("{code}") {
//                call.respondRedirect("/")
                val code = call.parameters.getOrFail<String>("code").toInt()

                val status = statuses.find { it.code == code }
                if (status == null) {
                    call.respondRedirect("/")
                }

                call.respond(
                    FreeMarkerContent(
                        "show.ftl",
                        mapOf("status" to status)
                    )
                )
            }
        }
    }
}