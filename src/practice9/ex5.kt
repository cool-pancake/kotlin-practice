package practice9

fun main() {
    print("Введите диапазон: ")
    val n = readlnOrNull()?.toIntOrNull() ?: 10
    val list: MutableList<Boolean> = MutableList(n) { true }

    // sieve of eratosthenes
    for (i in 2..n - 1) {
        if (!list[i])
            continue

        for (j in i..n - 1) {
            if (j % i == 0 && j >= i * i) {
                if (list[j])
                    list[j] = false
            }
        }

        println(i)
    }
}