package practice2.logical

fun main() {
    val x = false
    val y = true
    val z = false

    println("X: $x, Y: $y, Z: $z")

    println("X or Z: ${x or z}, X and Y: ${x and y}, X and Z: ${x and z}")
}