package com.example.borrar2.domain.model

import com.example.borrar2.data.database.entities.PokemonEntity
import com.example.borrar2.data.model.PokemonModel


data class Pokemon(
    val name : String,
    val url : String
)

fun PokemonModel.toDomain() = Pokemon(name, url)

fun PokemonEntity.toDomain() = Pokemon(name, url)
