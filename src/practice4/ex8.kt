package src.practice4

fun main() {
    print("Блюдо: ")
    val a = readlnOrNull()?.lowercase() ?: "доширак"

    println(when {
        a == "макароны" || a == "пельмени" -> "10 минут"
        a == "доширак" -> "5 минут"
        a == "хлеб с колбасой" -> "2 минуты (можно быстрее)"
        else -> "Неизвестно"
    })
}