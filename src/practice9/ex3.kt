package practice9

const val DOLLAR_EURO = 0.91

fun dollarToEuro(dollar: Double): Double {
    return dollar * DOLLAR_EURO
}

fun main() {
    println(dollarToEuro(10.0))
}