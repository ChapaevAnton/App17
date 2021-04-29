package sealed
// TODO: 29.04.2021 17.2

sealed class Car

class FastCar(var isFast: Boolean = false) : Car()
class SlowCar(var isFast: Boolean = false) : Car()

fun fastToFurious(car: Car) =
    when (car) {
        is FastCar -> car.isFast = true
        is SlowCar -> car.isFast = false
    }

fun main() {

    val fastCar = FastCar()
    val slowCar = SlowCar()

    fastToFurious(fastCar)
    fastToFurious(slowCar)

    println(fastCar.isFast)
    println(slowCar.isFast)

}
