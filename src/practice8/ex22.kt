package practice8

fun isPalindrom(str: String): Boolean {
    return str.reversed() == str
}

fun main() {
    println(isPalindrom("abcd"))
    println(isPalindrom("ahaha"))
}