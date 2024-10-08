package practice8

fun reverseList(list: List<Int>): List<Int> {
    return list.reversed()
}

fun main() {
    println(reverseList(listOf(1, 2, 4, 11)))
}
