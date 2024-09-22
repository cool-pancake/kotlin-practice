package src.practice5

fun main() {
    print("Введите диапазон: ")
    val n = readlnOrNull()?.toIntOrNull() ?: 10
    val lst: MutableList<Boolean> = MutableList(n) { true }

    // sieve of eratosthenes
    for (i in 2..n - 1) {
        if (!lst[i])
            continue

        for (j in i..n - 1) {
            if (j % i == 0 && j >= i * i) {
                if (lst[j])
                    lst[j] = false
            }
        }

        println(i)
    }
}