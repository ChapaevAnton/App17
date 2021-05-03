package lambda

fun main() {
    // TODO: 03.05.2021 lambda
    val lambda = { println("тест") }
    val lambdaParameter = { value: Any -> println(value) }
    //QUESTION в чем разница этих двух форм записи?
    val lambdaBiParameter1: (String, String) -> String = String::plus
    val lambdaBiParameter2 = { str1: String, str2: String -> str1.plus(str2) }
    val lambdaBiParameter3: Operation<Int> = { x: Int, y: Int -> x / y }

    lambda()
    lambdaParameter(123)
    println(lambdaBiParameter1("1", "2"))
    println(lambdaBiParameter2("1", "2"))

    val result1 = operationNumber(5, 6, plus)
    val result2 = operationNumber(5, 6, minus)
    val result3 = operationNumber(5, 6) { x: Int, y: Int -> x * y }
    val result4 = singleNumber(3) { it * it }
    println(result4)
    val result5 = operationNumber(100, 5, lambdaBiParameter3)
    val result6 = operationNumber(80, 20, returnLambda())

    val cat1 = returnCat("Барсик", 5, 10) { println("name: ${it.name}, age:${it.age}, color: ${it.color}") }
    val cat2 = returnCat("Барсик", 5, 10) { (name, age, color) ->
        println("name: $name, age:$age, color: $color")
    }
    val cat3 = returnCat("Барсик", 5, 10) { (name, _, color) ->
        println("name: $name, color: $color")
    }
}

fun operationNumber(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    val result = operation(x, y)
    println(result)
    return result
}

fun operationNumber1(x: Int, y: Int, operation: Operation<Int>): Int {
    val result = operation(x, y)
    println(result)
    return result
}

fun singleNumber(x: Int, operation: (Int) -> Int) = operation(x)

val plus = { x: Int, y: Int -> x + y }
val minus = { x: Int, y: Int -> x - y }


fun returnLambda(): Operation<Int> {
    return { x, y ->
        val result = x * y; println(result); result
    }
}

data class Cat(val name: String, val age: Int, val color: Int)

fun returnCat(name: String, age: Int, color: Int, print: (Cat) -> Unit): Cat {
    val cat = Cat(name, age, color)
    print(cat)
    return cat
}