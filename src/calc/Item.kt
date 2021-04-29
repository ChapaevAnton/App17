package calc

interface Calc

class Item(val value: Int) : Calc

class Sum(val left: Calc, val right: Calc) : Calc

fun calculate(item: Calc): Int =
    when (item) {
        is Item -> {
            println("num: ${item.value}")
            item.value
        }
        is Sum -> {
            val left = calculate(item.left)
            val right = calculate(item.right)
            println("sum: ${left + right}")
            left + right
        }
        else -> 0
    }

fun main(args: Array<String>) {

    println(calculate(Sum(Sum(Item(1), Item(2)), Item(5))))

}