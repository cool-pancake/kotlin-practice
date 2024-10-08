package practice8

fun isEven(a: Int): Boolean {
    return a % 2 == 0
}

fun main() {
    println(isEven(10))
    println(isEven(3))
}