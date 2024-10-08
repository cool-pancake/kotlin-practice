package practice8

import kotlin.math.pow

fun func9(n: Int, k:Int): Boolean {
    when {
        k.toFloat().pow(k).toInt() == n -> return true
        else -> return false
    }
}

fun main() {
    println(func9(10, 5))
}