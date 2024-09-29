package src.practice7

fun scoreRate(wins: Int, draws: Int, loses: Int): Int {
    return wins * 3 + draws * 1 + loses * 0
}

fun main() {
    println(scoreRate(10, 2, 4))
}