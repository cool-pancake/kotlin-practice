package practice9

fun sortStrList(list: List<String>): List<String> {
    return list.sorted()
}

fun main() {
    println(sortStrList(listOf("qwerty", "abc", "zz", "bbb")))
}