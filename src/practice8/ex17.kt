package practice8

fun fact(a: Int): Int {
    if (a <= 1)
        return 1

    return a * fact(a-1)
}

fun main() {
    println(fact(3))
    println(fact(7))
}