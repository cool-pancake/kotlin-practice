package src.practice7

import kotlin.random.Random

val ranks = mapOf("6" to 6, "7" to 7, "8" to 8, "9" to 9, "10" to 10, "Jack" to 2, "Queen" to 3, "King" to 4, "Ace" to 11)
val suits = listOf("Clubs", "Diamonds", "Hearts", "Spades")
var deck = mutableListOf<String>()

var enemyCards = mutableListOf<String>()
var myCards = mutableListOf<String>()

var myScore = 0
var enemyScore = 0

fun main() {
    start()
    loop()
}

fun start() {
    println("Welcome to the 'Twenty-one'\n")

    deck = mutableListOf()

    ranks.forEach {
        rank -> suits.forEach { suit -> deck.add("${rank.key} $suit") }
    }

    enemyCards = mutableListOf()
    myCards = mutableListOf()

    myCards.add(getRandomCard(deck) ?: "")
    myCards.add(getRandomCard(deck) ?: "")
    enemyCards.add(getRandomCard(deck) ?: "")
    enemyCards.add(getRandomCard(deck) ?: "")
}

fun loop() {
    while (true) {
        calculateScore()
        println()
        println("Number of cards in deck: ${deck.size}")
        println("Your cards are: ")
        printCards(myCards)
        println("Your score is : $myScore")
        println()

        print("Do you want to get more(y/n)? ")
        val ans = readlnOrNull()?.lowercase() ?: "y"

        when {
            ans == "y" -> {
                val card = getRandomCard(deck)
                when {
                    card == null -> {
                        calculateScore()
                        println("Your cards are: ")
                        printCards(myCards)
                        println("Your score is : $myScore")
                        println("Enemy cards are: ")
                        printCards(enemyCards)
                        println("Enemy score is : $enemyScore")
                        printWinner(checkWinner())
                        break
                    }
                    else -> {
                        myCards.add(card)
                    }
                }
            }
            else -> {
                calculateScore()
                println("Your cards are: ")
                printCards(myCards)
                println("Your score is : $myScore")
                println("Enemy cards are: ")
                printCards(enemyCards)
                println("Enemy score is : $enemyScore")
                printWinner(checkWinner())
                break
            }
        }
    }
}

// 1 - enemy win, 2 - you win, 3 - draw
fun checkWinner(): Int {
    if (enemyScore == myScore || enemyScore > 21 && myScore > 21)
        return 3

    if (enemyScore < 21 && enemyScore > myScore || myScore > 21)
        return 1
    else
        return 2
}

fun printWinner(winner: Int) {
    println(when (winner) {
        1 -> "Enemy win."
        2 -> "You win!"
        else -> "Draw!"
    })
}

fun getRandomCard(deck: MutableList<String>): String? {
    if (deck.isEmpty())
        return null

    val card = deck[Random.nextInt(deck.size)]
    deck.remove(card)

    return card
}

fun printCards(cards: MutableList<String>) {
    for (card in cards) {
        println("-> $card")
    }
}

fun calculateScore() {
    myScore = 0
    enemyScore = 0

    for (card in enemyCards) {
        val cardName = card.substringBefore(" ")
        val rank = ranks[cardName] ?: 0
        enemyScore += rank
    }

    for (card in myCards) {
        val cardName = card.substringBefore(" ")
        val rank = ranks[cardName] ?: 0
        myScore += rank
    }
}