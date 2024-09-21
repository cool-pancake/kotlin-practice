package src.practice5

fun main() {
    print("Число: ")
    val n = readln().toInt()

    var first = 0
    var second = 1

    var temp: Int
    var fib: Int = 0

    for (i in 2..n) {
        temp = first
        first = second
        second = temp + second
    }

    println(first)
}