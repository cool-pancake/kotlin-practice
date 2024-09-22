package src.practice5

fun main() {
    print("Введите число: ")
    val n = readlnOrNull()?.toIntOrNull() ?: 10
    var sum = 0.0f
    for (i in 1..n) {
        sum += 1.0f/i
    }

    println("Сумма ряда: $sum")
}