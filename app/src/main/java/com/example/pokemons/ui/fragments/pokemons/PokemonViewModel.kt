package com.example.pokemons.ui.fragments.pokemons

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.pokemons.base.BaseViewModel
import com.example.pokemons.data.repositories.PokemonRepository
import com.example.pokemons.models.PokemonDetailResponse
import com.example.pokemons.models.PokemonResponse
import kotlinx.coroutines.launch

class PokemonViewModel constructor(private val repository: PokemonRepository) :
    BaseViewModel() {
    val response = MutableLiveData<PokemonResponse>()

    init {
        fetchPokemon()
    }

    private fun fetchPokemon() {
        viewModelScope.launch {
            repository.fetchPokemon().let {
                if (it.isSuccessful) response.postValue(it.body())
                else Log.e("Error failed", "${it.code()}")
            }
        }
    }

    fun fetchIdPokemon(id: Int): MutableLiveData<PokemonDetailResponse> {
        val pokemonDetail = MutableLiveData<PokemonDetailResponse>()
        viewModelScope.launch {
            repository.fetchIdPokemon(id).let {
                if (it.isSuccessful) pokemonDetail.postValue(it.body())
                else Log.e("error failed", "${it.code()}")
            }
        }
        return pokemonDetail
    }
}