package practice3

fun fib(num: Int): Int {
    if (num <= 1) {
        return num
    }
    return fib(num - 1) + fib(num - 2)
}

fun main() {
    println(fib(readln().toInt()))
}