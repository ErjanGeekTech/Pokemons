package com.example.pokemons.utils

fun isCapitalizing(type: String) =
    type.replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(
            java.util.Locale.getDefault()
        ) else it.toString()
    }