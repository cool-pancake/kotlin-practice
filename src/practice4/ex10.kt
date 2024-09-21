package src.practice4

fun main() {
    print("Способ оплаты: ")

    val a = readln().lowercase()

    println(when {
        a == "paypal" -> "Вы выбрали PayPal"
        a == "наличные" -> "Вы выбрали наличные"
        a == "кредитная карта" -> "Вы выбрали кредитную карту"
        else -> "Неизвестно"
    })
}