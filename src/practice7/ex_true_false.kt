package src.practice7

fun main() {
    println("Enter first number: ")
    val first = readlnOrNull()?.toIntOrNull() ?: 10
    println("Enter second number: ")
    val second = readlnOrNull()?.toIntOrNull() ?: 5

    println(when {
        first == second -> true
        else -> false
    })

}