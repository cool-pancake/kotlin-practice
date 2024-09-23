package src.practice3

import kotlin.random.Random

fun main()
{
    val a: Float = Random.nextFloat() * 100

    if (a % 2.0f == 0.0f) {
        println("Число $a четное")
    } else {
        println("Число $a не четное")
    }

    if (a.toString().last() == '7') {
        println("Число $a оканчивается на 7")
    } else {
        println("Число $a не оканчивается на 7")
    }
}