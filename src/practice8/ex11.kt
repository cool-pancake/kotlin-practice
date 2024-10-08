package practice8

// based on recursive descent parser
fun equation(str: String): Double {
    val eq = str.filter { !it.isWhitespace() }
    var ch = ' '
    var pos: Int = -1

    fun nextChar() {
        ch = when {
            ++pos < eq.length -> eq[pos]
            else -> ' '
        }
    }

    fun checkChar(chr: Char): Boolean {
        if (ch == chr) {
            nextChar()
            return true
        }
        return false
    }

    // 1. check for unary plus or minus and numbers
    fun parseFactor(): Double {
        if (checkChar('+')) return +parseFactor()
        if (checkChar('-')) return -parseFactor()

        var a = 0.0
        val startPos = pos
        var dots = 0
        when {
            ch.isDigit() || ch == '.' -> {
                while (ch.isDigit() || ch == '.') {
                    when { // handle dots
                        dots > 1 -> throw RuntimeException("Unexpected '$ch'")
                        ch == '.' -> dots++
                    }
                    nextChar()
                    a = eq.substring(startPos, pos).toDouble() // get number
                }
            }
            else -> throw RuntimeException("Unexpected '$ch'")
        }

        return a
    }

    // 2. check for multiplication and division
    fun parseTerm(): Double {
        var a = parseFactor()
        while(true) {
            if (checkChar('*')) a *= parseFactor()
            else if (checkChar('/')) a /= parseFactor()
            else return a
        }
    }

    // 3. check for plus and minus
    fun parseExpression(): Double {
        var a = parseTerm()
        while(true) {
            if (checkChar('+')) a += parseTerm()
            else if (checkChar('-')) a -= parseTerm()
            else return a
        }
    }

    // main parse function
    fun parse(): Double {
        nextChar()
        val answer: Double = parseExpression()
        if (pos < eq.length)
            throw RuntimeException("Unexpected '$ch'")
        return answer
    }

    return parse()
}

fun main() {
    println(equation("1.5+1"))
    println(equation("5.5 + 2.5 * 2"))
    println(equation("2+8/2"))
    println(equation("30*3-82+100+1020*2*10"))
}