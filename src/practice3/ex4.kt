package practice3

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    if (a % b == 0) {
        println("$a кратно $b")
    } else {
        println("остаток $a / $b = ${a%b}")
    }
}