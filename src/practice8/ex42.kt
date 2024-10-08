package practice8

fun findIndexOfElem(list: List<Int>, elem: Int): Int {
    return list.indexOf(elem)
}

fun main() {
    println(findIndexOfElem(listOf(1, 5, 20, 1, 20, 2), 20))
}