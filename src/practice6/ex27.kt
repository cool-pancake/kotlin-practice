package practice6

fun main() {
    val lst = mutableListOf(4, 1, 1, 1, 1, 1, 10, 10, 5, 5, 5, 5, 5, 5)

    var max = 0
    var prev = lst[0]
    var current = 1
    for (elem in lst) {
        if (prev == elem) {
            current++
        } else {
            current = 1
        }

        if (current > max)
            max = current

        prev = elem
    }

    println(max)
}