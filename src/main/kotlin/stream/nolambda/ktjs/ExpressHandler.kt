package stream.nolambda.ktjs

external fun require(module: String): dynamic

class ExpressHandler(val port: Int) {

    val app = require("express")()

    init {
        println("This is from a class")

        app.get("/") { req, res ->
            res.end("Hello from Express")
        }

        app.listen(port) {
            println("Listening in port $port")
        }
    }
}