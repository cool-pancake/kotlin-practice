package src.practice3

import kotlin.random.Random

fun main()
{
    val a = Random.nextInt(0, 100)
    val b = Random.nextInt(0, 100)

    println("a = $a, b = $b")

    println(when {
        b % a == 0 -> "a является делителем"
        else -> "a не является делителем"
    })
}