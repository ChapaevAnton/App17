package kingdom

// TODO: 29.04.2021 17.1
class Kingdom {
    val ruler = Ruler("Король Артур")
    val heirs = mutableListOf<Heir>()
    val archers = mutableListOf<Archer>()
    val warriors = mutableListOf<Warrior>()
    val peasant = mutableListOf<Peasant>()
    var coffers = 0
    private val baseNames = listOf("Иван", "Петр", "Николай", "Александр")

    init {
        //init heir
        addHeir(10)

        //init archer
        addArcher(20)

        //init warrior
        addWarrior(30)

        //peasant
        addPeasant(100)

    }

    private fun addPeasant(amount: Int) {
        for (i in 0 until amount) {
            peasant.add(
                    when {
                        i % 2 == 0 -> Peasant(Profession.BUILDER)
                        i % 3 == 0 -> Peasant(Profession.FARMER)
                        else -> Peasant(Profession.WORKER)
                    }
            )
        }
    }

    private fun addWarrior(amount: Int) {
        for (i in 0 until amount) {
            warriors.add(if (i % 2 == 0) Warrior(Weapons.SWORD) else Warrior(Weapons.AXE))
        }
    }

    private fun addArcher(amount: Int) {
        for (i in 0 until amount) {
            archers.add(if (i % 2 == 0) Archer(Weapons.DAGGER) else Archer())
        }
    }

    private fun addHeir(amount: Int) {
        for (i in 0..amount) {
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
    }

    //task collector
    val workerTaskCollectors = object : TaskCollectors() {
        override fun collect(): Int {
            val list = peasant.filter { it.profession == Profession.WORKER }
            val sum = list.size * 1
            coffers += sum
            println("Сбор налогов ${Profession.WORKER}, ${list.size} человек")
            return sum
        }
    }

    val builderTaskCollectors = object : TaskCollectors() {
        override fun collect(): Int {
            val list = peasant.filter { it.profession == Profession.BUILDER }
            val sum = list.size * 2
            coffers += sum
            println("Сбор налогов ${Profession.BUILDER}, ${list.size} человек")
            return sum
        }
    }

    val farmerTaskCollectors = object : TaskCollectors() {
        override fun collect(): Int {
            val list = peasant.filter { it.profession == Profession.FARMER }
            val sum = list.size*3
            coffers += sum
            println("Сбор налогов ${Profession.FARMER}, ${list.size} человек")
            return sum
        }
    }


}




