package src.practice5

fun main() {
    print("Число: ")
    val n = readln().toInt()

    var sum: Int = 0
    for (i in 1..n) {
        sum += i
    }
    println(sum)
}