package src.practice3

import kotlin.random.Random

fun main()
{
    val a = Random.nextInt(10, 99)

    val first: Int = a / 10
    val second: Int = a % 10

    println("a = $a")

    println(when {
        first > second -> "Первая цифра больше"
        first < second -> "Вторая цифра больше"
        else -> "Обе цифры одинаковые"
    })
}