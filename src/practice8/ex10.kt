package practice8

fun repetition(txt: String, count: Int) {
    if (count == 0)
        return
    print(txt)
    repetition(txt, count-1)
}

fun main() {
    repetition("ab", 3)
    println()
    repetition("kiwi", 1)
    println()
    repetition("cherry", 2)
}