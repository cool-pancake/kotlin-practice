package practice9

fun main() {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'а', 'у', 'о', 'и', 'э', 'ы', 'я', 'ю', 'е', 'ё')
    val consonants = ('а'..'я').filter { it !in vowels } + ('a'..'z').filter { it !in vowels }

    print("Enter string: ")
    val a = readln()
    println("Vowels: ${a.count { it in vowels }}")
    println("Consonants: ${a.count { it in consonants }}")
}