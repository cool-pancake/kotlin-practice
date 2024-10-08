package practice8

fun copyList(list: MutableList<Int>): MutableList<Int> {
    return list.toMutableList()
}

fun main() {
    val testList = mutableListOf(1, 2, 3)
    val copyList = copyList(testList)
    copyList[2] = 123

    println(testList)
    println(copyList)
}