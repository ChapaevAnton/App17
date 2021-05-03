package lambda

fun main() {
// TODO: 03.05.2021 type alias
    val list1: ListString = listOf("1", "2", "3")
    println(list1)
    val list2: ListGeneric<Int> = listOf(1, 2, 3, 4, 5)
    println(list2)
}

typealias ListString = List<String>
typealias ListGeneric<K> = List<K>
typealias Operation<T> = (T, T) -> T
