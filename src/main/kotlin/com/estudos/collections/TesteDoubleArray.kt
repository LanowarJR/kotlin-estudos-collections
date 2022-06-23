package com.estudos.collections

fun main() {
    val salarios = DoubleArray(4)
    salarios[0] = 1500.5
    salarios[1] = 1600.5
    salarios[2] = 1200.4
    salarios[3] = 2200.3

    for (valores in salarios) {
        println(valores)
    }

    println("----------------------")

    val salariosDois = DoubleArray(3)
    salariosDois[0] = 1100.0
    salariosDois[1] = 3353.78
    salariosDois[2] = 2500.95

    salariosDois.forEachIndexed { index, aumento ->
        salariosDois[index] = aumento * 1.15
    }

    salariosDois.forEach {
        println(it)
    }

    println("----------------------")
    val salariosOf = doubleArrayOf(1100.0, 1700.5, 1350.4)
    salariosOf.forEach { println(it) }

    salariosOf.forEachIndexed { index, d -> salariosOf[index] = d * 1.5  }
    println("Apos aumento de 50%")
    salariosOf.forEach { println(it) }

}

