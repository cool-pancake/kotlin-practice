package practice6

import kotlin.random.Random

fun main() {
    val rand = Random
    val lst = MutableList(5) { rand.nextInt(0, 100) }

    println(lst.reversed())
}