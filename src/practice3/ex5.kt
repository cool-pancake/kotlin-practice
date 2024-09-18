package practice3

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println(when {
        a + b < c || a + c < b || b + c < a -> "Треугольник не существует"
        else -> "Треугольник существует"
    })
}