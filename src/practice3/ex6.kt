package practice3

fun main() {
    val a = readln().toInt()

    if (a % 4 == 0 && a % 400 == 0 || a % 100 == 0) {
        println("Год високосный")
    } else {
        println("Год не високосный")
    }
}