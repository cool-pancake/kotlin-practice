package practice10

fun printNumbers(n: Int) {
    println(if (n <= 0) emptyList() else (n downTo 1).toList())
}

fun main() {
    printNumbers(0)
    printNumbers(2)
    printNumbers(5)
}