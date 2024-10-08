package practice8

fun sortList(list: List<Int>): List<Int> {
    return list.sorted()
}

fun main() {
    val sortedList = sortList(listOf(5, 2, 3, 1, 4))
    println(sortedList)
}