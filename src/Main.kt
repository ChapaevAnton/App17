import data.Data
import extend.X
import extend.Y
import valvar.ValVAr

fun main(args: Array<String>) {

//    val b = extend.A("test1")
//    val b1 = extend.A("test2", 1)
//    println(b.value1)
//    println(b1.value2)
//
//    val x: extend.X = extend.A("123")
//    val y: extend.Y = extend.A("321")
//
//    printAll(x)
//    printAll(y)
//
//    val c = extend.C(1)
//    c.runX()

//    val d = extend.D()
//    d.runX()

//    val cat = Cat("Барсик", 3)
//    cat.sound()

    val valVAr = ValVAr()
    valVAr.initValue()
    println(valVAr.value)
    println(valVAr.count)
    println(valVAr.intValue)
    println(valVAr.strValue)

    val data = Data(1,2,3)
    val (val1,val2,val3) = data
    println(val1)
    println(val2)
    println(val3)

}

fun printAll(str: X) {
    str.runX()
}

fun printAll(str: Y) {
    str.runY()
}