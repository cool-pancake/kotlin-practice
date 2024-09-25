package practice6

fun main() {
    val lst = (1..10).toList()

    println(lst)

    val odd = lst.filter { it % 2 == 0 }
    val even = lst.filter { it % 2 != 0 }

    println("Odd = ${odd}")
    println("Even = ${even}")
}