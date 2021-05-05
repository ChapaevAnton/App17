package standart

fun main() {

    val list0 = mutableListOf(1, 2, 3, 4, 5)

    val list1 = mutableListOf(1, 2, 3, 4, 5).apply {
        add(10)
        removeAt(0)
        remove(4)
        set(lastIndex, 100)
    }
    println("apply: $list1")

    val list2 = mutableListOf("1", "2", "3", "4", "5").first().let {
        (it.toInt() + it.toInt()) * 2
    }
    println("let: $list2")

    val value: String? = null
    val name = value?.let { "Hei $it!" } ?: "Hei no name"
    println("let2: $name")

    val list3 = mutableListOf(1, 2, 3, 4, 5, 6).run {
        get(4).plus(get(0)) * 2
    }
    println("run: $list3")

    val list4 = with(mutableListOf(list0, list0).flatten()) { size == 10 }
    println("with $list4")

    val list5 = mutableListOf(1, 4, 3, 7, 4, 2, 1).also { it.sort() }.also { println("also $it") }

    val list6 = mutableListOf(list0).flatten().takeIf { it.isNotEmpty() }?.indexOf(3).also { println("takeIf: $it") }




}