package nolambda.firebasefunc

import com.firebase.wrappers.admin.Admin
import com.firebase.wrappers.admin.FirebaseAppOptions
import com.firebase.wrappers.functions.Functions
import nolambda.firebasefunc.wrappers.Express

external val exports : dynamic

fun main() {
    val app = Express()
    val port = 8000

    app.get("/") { _, res ->
        res.end("Hello from Testing")
    }
    app.listen(port) {
        println("Express is listening on port $port")
    }

    Admin.initializeApp(Functions.config().firebase as FirebaseAppOptions)

    exports.v1 = Functions.https.onRequest(app)
}


