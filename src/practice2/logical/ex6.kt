package practice2.logical

fun main() {
    val x = false
    val y = false
    val z = true

    println("X: $x, Y: $y, Z: $z")

    println("X or Y and not Z: ${x or y and !z}, X and not Y or Z: ${x and !y or z}, not X and not Y: ${!x and !y}\n" +
            "X and (not Y or Z): ${x and (!y or z)}, not (X and Z) or Y: ${!(x and z) or y}, X or (not (y or z)): ${x or (!(y or z))}")
}