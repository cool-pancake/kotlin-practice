package practice8

import kotlin.random.Random

fun listDifference(list: List<Int>): Int {
    return list.max() - list.min()
}

fun main() {
    val list = List(10) { Random.nextInt(0, 100) }
    println(list)
    println(sumList(list))
}
