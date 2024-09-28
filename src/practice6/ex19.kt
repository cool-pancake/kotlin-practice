package practice6

import kotlin.random.Random

fun main() {
    val rand = Random
    val lst = List(4) { rand.nextInt(1, 20) }
    val lst1 = List(4) { rand.nextInt(1, 20) }

    println(lst)
    println(lst1)

    println((lst + lst1).sorted())
}