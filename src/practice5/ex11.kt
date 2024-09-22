package src.practice5

fun main() {
    val a = readlnOrNull() ?: "abc"
    val b = readlnOrNull() ?: "cba"

    var sum = 0
    for (i in a) {
        for (j in b) {
            sum++
        }
    }

    if (a.length == b.length && a.length * b.length == sum) {
        println("Аннаграмма")
    } else {
        println("не аннаграмма")
    }
}