package com.example.pokemons

import android.app.Application
import com.example.pokemons.modules.networkModule
import com.example.pokemons.modules.repositoryModule
import com.example.pokemons.modules.vmModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            // Koin Android logger
            androidLogger()
            //inject Android context
            androidContext(this@App)
            // use modules
            modules(listOf(networkModule, repositoryModule, vmModule))
        }
    }

}