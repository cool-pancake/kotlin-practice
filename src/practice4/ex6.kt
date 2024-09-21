package src.practice4

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(0, 1000000)

    print("Угадайте число от 0 до 1000000 и получите приз(наверное): ")

    val b = readln().toInt()

    println(when {
        a == b -> "Вы угадали, приза не будет."
        else -> "Не в этот раз"
    })

    println("Загаданное число $a")
}