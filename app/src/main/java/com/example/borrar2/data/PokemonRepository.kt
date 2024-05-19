package com.example.borrar2.data

import com.example.borrar2.data.database.dao.PokemonDao
import com.example.borrar2.data.database.entities.PokemonEntity
import com.example.borrar2.data.model.PokemonModel
import com.example.borrar2.data.network.PokemonService
import com.example.borrar2.domain.model.Pokemon
import com.example.borrar2.domain.model.toDomain
import javax.inject.Inject

//rellenas el modelo con los pokemons que traes desde la api
class PokemonRepository @Inject constructor(
    private val remote: PokemonService,
    private val pokemonDao : PokemonDao
) {
    suspend fun getAllPokemonFromApi(): List<Pokemon>{
        val response : List<PokemonModel> = remote.getPokemon()
        return response.map { it.toDomain() }
    }

    suspend fun getAllPokemonsFromDatabase(): List<Pokemon>{
        val response: List<PokemonEntity> = pokemonDao.getAllPokemons()
        return response.map { it.toDomain() }
    }

    suspend fun insertPokemons(pokemons:List<PokemonEntity>){
        pokemonDao.insertAll(pokemons)
    }

    suspend fun clearPokemons(){
        pokemonDao.deleteAllPokemons()
    }
}