package src.practice5

import kotlin.random.Random

fun main() {
    val rand = Random.nextInt(1, 100)
    print("Угадайте число: ")
    val a = readlnOrNull()?.toIntOrNull() ?: 0

    println(when {
        a == rand -> "Поздравляю, вы угадали."
        else -> "Не повезло, загаданное число $rand"
    })
}