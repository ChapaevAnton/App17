package kingdom

// TODO: 29.04.2021 17.1
class Kingdom {
    val ruler = Ruler("Король Артур")
    val heirs = mutableListOf<Heir>()
    val archers = mutableListOf<Archer>()
    val warriors = mutableListOf<Warrior>()
    val peasant = mutableListOf<Peasant>()
    var coffers = 0


    init {
        //init heir
        heirs.addHeir(10)

        //init archer
        archers.addArcher(20)

        //init warrior
        warriors.addWarrior(30)

        //peasant
        peasant.addPeasant(20)

    }



    //task collector impl
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
            val sum = list.size * 3
            coffers += sum
            println("Сбор налогов ${Profession.FARMER}, ${list.size} человек")
            return sum
        }
    }


}




