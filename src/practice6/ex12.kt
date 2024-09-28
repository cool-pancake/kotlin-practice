package practice6

import kotlin.random.Random

fun swap(lst: MutableList<Int>, from: Int, to: Int) {
    val temp = lst[from]
    lst[from] = lst[to]
    lst[to] = temp
}

fun main() {
    val rand = Random
    val lst = MutableList(3) { rand.nextInt(0, 100) }

    println(lst)

    swap(lst, 1, 2)

    println(lst)
}