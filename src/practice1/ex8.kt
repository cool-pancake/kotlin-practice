package practice1

import kotlin.random.Random

fun main() {
    val randomizer = Random
    println(randomizer.nextInt(100).toString() + "  " + randomizer.nextInt(100).toString() + "  " + randomizer.nextInt(100).toString())
}