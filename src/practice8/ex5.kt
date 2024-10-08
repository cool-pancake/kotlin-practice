package practice8

fun func(prob: Int, prize: Int, pay: Int): Boolean {
    when {
        prob * prize > pay -> return true
        else -> return false
    }
}

fun main() {
    println(func(10, 10, 12))
}