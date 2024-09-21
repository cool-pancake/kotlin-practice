package src.practice3

import kotlin.random.Random

fun main()
{
    val num = Random.nextInt(1000, 9999)

    val a = Random.nextInt(0, 100)

    val first = num / 1000
    val second = num / 100 % 10
    val third = num / 100 % 10
    val fourth = num / 10 % 10

    println("num = $num, a = $a")

    println(when {
        first + second > third + fourth -> "Сумма двух первых цифр больше суммы двух последних"
        first + second < third + fourth -> "Сумма двух первых цифр меньше суммы двух последних"
        else -> "Сумма двух первых цифр равна сумме двух последних"
    })

    println(when {
        (first + second + third + fourth) % 3 == 0 -> "Сумма цифр кратна 3"
        else -> "Сумма цифр не кратна 3"
    })

    println(when {
        (first + second + third + fourth) % 4 == 0 -> "Сумма цифр кратна 4"
        else -> "Сумма цифр не кратна 4"
    })

    println(when {
        (first + second + third + fourth) % a == 0 -> "Сумма цифр кратна числу a"
        else -> "Сумма цифр не кратна числу a"
    })
}