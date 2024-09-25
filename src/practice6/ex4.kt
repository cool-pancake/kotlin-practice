package src.practice6

import kotlin.random.Random

fun main() {
    val rand = Random
    val lst = MutableList(5) { rand.nextInt(0, 100) }

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
