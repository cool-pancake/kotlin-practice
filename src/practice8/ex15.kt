package practice8

fun max(a: Int, b: Int): Int {
    when {
        a > b -> return a
        else -> return b
    }
}

fun main() {
    println(max(10, 2))
}