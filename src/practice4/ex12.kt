package src.practice4

fun main() {
    print("Страна: ")

    val a = readlnOrNull()?.lowercase() ?: "abc"

    print("Национальность: ")
    println(when {
        a == "сша" -> "Американец"
        a == "россия" -> "Русский"
        a == "япония" -> "Японец"
        a == "казахстан" -> "Казах"
        a == "беларусь" -> "Беларус"
        a == "германия" -> "Немец"
        else -> "Неизвестно"
    })
}