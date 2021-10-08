package com.example.pokemons.models

import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("dream_world")
    val dream_world: DreamWorld
)