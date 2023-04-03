package by.savushkin.study.geekbrains.kinopoisk_films

import android.app.Application
import by.savushkin.study.geekbrains.kinopoisk_films.di.AppComponent
import by.savushkin.study.geekbrains.kinopoisk_films.di.AppModule
import by.savushkin.study.geekbrains.kinopoisk_films.di.DaggerAppComponent

class App : Application() {


    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(context = this))
            .build()
    }
}


