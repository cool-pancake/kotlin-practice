package src.practice6

fun main() {
    print("Размер массива: ")
    val size = readlnOrNull()?.toIntOrNull() ?: 10

    val list = MutableList<Int>(size) { 0 }

    for (i in 0..<size) {
        print("Значение ${i+1} элемента: ")
        val a = readlnOrNull()?.toIntOrNull() ?: 10
        list[i] = a
    }

    println(list)
}