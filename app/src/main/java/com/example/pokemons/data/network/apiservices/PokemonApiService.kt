package com.example.pokemons.data.network.apiservices

import com.example.pokemons.models.PokemonDetailResponse
import com.example.pokemons.models.PokemonResponse
import com.example.pokemons.utils.Constants.END_POINT_ID_POKEMON
import com.example.pokemons.utils.Constants.END_POINT_POKEMON
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonApiService {

    @GET(END_POINT_POKEMON)
    suspend fun fetchPokemon(): Response<PokemonResponse>

    @GET(END_POINT_ID_POKEMON)
    suspend fun fetchIdPokemon(
        @Path("id") id: Int
    ): Response<PokemonDetailResponse>
}