package src.practice4

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(1, 7)
    println("a = $a")

    println(when(a) {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        7 -> "Воскресение"
        else -> "Неверный номер"
    })
}