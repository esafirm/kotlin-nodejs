package nolambda.firebasefunc

import nolambda.firebasefunc.wrappers.Express

class ExpressHandler(port: Int) {
    init {
        val app = Express()
        app.get("/") { _, res ->
            res.end("Hello from Testing")
        }
        app.listen(port) {
            println("Express is listening on port $port")
        }
    }
}