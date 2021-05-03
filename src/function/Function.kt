package function

fun main() {

    // TODO: 30.04.2021 create extensions function
    println("test".addSymbolLast('!'))
    println(10.addSymbolLast('!'))
    val number = 10
    println(number.plus2x)
}


val Int.plus2x: Int
    get() {
        return this + this
    }

fun <T> T.addSymbolLast(symbol: Char): String {
    return this.toString().plus(symbol)
}
