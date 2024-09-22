package src.practice5

import kotlin.random.Random

fun main() {
    val rand = Random
    val lst: MutableList<Int> = (1..10).map { rand.nextInt(10, 99) }.toMutableList()

    println(lst)

    // bubble sort
    for (i in 1..lst.size) {
        for (j in 1..lst.size - i) {
            if (lst[j - 1] > lst[j]) {
                val temp = lst[j]
                lst[j] = lst[j - 1]
                lst[j - 1] = temp
            }
        }
    }

    println(lst)
}