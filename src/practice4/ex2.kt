package src.practice4

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(0, 100)
    val b = Random.nextInt(0, 100)
    val c = Random.nextInt(0, 100)

    println(when {
        a == b && b == c -> "Треугольник равносторонний"
        a == b || b == c || c == a -> "Треугольник равнобедренный"
        else -> "Треугольник разносторонний"
    })
}