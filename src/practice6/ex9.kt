package practice6

import kotlin.random.Random

fun main() {
    val rand = Random
    val lst = MutableList(3) { rand.nextInt(0, 100) }

    val copy_lst = lst.toMutableList()

    println("original: ${lst}")
    println("copied: ${copy_lst}")

    copy_lst.add(5)
    println("add element to copy_lst")

    println("original: ${lst}")
    println("copied: ${copy_lst}")
}