package practice8

fun countVowels(str: String): Int {
    return str.lowercase().count { it in listOf('a', 'e', 'i', 'o', 'u', 'а', 'у', 'о', 'и', 'э', 'ы', 'я', 'ю', 'е', 'ё') }
}

fun main() {
    println(countVowels("Car, Apple, Яблоко, Машина."))
}