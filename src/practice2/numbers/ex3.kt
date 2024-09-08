package practice2.numbers

fun main() {
    print("Enter first number: ")
    val first = readln().toInt()
    print("Enter second number: ")
    val second = readln().toInt()

    println("$first/$second = ${first/second.toFloat()}")
}