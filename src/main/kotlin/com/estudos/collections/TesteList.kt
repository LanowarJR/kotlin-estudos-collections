package com.estudos.collections

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 1200.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1800.0,tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 1600.0,tipoContratacao = "CLT")

    val funcionarios = listOf(joao, pedro, maria) // Cria uma lista com os objetos instanciados anteriormente
    funcionarios.forEach { println(it) }

    println("------------------------")
    println("Usando FIND por MARIA na List")
    println(funcionarios.find {
        it.nome == "Maria"
    })

    println("------------------------")
    println("Usando sortedBy na List")
    funcionarios.sortedBy {
        it.salario
    }.forEach { println(it) }

    println("------------------------")
    println("Usando groupBy na List") // cria grupos da lista com base no tipo de contratacao
    funcionarios.groupBy {
        it.tipoContratacao
    }.forEach { println(it) }

}

