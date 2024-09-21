package src.practice4

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(-100, 100)

    println(when {
        a >= 0 -> "Плюс"
        a < 0 -> "Минус"
        else -> "Неопределено"
    })
}