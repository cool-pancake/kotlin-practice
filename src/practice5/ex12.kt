package src.practice5

fun main() {
    print("Начальное число: ")
    val begin = readlnOrNull()?.toIntOrNull() ?: 0
    print("Конечное число: ")
    val end = readlnOrNull()?.toIntOrNull() ?: 2
    print("Шаг: ")
    val step = readlnOrNull()?.toIntOrNull() ?: 1


    for (i in begin..end step step) {
        println(i)
    }
}