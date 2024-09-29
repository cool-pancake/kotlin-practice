package src.practice6

import kotlin.random.Random

fun main() {
    val lst = List(10) { Random.nextInt(0, 100) }

    println(lst)

    println(lst.sorted()[lst.size-2])
}