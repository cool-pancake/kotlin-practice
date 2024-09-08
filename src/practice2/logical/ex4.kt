package practice2.logical

fun main() {
    val x = true
    val y = true
    val z = false

    println("X: $x, Y: $y, Z: $z")

    println("not X and Y: ${!x and y}, X or not Y: ${x or !y}, X or Y and Z: ${x or y and z}")
}