package org.example.ColletionsOverview

// Sequência de Números Inteiros
fun generateAndPrintSequence() {
    val seq = generateSequence(1) { it + 1 }.take(10).toList()
    println(seq.joinToString(", "))
}

// Sequência Infinita com Filtro
fun generateAndPrintEvenSequence() {
    val seq = generateSequence(1) { it + 1}
        .filter { it % 2 == 0 }
        .take(10).toList()

    println(seq.joinToString(", "))
}

//Sequência com Transformação
fun generateAndPrintTransformedSequence() {
    val seqDouble = generateSequence(1){ it + 1 }
        .map { it * 2 }
        .take(5)

    println(seqDouble.joinToString(", "))
}

// Sequência de Strings
fun generateAndPrintStringSequence() {
    val seq = sequenceOf("kotlin", "is", "awesome")
        .map { it.uppercase() }
        .toList()

    println(seq.joinToString(", "))
}


// Sequência Customizada
fun generateAndPrintCustomSequence() {
    //1, 2, 4, 8, 16, 32, 64, 128, 256, 512

    val seq = generateSequence(1){ it * 2}.take(10).toList()
    println(seq.joinToString(", "))
}

// Sequência de Fibonacci
fun generateAndPrintFibonacciSequence() {
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

    val seq = generateSequence(Pair(0, 1)){ Pair(it.second, it.first + it.second)}
        .map { it.first }
        .take(10)

    println(seq.toList().joinToString(", "))
}
fun main(){
    //generateAndPrintSequence()
    //generateAndPrintEvenSequence()
    //generateAndPrintTransformedSequence()
    //generateAndPrintStringSequence()
    //generateAndPrintCustomSequence()
    generateAndPrintFibonacciSequence()
}