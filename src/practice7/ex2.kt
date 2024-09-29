package src.practice7

fun main() {
    print("Введите строку: ")
    var str = readlnOrNull() ?: "abcdefg"
    if (str == "")
        str = "abcdefg"

    println("Ваша строка: $str")

    println("Палиндром: ${str.reversed()}")
}