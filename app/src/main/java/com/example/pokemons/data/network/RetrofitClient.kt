package com.example.pokemons.data.network

import com.example.pokemons.data.network.apiservices.PokemonApiService
import com.example.pokemons.utils.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun providePokemonApiService(): PokemonApiService {
        return retrofit.create(PokemonApiService::class.java)
    }

}