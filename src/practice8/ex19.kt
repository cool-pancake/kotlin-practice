package practice8

fun listSum(list: List<Int>): Int {
    return list.sum()
}

fun main() {
    println(listSum(listOf(1, 2, 3, 5)))
}