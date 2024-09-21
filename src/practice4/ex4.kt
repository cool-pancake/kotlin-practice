package src.practice4

import kotlin.random.Random

fun main() {
    var a = Random.nextInt(0, 23)

    println("a = $a")

    println(when {
        a >= 6 && a < 12 -> "Утро"
        a >= 12 && a < 18 -> "День"
        a >= 18 && a <= 23 -> "Вечер"
        else -> "Ночь"
    })
}