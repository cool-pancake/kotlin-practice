package src.practice4

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(1, 5)

    println("a = $a")

    println(when {
        a == 5 -> "Отлично"
        a == 4 -> "Хорошо"
        a == 3 -> "Удовлетворительно"
        a == 2 -> "Неудовлетворительно"
        else -> "Плохо"
    })
}