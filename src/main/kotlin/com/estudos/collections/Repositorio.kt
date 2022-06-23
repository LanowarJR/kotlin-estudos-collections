package com.estudos.collections

class Repositorio<T> { // cria uma classe usando o o <T> generics como parametro https://kotlinlang.org/docs/generics.html

    private val map = mutableMapOf<String, T>() // instancia um mapa mutavel

    fun create(id:String, valor: T){ // funcao create adiciona mais elementos no map
        map[id]=valor
    }

    fun findById(id:String) = map[id] // procura no map

    fun findall() = map.values // listara todos os elementos do map

    fun remove(id: String) = map.remove(id)
}