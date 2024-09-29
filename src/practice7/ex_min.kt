package src.practice7

import kotlin.random.Random

fun main() {
    val list = List(10) {Random.nextInt(0, 100)}

    println(list)
    println("Min: ${list.min()}")
}