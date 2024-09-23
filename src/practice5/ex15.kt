package src.practice5

fun main() {
    println("Введите строку: ")
    val a = readlnOrNull() ?: "abc"
    println(when {
        a == a.reversed() -> "Палиндром"
        else -> "Не палиндром"
    })
}