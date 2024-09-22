package src.practice5

fun main() {
    val a = readlnOrNull() ?: "abc"

    var sum = 0
    for (i in 1..a.length) {
        sum += (a[i-1]).digitToInt()
    }

    println("sum = $sum")
}