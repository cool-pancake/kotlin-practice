package src.practice5

fun main() {
    val a = readln()

    var sum: Int = 0;
    for (i in 1..a.length) {
        sum += (a[i-1]).digitToInt()
    }

    println("sum = $sum")
}