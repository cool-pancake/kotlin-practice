package src.practice5

fun main() {
    print("Число: ")
    val n = readln().toInt()

    var fact: Int = 1
    for (i in 1..n) {
        fact *= i
    }
    println(fact)
}