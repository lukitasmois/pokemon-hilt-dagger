package com.example.borrar2.data.network

import com.example.borrar2.data.model.PokemonModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class PokemonService @Inject constructor(private val service : PokemonApiClient){

    suspend fun getPokemon(): List<PokemonModel>{
        return withContext(Dispatchers.IO) {
            val response = service.getUrlsPokemons()
            response.body() ?: emptyList()
        }
    }
}