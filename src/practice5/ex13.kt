package src.practice5

fun main() {
    for (i in 1..20) {
        for (j in 1..20) {
            print("${(i * 10 + j) * (i * 10 + j)} ")
        }
        println()
    }
}