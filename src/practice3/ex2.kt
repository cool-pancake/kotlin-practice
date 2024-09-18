package practice3

fun main(): Unit {
    print("Enter first number: ")
    val a = readln().toDouble()
    print("Enter second number: ")
    val b = readln().toDouble()
    print("Enter third number: ")
    val c = readln().toDouble()

    val numbers: List<Double> = listOf(a, b, c)

    if (a == b || a == c || b == c) {
        println("Error")
        return
    }

    var sum = 0.0
    for (num in numbers) {
        sum += num
    }

    println("Average: ${sum/numbers.size}")
}