package nolambda.firebasefunc.wrappers

@JsModule("express")
external class Express {
    fun get(route: String, callback: (req: Request, res: Response) -> Unit)
    fun listen(port: Int, callback: () -> Unit)
}

external class Request

external class Response {
    fun send(data: String)
    fun end(data: String)
}