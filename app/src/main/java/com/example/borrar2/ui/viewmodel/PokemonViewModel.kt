package com.example.borrar2.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.borrar2.domain.GetPokemonUseCase
import com.example.borrar2.domain.GetRandomPokemonUseCase
import com.example.borrar2.domain.model.Pokemon
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class PokemonViewModel @Inject constructor(
    private val getPokemonsUseCase : GetPokemonUseCase, //trae pokemons de api
    private val getRandomPokemonUseCase: GetRandomPokemonUseCase

): ViewModel(){

    val pokemonModel = MutableLiveData<Pokemon>()
    val isLoading = MutableLiveData<Boolean>()

    fun onCreate(){
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getPokemonsUseCase()

            if(!result.isNullOrEmpty()){
                pokemonModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun randomPokemo(){
        viewModelScope.launch {
            isLoading.postValue(true)
            val pokemon = getRandomPokemonUseCase()
            pokemon?.let {
                pokemonModel.value = it
            }
            isLoading.postValue(false)
        }
    }
}

