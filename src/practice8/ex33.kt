package practice8

fun findByIndex(list: List<Int>, indx: Int): Int {
    return list[indx]
}

fun main() {
    println(findByIndex(listOf(1, 3, 10), 2))
}