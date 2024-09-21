package practice2.logical

fun main() {
    val a = true
    val b = false
    val c = false

    println("A: $a, B: $b, C: $c")

    println(
        "A or not (A and B) or C: ${a or !(a and b) or c}, not A or A and (B or C): ${!a or a and (b or c)}\n" +
                "(A or B and not C) and C: ${(a or b and !c) and c}"
    )
}