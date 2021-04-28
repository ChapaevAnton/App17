package extend

class A : B {

    constructor(value1: String) : super(value1)
    constructor(value1: String, value2: Int) : super(value1, value2)

    override fun runX() {
        print("extend.X->$value1\n")
    }

    override fun runY() {
        print("extend.Y->$value1\n")
    }
}




