package practice2.logical

fun main() {
    val a = true
    val b = false
    val c = false

    println("A: $a, B: $b, C: $c")

    println("not A and B: ${!a or b}, A or not B: ${a or !b}, A and B or C: ${a and b or c}")
}