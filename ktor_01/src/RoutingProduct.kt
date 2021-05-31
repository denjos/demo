package pe.denjos

import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get

fun Route.product(){
    get("/product"){
        call.respondText("get product")
    }
}