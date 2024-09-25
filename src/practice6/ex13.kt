package practice6

import kotlin.random.Random

fun main() {
    val rand = Random
    val lst = List(20) { rand.nextInt(1, 100) }

    println(lst)
}