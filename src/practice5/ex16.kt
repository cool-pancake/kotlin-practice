package src.practice5

fun main() {
    print("Введите число: ")
    val a = readlnOrNull()?.toIntOrNull() ?: 2
    var sum = 0

    for (i in 1..a) {
        sum += i * i
    }
    println("sum = $sum")
}