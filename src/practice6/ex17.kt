package practice6

import kotlin.random.Random

fun main() {
    val rand = Random
    val lst = List(4) { rand.nextInt(1, 20) }

    println(lst)
    println("Sum = ${lst.sum()}")

    println("Mul = ${lst.reduce {acc, i -> acc * i}}")
}