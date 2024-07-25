package org.example.ColletionsOverview

// Simple iterator
fun printNumbers(numbers: List<Int>){
    println(numbers.joinToString(", "))
}

// Filter iterator
fun printEvenNumbers(numbers: List<Int>){
    println(numbers.filter { it % 2 == 0 }
        .joinToString(",", prefix = "Even numbers: ")
    )
}

fun removeOddNumbers(numbers: MutableList<Int>){
    numbers.removeIf { it % 2 == 1 }
}

class UpperCaseIterator(private val string: List<String>): Iterator<String>{
    private var index = 0

    override fun hasNext(): Boolean {
        return index < string.size
    }

    override fun next(): String {
        if (!hasNext())
            throw NoSuchElementException()

        return string[index++].uppercase()
    }
}

fun doubleNumbers(numbers: List<Int>): List<Int>{
    return numbers.map { it * 2 }
}

fun main(){
    val numb = (1..10).toList()
    val mutableNumbs = (1..10).toMutableList()

    //printNumbers(numbers = numb)
    //printEvenNumbers(numb)
//    removeOddNumbers(mutableNumbs)
//    println(mutableNumbs)
    println(doubleNumbers(numb))


    val strings = listOf("kotlin", "is", "awesome")
    val stringUpperCaseIterator = UpperCaseIterator(strings)

//    while (stringUpperCaseIterator.hasNext()){
//        println(stringUpperCaseIterator.next())
//    }



}