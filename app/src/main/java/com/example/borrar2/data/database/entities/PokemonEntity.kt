package com.example.borrar2.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.borrar2.domain.model.Pokemon


//clase que se encarga de crear el pokemon mediante la base de datos
@Entity(tableName = "pokemon_table")
data class PokemonEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "name") val name: String,

)

fun Pokemon.toDataBase () = PokemonEntity(name = name)