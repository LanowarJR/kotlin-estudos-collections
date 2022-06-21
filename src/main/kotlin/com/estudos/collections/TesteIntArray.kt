package com.estudos.collections

fun main() {
    val vetor = IntArray(5)
    vetor[0] = 2
    vetor[1] = 5
    vetor[2] = 9
    vetor[3] = 15
    vetor[4] = 3

    println("Interando no array usando o FOR")
    println("---------------------------------")
    for (valores in vetor){
        println(valores)
    }

    println("Interando no array usando o ForEach")
    println("-----------------------------------")
    vetor.forEach{
        println(it)
    }

    println("Interando no array pelos indices")
    println("--------------------------------")
    for(index in vetor.indices){
        println(vetor[index])
    }

    println("Interando no array usando SORT")
    println("------------------------------")
    vetor.sort()
    for(valor in vetor){
        println(valor)
    }

}