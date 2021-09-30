package com.example.pokemons.models

data class PokemonResponse(
    val next: String,
    val previous: Int,
    val count: Int,
    val results: List<ResultsItem>
)