package practice9

fun longestWord(str: String): String {
    when {
        str.isBlank() -> throw RuntimeException("String is blank")
    }

    val list = str
        .replace("""[.,;:/\\]""".toRegex(), " ")
        .replace("\\s+".toRegex(), " ")
        .split(" ")
        .sortedBy { it.length }
    println(list)

    return list.last()
}

fun main() {
    println(longestWord("Car, Wooooorld, abdd, Apple       a  hello"))
}