package practice3

import kotlin.math.max

fun main() {
    print("Enter first number: ")
    val a = readln().toDouble()
    print("Enter second number: ")
    val b = readln().toDouble()
    print("Enter third number: ")
    val c = readln().toDouble()

    println(max(max(a, b), c))
}