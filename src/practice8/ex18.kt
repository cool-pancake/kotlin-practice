package practice8

fun isPrime(a: Int): Boolean {
    if (a <= 1)
        return false

    var count = 1
    for (i in 2..a) {
        if (a % i == 0)
            count++
    }

    when {
        count == 2 -> return true
        else -> return false
    }
}

fun main() {
    println(isPrime(2))
    println(isPrime(10))
    println(isPrime(6))
    println(isPrime(13))
}