package src.practice5

fun main() {
    print("Число: ")
    val n = readlnOrNull()?.toIntOrNull() ?: 5

    var fact = 1
    for (i in 1..n) {
        fact *= i
    }
    println(fact)
}