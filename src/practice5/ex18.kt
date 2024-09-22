package src.practice5

fun main() {
    print("Введите число: ")
    val a = readlnOrNull()?.toIntOrNull() ?: 3

    for (i in 1..a) {
        println("#".repeat(i))
    }
}