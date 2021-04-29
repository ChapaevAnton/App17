package sealed

fun main() {

    val shooter = Shooter(Pistol())
    shooter.gun.shoot()
    shooter.gun.reload()

    val shooter1 = Shooter(object : Gun {
        override fun shoot() {
            println("удар")
        }

        override fun reload() {
            println("замах")
        }

    })

    shooter1.gun.shoot()
    shooter1.gun.reload()


    val ninja = Ninja(object : Sword(100) {
        override fun def() {
            println("защита ниндзя")
        }

        override fun kick() {
            println("удар ниндзя")
        }
    })

    ninja.sword.kick()
    ninja.sword.def()
}

class Shooter(val gun: Gun)

class Ninja(val sword: Sword)

class Pistol : Gun {
    override fun shoot() {
        println("выстрел")
    }

    override fun reload() {
        println("клик клак")
    }
}


interface Gun {
    fun shoot()
    fun reload()
}

abstract class Sword(val value: Int) {

    open fun kick() {}
    open fun def() {}
}