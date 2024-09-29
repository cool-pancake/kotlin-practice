package src.practice7

import kotlin.math.pow

fun main() {
    print("Введите первое число: ")
    val first = readlnOrNull()?.toIntOrNull() ?: 5
    print("Введите второе число: ")
    val second = readlnOrNull()?.toIntOrNull() ?: 5
    print("Введите знак: ")
    val oper = readlnOrNull() ?: "*"

    println(when(oper) {
        "*" -> first * second
        "+" -> first + second
        "/" -> {
            when {
                second == 0 -> "Деление на ноль запрещено."
                else -> first / second
            }
        }
        "%" -> first % second
        "^", "**" -> first.toFloat().pow(second)
        else -> "Неверный знак."
    })
}