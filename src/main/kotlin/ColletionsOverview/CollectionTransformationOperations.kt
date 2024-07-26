package org.example.ColletionsOverview

data class StringContainer(val values: List<String>)

fun flattenAndRemoveDuplicates(listOfLists: List<List<Int>>): List<Int> {
    return listOfLists.flatten().distinct()
}

fun zipLists(list1: List<Int>, list2: List<Int>): List<Pair<Int, Int>>{
    return list1 zip list2
}

fun sumZippedLists(list1: List<Int>, list2: List<Int>): List<Int> {
    return list1.zip(list2){ a, b -> a + b}
}

fun main() {
    val containers = listOf(
        StringContainer(listOf("one", "two", "three")),
        StringContainer(listOf("four", "five", "six")),
        StringContainer(listOf("seven", "eight"))
    )

    val listOfLists = listOf(listOf(1, 2, 3), listOf(3, 4, 5), listOf(5, 6, 7))

    val list1 = listOf(1, 2, 3)
    val list2 = listOf(4, 5, 6)

    //println(containers.flatMap { it.values.map { it1 -> it1.uppercase() }})
    //println(flattenAndRemoveDuplicates(listOfLists)) // Deve imprimir [1, 2, 3, 4, 5, 6, 7]
    //println(zipLists(list1, list2))
    println(sumZippedLists(list1, list2))
}

