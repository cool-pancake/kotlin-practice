package src.practice5

fun main() {
    print("Введите кол-во чисел для ввода: ")
    val n = readlnOrNull()?.toIntOrNull() ?: 10

    val lst: MutableList<Int> = mutableListOf()

    for (i in 0..<n) {
        print("Введите число: ")
        lst.add(readlnOrNull()?.toIntOrNull() ?: 10)
    }

    println(lst.sorted())
}