package practice8

fun listFromTo(from: Int, to: Int): List<Int> {
    return (from..to).toList()
}

fun main() {
    println(listFromTo(1, 10))
}