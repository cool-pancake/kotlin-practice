package src.practice5

fun main() {
    print("Введите высоту пирамиды: ")
    val height = readlnOrNull()?.toIntOrNull() ?: 5

    for (i in 1..height) {
        print(" ".repeat(height - i))
        print("#".repeat(i * 2 - 1))
        println()
    }
}