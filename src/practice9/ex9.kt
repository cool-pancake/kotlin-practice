package practice9

fun main() {
    val symbols = ('1'..'z')
    println("How much symbols to use: ")
    println((1..(readlnOrNull()?.toIntOrNull() ?: 5)).map { symbols.random() }.joinToString(""))
}