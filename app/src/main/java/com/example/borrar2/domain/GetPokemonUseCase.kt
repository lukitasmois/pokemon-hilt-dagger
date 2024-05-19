package com.example.borrar2.domain

import com.example.borrar2.data.PokemonRepository
import com.example.borrar2.data.database.entities.toDataBase
import com.example.borrar2.domain.model.Pokemon
import javax.inject.Inject

//recibe la lista cargada en memoria de pokemons obtenidos por la api
//si la lista esta vacia porque no recibio ninguno, carga los de la base de datos
class GetPokemonUseCase @Inject constructor(private val repository : PokemonRepository){
    suspend operator fun invoke(): List<Pokemon>{
        val pokemons = repository.getAllPokemonFromApi()

        return if(pokemons.isNotEmpty()){

            repository.insertPokemons(pokemons.map { it.toDataBase() })
            pokemons
        }else{
            repository.getAllPokemonsFromDatabase()
        }
    }
}