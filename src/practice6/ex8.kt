package practice6

import kotlin.random.Random

fun main() {
    val rand = Random
    val lst = (1..20).toList()

    println(lst.find { it == 5 })
}