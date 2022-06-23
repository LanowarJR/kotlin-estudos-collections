package com.estudos.collections

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 1200.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1800.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 1600.0, tipoContratacao = "CLT")

    println("------Listas Mutaveis ------")

    val funcionarios = mutableListOf(joao, maria) // cria uma lista mutavel, podendo ser alterada
    funcionarios.forEach { println(it) }

    println("------adicionado Pedro----------")
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("------removido Joao----------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("------Sets Mutaveis ------") // Cria set ou conjuntos mutaveis
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("------adicionado Pedro e Maria----------")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("------removido Maria----------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }







}