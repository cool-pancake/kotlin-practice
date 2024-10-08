package practice8

fun listLastElem(list: List<Int>): Int {
    return list.last()
}

fun main() {
    println(listLastElem(listOf(1, 5, 10)))
}