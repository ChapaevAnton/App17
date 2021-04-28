package valvar

import kotlin.properties.Delegates

class ValVAr {

    lateinit var value: String
    var intValue by Delegates.notNull<Int>()

    val count: Int by lazy { 100 }

    val strValue: String by lazy { "string" }

    //backing field
    var doubleValue: Double = 0.0
        set(value: Double) {
            field = value * 2.0
        }
        get() = field - 5

    //backing filed gen
    private var _doubleValue1: Double = 0.0
    var doubleValue1: Double
        get() = _doubleValue1
        set(value) {
            _doubleValue1 = value
        }

    //backing property
    private var _floatValue: Float = 0.0F
    var floatValue: Float
        get() {
            return _floatValue
        }
        set(value: Float) {
            _floatValue = value + 5.0F
        }


    init {

    }

    fun initValue() {
        value = "10"
        intValue = 777
    }


}