package com.estudos.collections

fun main() {
    val pares1: Pair<String, Double> = Pair("Joao", 2500.0) // pair cria pares com a os tipos passados no <>

    // o conjunto de pares podemos alocar dentro de um map, que possui suas chaves e seus valores

    val map1 = mapOf(pares1)
    map1.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

    println("Criando map utilizando sintaxe infix do Kotlin") //https://www.baeldung.com/kotlin/infix-functions

    val map2 = mapOf(
        "Pedro" to 2200.0,
        "Maria" to 1850.5
    )
    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

}