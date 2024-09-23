package src.practice3

import kotlin.random.Random

fun main()
{
    val km: Double = Random.nextInt(0, 1000).toDouble()
    val ft: Double = Random.nextInt(0, 1000).toDouble()

    println("km = $km, ft = $ft")

    val kmInFt = ft * 0.305 / 1000

    println("km in ft = $kmInFt")

    println(when {
        kmInFt > km -> "Расстояние в футах больше расстояния в километрах"
        kmInFt < km -> "Расстояние в км больше расстояния в футах"
        else -> "Расстояния одинаковы"
    })

}