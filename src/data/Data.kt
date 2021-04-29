package data

data class Data(val value1: Int, val value2: Int, val value3: Int) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Data

        if (value1 != other.value1) return false
        if (value2 != other.value2) return false

        return true
    }

    override fun hashCode(): Int {
        var result = value1
        result = 31 * result + value2
        return result
    }

    override fun toString(): String {
        return "Data(value1=$value1, value2=$value2)"
    }


}