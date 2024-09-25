package practice6

import kotlin.random.Random

fun main() {
    val rand = Random
    val lst = listOf(1, 2, 3, 4, 5)
    val lst1 = listOf(2, 3, 4, 6, 7)

    println(lst)
    println(lst1)

    println(lst.intersect(lst1))
}