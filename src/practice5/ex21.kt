package src.practice5

fun main() {
    print("Введите год: ")
    val year = readlnOrNull()?.toIntOrNull() ?: 2024
    print("Введите месяц: ")
    val month = readlnOrNull()?.toIntOrNull() ?: 12

    when {
        month > 12 || month < 1 -> {
            println("Неверный месяц")
            return
        }
        year < 1 || year > 10000 -> {
            println("Неверный год")
            return
        }
    }

    val leap: Boolean = when {
        year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) -> true
        else -> false
    }

    val days = when(month) {
        4, 6, 9, 11 -> 30
        2 -> when {
            leap -> 29
            else -> 28
        }
        // 1, 3, 5, 7, 8, 10, 12
        else -> 31
    }

    for (day in 1..days) {
        println("$day.$month.$year")
    }
}