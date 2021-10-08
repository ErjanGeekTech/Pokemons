package com.example.pokemons.modules

import com.example.pokemons.data.network.apiservices.PokemonApiService
import com.example.pokemons.data.repositories.PokemonRepository
import com.example.pokemons.ui.fragments.pokemons.PokemonViewModel
import com.example.pokemons.utils.Constants
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
    single {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    single { get<Retrofit>().create(PokemonApiService::class.java) }
}

val repositoryModule = module {
    factory { PokemonRepository(get()) }
}

val vmModule = module {
    viewModel { PokemonViewModel(get()) }
}