package com.example.borrar2.data.model

import com.google.gson.annotations.SerializedName


//data que se va a encargar de crear el pokemon mediante retrofit
data class PokemonModel(
    @SerializedName("name") val name : String,
    @SerializedName("url") val url : String
)
