package pe.denjos

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*

import io.ktor.routing.routing
import io.ktor.serialization.*
import kotlinx.serialization.json.Json

fun Application.configureRouting(){
    install(ContentNegotiation) {
        //gson{}
        json()
    }
    routing {
        user()
        product()
    }
}

