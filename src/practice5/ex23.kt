package src.practice5

fun main() {
    while (true) {
        print("Введите первое число: ")
        val a = readlnOrNull()?.toIntOrNull() ?: 10
        print("Введите второе число: ")
        val b = readlnOrNull()?.toIntOrNull() ?: 2

        print("Введите действие: ")
        val c = readlnOrNull() ?: "+"
        when {
            c.lowercase() == "стоп" -> break
            c == "+" -> println("a + b = ${a + b}")
            c == "*" -> println("a * b = ${a * b}")
        }
    }
}