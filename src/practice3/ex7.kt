package src.practice3

import kotlin.random.Random

fun main()
{
    val a = Random.nextFloat() * 100
    val b = Random.nextFloat() * 100

    println("a = $a, b = $b")
    println(when {
        a > b -> "a > b"
        a < b -> "a < b"
        else -> "a == b"
    })
}
