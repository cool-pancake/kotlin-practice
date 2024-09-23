package src.practice3

import kotlin.random.Random

fun main()
{
    val n: Int = Random.nextInt(0, 1000)
    val m: Int = Random.nextInt(0, 1000)

    println("m = $m, n = $n")

    println(when {
        m % n == 0 -> "${m / n}"
        else -> "m на n нацело не делится"
    })
}