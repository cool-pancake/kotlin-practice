package practice6

import kotlin.random.Random

fun main() {
    val rand = Random
    val lst = List(10) { rand.nextInt(1, 100) }

    println(lst)
    println("Sum = ${lst.sum()}")

    var mul = 1
    for (elem in lst) {
       mul *= elem
    }

    println("Mul = ${mul}")
}