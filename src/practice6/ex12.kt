package practice6

import kotlin.random.Random

fun swap(lst: MutableList<Int>, from: Int, to: Int) {
    lst[from] = lst[to]
}

fun main() {
    val rand = Random
    val lst = MutableList(3) { rand.nextInt(0, 100) }

    swap(lst, 1, 2)
}