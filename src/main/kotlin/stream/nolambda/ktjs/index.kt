package stream.nolambda.ktjs

val items = listOf("Item", "Another Item", "More Item")

fun main(args: Array<String>) {
    println("Hello Javascript!")
    println("Test".extension())
    items.forEach {
        println(it)
    }
    ExpressHandler(8000)
}

fun String.extension() = "$this is from extension"

