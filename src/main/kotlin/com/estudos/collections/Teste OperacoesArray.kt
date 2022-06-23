package com.estudos.collections

fun main() {

    val salariosOf = doubleArrayOf(1100.0, 1700.5, 1350.4, 2580.78, 4505.78)
    salariosOf.forEach { println(it) }
    println("----------------------")
    println("Maior salario:${salariosOf.maxOrNull()}")
    println("Menor salario:${salariosOf.minOrNull()}")
    println("Media salarial:${salariosOf.average()}")
    println("----------------------")
    val salarioMaiorQue2000 = salariosOf.filter {
        it > 2000
    }
    println("----------------------")
    println("Salario MAior que 2000 usando Filter")

    salarioMaiorQue2000.forEach { println(it) }

    println("----------------------")
    println("Contar - Count -  dentro de um range de salarios")
    println(salariosOf.count { it in 1500.0..2600.0 })

    println("----------------------")
    println("Procurar - Find - salarios")
    println(salariosOf.find { it == 2580.78 })
    println(salariosOf.find { it == 1200.0 }) // exemplo de salario nao existente no array

    println("----------------------")
    println("Uso do ANY") // retorna true ou false como resultado da pesquisa
    println(salariosOf.any { it == 1100.0 })
    println(salariosOf.any { it == 1999.0 })


}