package com.example.pokemons.models

import com.google.gson.annotations.SerializedName

data class ResultsItem(
    @SerializedName("name")
    val name: String,

    @SerializedName("url")
    val url: String
)