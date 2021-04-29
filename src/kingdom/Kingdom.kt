package kingdom

// TODO: 29.04.2021 17.1
class Kingdom {
    val ruler = Ruler("Король Артур")
    val heirs = mutableListOf<Heir>()
    val archers = mutableListOf<Archer>()
    val warriors = mutableListOf<Warrior>()
    private val baseNames = listOf("Иван", "Петр", "Николай", "Александр")

    init {
        //init heir
        for (i in 0..10) {
            heirs.add(
                Heir(
                    "${
                        if (i >= baseNames.size)
                            baseNames[i % baseNames.size]
                        else baseNames[i]
                    } $i"
                )
            )
        }

        //init archer
        for (i in 0 until 20) {
            archers.add(if (i % 2 == 0) Archer("dagger") else Archer())
        }

        //init warrior
        for (i in 0 until 30) {
            warriors.add(if (i % 2 == 0) Warrior("sword") else Warrior("axe"))
        }

    }

}


open class Ruler(val name: String, var intellect: Int = 10, var power: Int = 10) {
    override fun toString() = "name: $name intellect: $intellect power: $power"

}


class Heir(name: String) : Ruler(name) {

    // TODO: 29.04.2021 gen intellect and power
    init {
        intellect += (1..5).random()
        power += (1..5).random()
    }
}

data class Archer(val bow: String = "long bow", val dagger: String = "none") {
    constructor(dagger: String) : this("long bow", dagger)
} //20


data class Warrior(val weapon: String) //30

enum class Weapons(private val nameWeapons: String) {
    SWORD("sword"),
    DAGGER("dagger"),
    BOW("bow"),
    AXE("axe"),
    STAFF("staff");

    fun getWeapons() = nameWeapons

}