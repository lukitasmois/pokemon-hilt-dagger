package com.example.borrar2.domain.model

import com.example.borrar2.data.database.entities.PokemonEntity
import com.example.borrar2.data.model.PokemonModel


data class Pokemon(
    val name : String
)

fun PokemonModel.toDomain() = Pokemon(name)

fun PokemonEntity.toDomain() = Pokemon(name)
