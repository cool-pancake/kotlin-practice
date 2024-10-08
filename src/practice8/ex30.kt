package practice8

fun sumOneTo(to: Int): Int {
    if (to <= 1)
        return 1

    return to + sumOneTo(to-1)
}

fun main() {
    println(sumOneTo(5))
}