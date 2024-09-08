package practice2.numbers

fun main() {
    print("Enter number: ")
    val a = readln().toInt()
    val tens = a.mod(100).div(10) // десятки
    val units = a.mod(10) // единицы

    var num = a
    var sum = 0
    var mul = 1

    while(num != 0) {
        sum += num.mod(10)
        mul *= num.mod(10)
        num = num.div(10)
    }

    println("Tens: $tens, Units: $units\nSum: $sum, Mul: $mul")
}