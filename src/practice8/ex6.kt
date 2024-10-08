package practice8

fun func6(a: Int, b: Int): Boolean {
    when {
        a * b < 100 -> return true
        else -> return false
    }
}

fun main() {
    println(func6(100, 100))
}