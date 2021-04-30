package kingdom

// TODO: 29.04.2021 17.1
class Kingdom {
    val ruler = Ruler("Король Артур")
    val heirs = mutableListOf<Heir>()
    val archers = mutableListOf<Archer>()
    val warriors = mutableListOf<Warrior>()
    val peasant = mutableListOf<Peasant>()
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
            archers.add(if (i % 2 == 0) Archer(Weapons.DAGGER) else Archer())
        }

        //init warrior
        for (i in 0 until 30) {
            warriors.add(if (i % 2 == 0) Warrior(Weapons.SWORD) else Warrior(Weapons.AXE))
        }

        //peasant
        for (i in 0 until 100) {
            peasant.add(
                when {
                    i % 2 == 0 -> Peasant(Profession.BUILDER)
                    i % 3 == 0 -> Peasant(Profession.FARMER)
                    else -> Peasant(Profession.WORKER)
                }
            )

        }

    }

}




