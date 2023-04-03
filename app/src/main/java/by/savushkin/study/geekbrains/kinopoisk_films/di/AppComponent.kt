package by.savushkin.study.geekbrains.kinopoisk_films.di

import by.savushkin.study.geekbrains.kinopoisk_films.data.di.DataModule
import by.savushkin.study.geekbrains.kinopoisk_films.data.di.NetworkModule
import by.savushkin.study.geekbrains.kinopoisk_films.presentation.MainActivity
import by.savushkin.study.geekbrains.kinopoisk_films.presentation.fragments.MainViewModelFactory
import dagger.Component
import javax.inject.Singleton

@Component(modules = [AppModule::class, DomainModule::class, DataModule::class, NetworkModule::class])
@Singleton
interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun viewModelsFactory(): MainViewModelFactory

}