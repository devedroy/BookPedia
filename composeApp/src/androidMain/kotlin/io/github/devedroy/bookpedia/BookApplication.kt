package io.github.devedroy.bookpedia

import android.app.Application
import io.github.devedroy.bookpedia.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class BookApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@BookApplication)
            androidLogger()
        }
    }
}