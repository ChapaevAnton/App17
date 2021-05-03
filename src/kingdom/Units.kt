package kingdom

//administration
open class Ruler(val name: String, var intellect: Int = 10, var power: Int = 10) {

    companion object {
        fun getGerold() {
            println("Его Высокое Благородие Король в здании.")
        }
    }

    override fun toString() = "name: $name intellect: $intellect power: $power"
}

class Heir(name: String) : Ruler(name) {

    // TODO: 29.04.2021 gen intellect and power
    init {
        intellect += (1..5).random()
        power += (1..5).random()
    }
}


//army
data class Archer(val weaponFirst: Weapons = Weapons.BOW, val weaponSecond: Weapons = Weapons.NONE) {
    constructor(weaponSecond: Weapons) : this(Weapons.BOW, weaponSecond)
} //20

data class Warrior(val weaponFirst: Weapons) //30

//citizen
data class Peasant(val profession: Profession)

enum class Profession(private val profession: String) {
    WORKER("рабочий"),
    BUILDER("строитель"),
    FARMER("фермер");

    override fun toString(): String {
        return profession
    }

}

//extends fun
fun String.yourHighness() = "Ваше высочество, $this"

