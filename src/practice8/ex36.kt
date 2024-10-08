package practice8

fun isSubstrInStr(substr: String, str: String): Boolean {
    return substr in str
}

fun main() {
    println(isSubstrInStr("abc", "hahabc"))
}