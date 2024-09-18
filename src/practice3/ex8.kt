package practice3

fun main() {
    var a = readln().toInt()
    var b = readln().toInt()

    while (a != 0 && b != 0) {
        if (a > b) {
            a = a % b
        } else {
            b = b % a
        }
    }
    println(a + b)
}