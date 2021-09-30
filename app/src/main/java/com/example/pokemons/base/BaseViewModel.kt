package com.example.pokemons.base

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job

open class BaseViewModel : ViewModel() {
    private val job = Job()
    val uiScope = CoroutineScope(Dispatchers.Main.plus(job))
}