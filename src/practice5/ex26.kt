package src.practice5

fun main() {
    print("Введите число: ")
    val n = readlnOrNull()?.toIntOrNull() ?: 10
    var odd = 0
    var even = 0

    for (i in 1..n) {
        when {
            i % 2 == 0 -> odd += i
            else -> even += i
        }
    }
    println("Сумма четных: $odd")
    println("Сумма не четных: $even")
}