package com.estudos.collections

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 1200.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1800.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 1600.0, tipoContratacao = "CLT")

    val repositorio = Repositorio<Funcionario>() // instancia um objeto Repositorio, um map mutavel, com parametro T = Funcionario

    repositorio.create(joao.nome,joao)
    repositorio.create(maria.nome,maria)
    repositorio.create(pedro.nome,pedro) // funcao create adiciona mais elementos no map

    println("------Pesquisa no map por Joao------")
    println(repositorio.findById(joao.nome))

    println("-----Lista todos os elementos--------")
    repositorio.findall().forEach{ println(it)}

    println("-----remover Maria do Map--------")
    repositorio.remove(maria.nome)
    repositorio.findall().forEach{ println(it)}


}