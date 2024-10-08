package practice8

fun toFahrenheit(cels: Double): Double {
    return cels * 9/5.0 + 32
}

fun main() {
    println(toFahrenheit(12.0))
}