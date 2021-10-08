package com.example.pokemons.models

import com.google.gson.annotations.SerializedName

data class TypesItem(
    @SerializedName("slot")
    val slot: Int,

    @SerializedName("type")
    val type: Type
)