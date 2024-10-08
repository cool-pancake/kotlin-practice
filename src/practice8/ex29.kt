package practice8

fun minMax(list: List<Int>) {
    println("Max: ${list.max()}")
    println("Min: ${list.min()}")
}

fun main() {
    minMax(listOf(1, 2, -3, 10))
}