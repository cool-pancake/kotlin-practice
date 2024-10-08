package practice10

fun caesarEncrypt(str: String): String {
    return str.map { (it.code + 3).toChar() }.joinToString("")
}

fun caesarDecrypt(str: String): String {
    return str.map { (it.code - 3).toChar() }.joinToString("")
}

fun main() {
    println(caesarEncrypt("abcdef"))

    println(caesarDecrypt("defghi"))
}