package com.estudos.collections

fun main() {
    val nomes = Array(5) { "" }
    nomes[0] = "Maria"
    nomes[1] = "Alfredo"
    nomes[2] = "Godofreda"
    nomes[3] = "Astrogildo"
    nomes[4] = "Genoveva"

    for (nome in nomes) {
        println(nome)
    }

    println("---------------------------------")
    println("Usando Sort para organizar o array de strings em ordem alfabetica")

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    println("---------------------------------")
    println("Usando arrayOf")

    val nomesDois = arrayOf("Jose","Cardoso","Alfredinho","Lilice")
    nomesDois.sort()
    nomesDois.forEach {
        println(it)
    }



}