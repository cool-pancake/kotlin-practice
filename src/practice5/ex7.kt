package src.practice5

fun main() {
    print("Число: ")
    val n = readlnOrNull()?.toIntOrNull() ?: 5

    var first = 0
    var second = 1

    var temp: Int

    for (i in 2..n) {
        temp = first
        first = second
        second = temp + second
    }

    println(first)
}