package com.example.borrar2.domain

import com.example.borrar2.data.PokemonRepository
import com.example.borrar2.domain.model.Pokemon
import javax.inject.Inject

//toma un pokemon random de la base de datos
class GetRandomPokemonUseCase @Inject constructor(private val repository: PokemonRepository){

    suspend operator fun invoke(): Pokemon?{
        val pokemons = repository.getAllPokemonsFromDatabase()
        if (!pokemons.isNullOrEmpty()){
            val randomNum = (pokemons.indices).random()
            return  pokemons[randomNum]
        }else{
            return null
        }
    }
}