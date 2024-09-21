package src.practice5

fun main() {
    print("Число: ")
    val n = readln().toInt()

    var count: Int = 0
    for (i in 1..n) {
        if (n % i == 0) {
            count++
        }
    }
    if (count == 2)
        println("$n простое")
    else
        println("$n не простое")
}