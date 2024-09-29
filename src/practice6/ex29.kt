package src.practice6

import kotlin.random.Random

fun main() {
    val list = List(Random.nextInt(2, 6)) { Random.nextInt(-12, 12) }

    println(list)

    println(when {
        list.size % 2 != 0 -> list[list.size / 2]
        else -> (list[list.size / 2] + list[list.size / 2 - 1]) / 2.0
    })
}