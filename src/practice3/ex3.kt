package practice3

fun main() {
    print("Enter first number: ")
    val a = readln().toDouble()
    print("Enter second number: ")
    val b = readln().toDouble()

    if (a.mod(2.0) != 0.0) {
        println("Odd: $a")
    }

    if (b.mod(2.0) != 0.0) {
        println("Odd: $b")
    }
}