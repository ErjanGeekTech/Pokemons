package com.example.pokemons.data.repositories

import com.example.pokemons.data.network.apiservices.PokemonApiService

class PokemonRepository constructor(private val service: PokemonApiService) {

    suspend fun fetchPokemon() = service.fetchPokemon()
    suspend fun fetchIdPokemon(id: Int) = service.fetchIdPokemon(id)

}