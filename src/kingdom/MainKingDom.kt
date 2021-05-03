package kingdom

fun main(args: Array<String>) {

    println("На нас напали!".yourHighness())
    println("Ваша популярность падает!".yourHighness())
    println("Нужно больше золота!".yourHighness())

    Ruler.getGerold()
    val kingdom = Kingdom()
    println(kingdom.ruler)
    println(kingdom.heirs)
    println(kingdom.archers)
    println(kingdom.warriors)
    println(kingdom.peasant)

    println(kingdom.workerTaskCollectors.collect())
    println(kingdom.farmerTaskCollectors.collect())
    println(kingdom.builderTaskCollectors.collect())

    println("Золота в казне: ${kingdom.coffers}")


}