package src.practice6

import kotlin.random.Random

fun linearSearch(list: List<Int>, elem: Int): Int? {
    for (i in list) {
        if (i == elem)
            return i
    }

    return null
}

fun main() {
    val list = listOf(4, 20, 11, 21, 3, 5)

    val elem = 21

    //println(list.find { it == elem })
    println(linearSearch(list, elem))
}