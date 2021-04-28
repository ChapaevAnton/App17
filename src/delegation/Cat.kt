package delegation

class Cat(name: String, age: Int, private val sounded: SoundCatImpl = SoundCatImpl()) :
    Animal(name, age), Sound by sounded {

}