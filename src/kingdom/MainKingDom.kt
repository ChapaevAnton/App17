package kingdom

fun main(args: Array<String>) {

    Ruler.getGerold()
    val kingdom = Kingdom()
    println(kingdom.ruler)
    println(kingdom.heirs)
    println(kingdom.archers)
    println(kingdom.warriors)
    println(kingdom.peasant)

    kingdom.workerTaskCollectors.collect()
    kingdom.farmerTaskCollectors.collect()
    kingdom.builderTaskCollectors.collect()

    println("Золота в казне: ${kingdom.coffers}")


}