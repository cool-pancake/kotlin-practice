package practice8

fun isElemInList(list: List<Int>, elem: Int): Boolean {
    return elem in list
}

fun main() {
    println(isElemInList(listOf(1, 22, 10, 1), 22))
}