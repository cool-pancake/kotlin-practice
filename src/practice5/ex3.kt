package src.practice5

fun main() {
    print("Число: ")
    val n = readlnOrNull()?.toIntOrNull() ?: 5

    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    println(sum)
}