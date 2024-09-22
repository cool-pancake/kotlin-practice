package src.practice5

fun main() {
    print("Введите строку: ")
    val a = readlnOrNull() ?: "abc"

    for (i in 0..a.length - 1) {
        println(a[i])
    }
}