package practice8

fun sumNatural(to: Int): Int {
    if (to <= 1)
        return 1

    return to + sumNatural(to-1)
}

fun main() {
    println(sumNatural(5))
}