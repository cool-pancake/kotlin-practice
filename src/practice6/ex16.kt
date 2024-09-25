package practice6

import kotlin.random.Random

fun main() {
    val rand = Random
    val lst = List(5) { rand.nextInt(1, 100) }
    val lst1 = List(5) { rand.nextInt(1, 100) }

    println("First list: ${lst}")
    println("Second list: ${lst1}")

    val new_lst = lst + lst1

    println("New array: ${new_lst}")
}