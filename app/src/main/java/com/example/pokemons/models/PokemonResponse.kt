package com.example.pokemons.models

import com.google.gson.annotations.SerializedName

data class PokemonResponse(
    @SerializedName("next")
    val next: String,

    @SerializedName("previous")
    val previous: Int,

    @SerializedName("count")
    val count: Int,

    @SerializedName("results")
    val results: List<ResultsItem>
)