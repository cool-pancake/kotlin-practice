package practice8

import kotlin.random.Random

fun listAdd(list: List<Int>, list1: List<Int>): List<Int> {
    return list + list1
}

fun main() {
    val list = List(5) { Random.nextInt(0, 100) }
    println(list)
    val list1 = List(5) { Random.nextInt(0, 100) }
    println(list1)
    println("add lists: ${listAdd(list, list1)}")
}
