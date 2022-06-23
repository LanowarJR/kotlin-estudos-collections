package com.estudos.collections

fun main() {

    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("--------Funcao estendida somatoria ---------")
    println(salarios.somatoria())

    println("---------Funcao estendida media--------")
    println(salarios.media())

}