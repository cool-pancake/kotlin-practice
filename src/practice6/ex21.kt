package practice6

import kotlin.random.Random

fun delElem(lst: MutableList<Int>, elem: Int) {
    lst.remove(elem)
}

fun main() {
    val lst = MutableList(10) { Random.nextInt(0, 20) }

    lst[0] = 22

    println(lst)

    delElem(lst, 22)

    println(lst)
}