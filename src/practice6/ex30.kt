package src.practice6

import kotlin.random.Random

fun main() {
    val list = List(100) { Random.nextInt(0, 20) }

    val lists = list.chunked(10)

    for (sublist in lists) {
        println(sublist)
    }
}