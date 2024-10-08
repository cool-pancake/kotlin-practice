package practice8

import kotlin.random.Random

fun sumList(list: List<Int>): Int {
    return list.sum()
}

fun main() {
    val list = List(10) { Random.nextInt(0, 100) }
    println(list)
    println(sumList(list))
}