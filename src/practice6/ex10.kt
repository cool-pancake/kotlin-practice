package practice6

fun main() {
    val lst = (1..10).toList()

    println(lst)

    println("Sum = ${lst.filter { it % 2 == 0 }.sum()}")
}