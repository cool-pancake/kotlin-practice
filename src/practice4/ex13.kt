package src.practice4

fun main() {
    print("Код: ")
    val a = readlnOrNull()?.toIntOrNull() ?: 200

    println(when {
        a == 200 -> "OK"
        a == 404 -> "Not found"
        a == 202 -> "Accepted"
        a == 302 -> "Found"
        a == 400 -> "Bad request"
        a == 500 -> "Internal server error"
        a == 502 -> "Bad gateway"
        else -> "Unknown"
    })
}