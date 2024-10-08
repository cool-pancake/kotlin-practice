package practice8

fun maxInList(list: List<Int>): Int {
    return list.max()
}

fun main() {
    println(maxInList(listOf(1, 2, 1, 5)))
}