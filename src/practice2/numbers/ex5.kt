package practice2.numbers

import kotlin.math.sqrt

fun main() {
    print("Enter number: ")
    val number = readln().toDouble()

    println("Sqrt $number = ${sqrt(number)}")
}