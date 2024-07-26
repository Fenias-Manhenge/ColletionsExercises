package org.example.ColletionsOverview

fun filterEvenNumbers(numbers: List<Int>): List<Int> {
    return numbers.filter { it % 2 == 0 }
}

fun mapStringLengths(strings: List<String>): List<Int> {
    return strings.map { it.length }
}

fun allNumbersPositive(numbers: List<Int>): Boolean {
    return numbers.all { it > 0 }
}

fun sumNumbers(numbers: List<Int>): Int {
    return numbers.sum()
}

fun groupStringsByLength(strings: List<String>): Map<Int, List<String>> {
    return strings.groupBy { it.length }
}

fun main() {
    val numbers = (1..5).toList()

    val strings = listOf("kotlin", "is", "awesome")

    val mixedNumbers = listOf(1, -2, 3, 4, 5)

    val stringsGrouping = listOf("kotlin", "is", "awesome", "fun", "to", "learn")

    //println(filterEvenNumbers(numbers)) // Deve imprimir [2, 4, 6, 8, 10]
    //println(mapStringLengths(strings)) // Deve imprimir [6, 2, 7]
    println(allNumbersPositive(mixedNumbers)) // Deve imprimir false
    //println(sumNumbers(numbers))
    //println(groupStringsByLength(stringsGrouping))
}
