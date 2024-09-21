package src.practice5

import kotlin.math.pow

fun main() {
    val a = readln()
    val b = readln()

    var sum = 0
    for (i in a) {
        for (j in b) {
            sum++
        }
    }

    if (a.length == b.length && a.length * b.length == sum) {
        println("Аннаграмма")
    } else {
        println("не аннаграмма")
    }
}