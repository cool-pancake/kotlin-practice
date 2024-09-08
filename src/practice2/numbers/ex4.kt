package practice2.numbers

import java.lang.Math.pow

fun main() {
    print("Enter number: ")
    val number = readln().toDouble()
    print("Enter power: ")
    val power = readln().toDouble()

    println("$number^$power = ${pow(number, power)}")
}