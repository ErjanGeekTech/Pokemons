package com.example.pokemons.models

import com.google.gson.annotations.SerializedName

data class Sprites(
    @SerializedName("backDefault")
    val backDefault: String,

    @SerializedName("front_default")
    val front_default: String,

    @SerializedName("backShiny")
    val backShiny: String,

    @SerializedName("frontShiny")
    val frontShiny: String,

    @SerializedName("other")
    val other: Other
)