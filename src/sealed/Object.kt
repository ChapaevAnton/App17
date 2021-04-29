package sealed

object Constant {

    const val PI = 3.14
}

class Object {

    val int = valueInt

    companion object Value {
        const val valueInt = 10
    }


}

fun main() {

    println(Constant.PI)
    println(Object.valueInt)

}