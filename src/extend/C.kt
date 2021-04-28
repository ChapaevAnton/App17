package extend

class C(var count: Int) : X {

    init {
        println("init")
    }

    override fun runX() {
        println(count)
    }
}