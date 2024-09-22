package src.practice5

fun main() {
    print("Введите число: ")
    val a = readlnOrNull()?.toIntOrNull() ?: 10

    println(a.toString(2))
}