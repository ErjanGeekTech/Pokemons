package com.example.pokemons.models

import com.google.gson.annotations.SerializedName

data class PokemonDetailResponse(
    @SerializedName("types")
    val types: List<TypesItem>,

    @SerializedName("pokemon")
    val pokemon: Pokemon,

    @SerializedName("isBattleOnly")
    val isBattleOnly: Boolean,

    @SerializedName("isDefault")
    val isDefault: Boolean,

    @SerializedName("sprites")
    val sprites: Sprites,

    @SerializedName("versionGroup")
    val versionGroup: VersionGroup,

    @SerializedName("name")
    val name: String,

    @SerializedName("formOrder")
    val formOrder: Int,

    @SerializedName("id")
    val id: Int,

    @SerializedName("formName")
    val formName: String,

    @SerializedName("isMega")
    val isMega: Boolean,

    @SerializedName("order")
    val order: Int
)