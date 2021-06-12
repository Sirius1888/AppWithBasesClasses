package com.example.finishedproject

import android.app.Application
import com.example.finishedproject.di.networkRepository
import com.example.finishedproject.di.repositoryModule
import com.example.finishedproject.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

class FinishApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@FinishApp)
            inject()
        }

    }

    private fun inject() = loadKoinModules

    private val loadKoinModules by lazy {
        loadKoinModules(listOf(viewModelModule, repositoryModule, networkRepository))
    }
}




