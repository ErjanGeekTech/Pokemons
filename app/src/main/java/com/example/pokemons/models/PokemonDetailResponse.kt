package com.example.pokemons.models

data class PokemonDetailResponse(
    val types: List<TypesItem>?,
    val pokemon: Pokemon,
    val isBattleOnly: Boolean = false,
    val isDefault: Boolean = false,
    val sprites: Sprites,
    val versionGroup: VersionGroup,
    val name: String,
    val formOrder: Int = 0,
    val id: Int = 0,
    val formName: String = "",
    val isMega: Boolean = false,
    val order: Int = 0
)