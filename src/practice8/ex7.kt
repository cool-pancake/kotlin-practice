package practice8

fun func7(a: Int): Boolean {
    when {
        a % 100 == 0 -> return true
        else -> return false
    }
}

fun main() {
    println(func7(100))
}