package com.estudos.collections

fun main() {

    val salariosOf = doubleArrayOf(1100.0, 1700.5, 1350.4, 2580.78, 4505.78)
    salariosOf.forEach { println(it) }
    println("----------------------")
    println("Maior salario:${salariosOf.max()}")
    println("Menor salario:${salariosOf.min()}")
    println("Media salarial:${salariosOf.average()}")
    println("----------------------")
    val salarioMaiorQue2000 = salariosOf.filter {
        it > 2000
    }
    println("----------------------")
    println("Salario MAior que 2000 usando Filter")

    salarioMaiorQue2000.forEach { println(it) }


}