package src.practice5

fun main() {
    var a = readlnOrNull()?.toIntOrNull() ?: 4
    var b = readlnOrNull()?.toIntOrNull() ?: 2

    while (a != 0 && b != 0) {
        if (a > b) {
            a %= b
        } else {
            b %= a
        }
    }
    println(a + b)
}