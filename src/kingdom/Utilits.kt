package kingdom

//generate units kingdom
fun MutableList<Peasant>.addPeasant(amount: Int) {
    for (i in 0 until amount) {
        this.add(
            when {
                i % 2 == 0 -> Peasant(Profession.BUILDER)
                i % 3 == 0 -> Peasant(Profession.FARMER)
                else -> Peasant(Profession.WORKER)
            }
        )
    }
}

fun MutableList<Warrior>.addWarrior(amount: Int) {
    for (i in 0 until amount) {
        this.add(if (i % 2 == 0) Warrior(Weapons.SWORD) else Warrior(Weapons.AXE))
    }
}

fun MutableList<Archer>.addArcher(amount: Int) {
    for (i in 0 until amount) {
        this.add(if (i % 2 == 0) Archer(Weapons.DAGGER) else Archer())
    }
}

private val baseNames = listOf("Иван", "Петр", "Николай", "Александр")
fun MutableList<Heir>.addHeir(amount: Int) {
    for (i in 0..amount) {
        this.add(Heir("${if (i >= baseNames.size) baseNames[i % baseNames.size] else baseNames[i]} $i"))
    }
}

//upgrade units
fun upgradeYourArcher(listArcher: List<Archer>, consumer: (List<Archer>) -> Unit): MutableList<Archer> {
    val upListArcher = listArcher.map { it.copy(weaponFirst = Weapons.COMPOSITE_BOW) }.toMutableList()
    consumer(upListArcher)
    return upListArcher
}

fun upgradeYourWarrior(listWarrior: List<Warrior>, consumer: (List<Warrior>) -> Unit): MutableList<Warrior> {
    val upListWarrior = mutableListOf<Warrior>()
    listWarrior.mapTo(upListWarrior) { it.copy(weaponFirst = Weapons.AK47) }
    consumer(upListWarrior)
    return upListWarrior
}

//hello
fun giveFunToPeasants(list: List<Peasant>) {
    list.forEach { peasant ->
        list.forEach {
            print("[${peasant.profession} -> ${it.profession}] ")
            if (peasant.profession == it.profession) print("Привет, коллега! ")
            else print("Вижу мы с вами занимаемся разным... ")
        }
    }
}