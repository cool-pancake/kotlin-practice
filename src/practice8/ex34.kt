package practice8

fun strDeleteSpaces(str: String): String {
    return str.filter { !it.isWhitespace() }
}

fun main() {
    println(strDeleteSpaces("h e l  l   o"))
}