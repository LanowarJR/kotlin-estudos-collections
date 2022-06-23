package com.estudos.collections

fun main() {
    val joao = Funcionario(nome = "Joao", salario = 1200.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1800.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 1600.0, tipoContratacao = "CLT")

    // setOf cria conjuntos
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)
    val funcionarios3 = setOf(joao, pedro, maria)
    print("--------------------------------")
    print("Uniao dos dois conjuntos")

    val resultUniao = funcionarios1.union(funcionarios2) // cria uma uniao dos conjutos citados
    resultUniao.forEach { println(it) }

    println("--------------------------------")
    println("Subtracao do conjuto 3 do conjunto 2")

    val resultsubtracao = funcionarios3.subtract(funcionarios2) // subtracao dos conjunto 3 do 2, tirando MARIA
    resultsubtracao.forEach { println(it) }

    println("--------------------------------")
    println("Intersecao do conjuto 3 do conjunto 2")

    val resultintersect = funcionarios3.intersect(funcionarios2) // intersecacao do conjunto 3 do 2, mostrando o que existe em comun
    resultintersect.forEach { println(it) }
}