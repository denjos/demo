package pe.denjos

import io.ktor.application.call
import io.ktor.request.*
import io.ktor.response.respond
import io.ktor.routing.*

fun Route.user() {
    get("/user"){
        call.respond(User("oscar",27))
    }
    post("/user") {
        val user=call.receive<User>()
        call.respond(user)
    }
}