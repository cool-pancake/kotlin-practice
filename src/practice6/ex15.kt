package practice6

fun main() {
    val lst = listOf(1, 2, 3, 2, 1)

    println(when {
        lst == lst.reversed() -> "Палиндром"
        else -> "Не палиндром"
    })
}