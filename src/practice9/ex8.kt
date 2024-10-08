package practice9

import kotlin.random.Random

fun main() {
    print("Enter number: ")
    val a = readlnOrNull()?.toIntOrNull() ?: 0
    val rand = Random.nextInt(1, 100)

    when {
        a == rand -> println("You win")
        else -> println("Not today, random number is $rand")
    }
}