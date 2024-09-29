package src.practice6

import kotlin.random.Random

fun main() {
    val lst = List(5) { Random.nextInt(0, 100) }
    val lst1 = List(5) { Random.nextInt(0, 100) }

    println(lst)
    println(lst1)

    println(lst + lst1)
}