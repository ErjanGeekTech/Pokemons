package com.example.pokemons.utils

import androidx.fragment.app.Fragment

fun Fragment.isCapitalizing(type: String) =
    type.replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(
            java.util.Locale.getDefault()
        ) else it.toString()

    }