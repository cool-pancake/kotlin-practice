package practice3

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()

    println(when {
        a % b == 0 -> "Число b является делителем"
        else -> "Число b не является делителем"
    })
}