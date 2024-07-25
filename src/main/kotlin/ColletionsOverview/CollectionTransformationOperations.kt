package org.example.ColletionsOverview

data class StringContainer(val values: List<String>)

fun main() {
    val containers = listOf(
        StringContainer(listOf("one", "two", "three")),
        StringContainer(listOf("four", "five", "six")),
        StringContainer(listOf("seven", "eight"))
    )

    println()
    println(containers.flatMap { it.values.map { it1 -> it1.uppercase() }})
}

