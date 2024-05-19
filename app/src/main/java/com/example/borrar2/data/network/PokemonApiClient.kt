package com.example.borrar2.data.network

import com.example.borrar2.data.model.PokemonModel
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApiClient {

    @GET("pokemon/")
    fun getUrlsPokemons() : Response<List<PokemonModel>>

}