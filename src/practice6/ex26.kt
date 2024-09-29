package src.practice6

import kotlin.random.Random

fun main() {
    val list = List(5) { Random.nextInt(-10, 10) }

    println(list)

    val sum = list.reduce { acc, i -> acc + i}

    println("Avg: " + sum / list.size)
}