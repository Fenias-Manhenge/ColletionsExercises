package org.example.ColletionsOverview

fun printRange(range: IntRange){
    println(range.joinToString(",", prefix = "Start: "))
}

fun printRangeWithStep(range: IntRange, step: Int) {
    for (i in range step step)
        print("$i ")
}

fun printReversedRange(range: IntRange) {
    for(i in range.reversed())
        print("$i ")
}

fun printCharRange(range: CharRange) {
    range.forEach {
        print("$it ")
    }
}

fun isNumberInRange(range: IntRange, number: Int): Boolean {
    return number in range
}

fun createDescendingRange(start: Int, end: Int): IntProgression {
    return end downTo start
}

fun main(){
    val range = 1..10

    //printRange(range)
    //printRangeWithStep(range = range, step = 2)
    //printReversedRange(range)
    //printCharRange('a'..'e')
//    println(isNumberInRange(range, 5))
//    println(isNumberInRange(range, 15))

    val range5 = createDescendingRange(start = 1, end = 10)

    println(range5.joinToString(", "))
}