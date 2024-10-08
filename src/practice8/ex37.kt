package practice8

fun printMultTable() {
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println()
    }
}

fun main() {
    printMultTable()
}