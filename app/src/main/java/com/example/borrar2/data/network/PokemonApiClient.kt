package com.example.borrar2.data.network

import com.example.borrar2.data.model.PokemonModel
import retrofit2.Response
import retrofit2.http.GET

interface PokemonApiClient {

    @GET("api/v2/pokemon/1")
    fun getUrlsPokemons() : Response<PokemonModel>

}