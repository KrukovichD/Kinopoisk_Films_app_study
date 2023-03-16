package by.savushkin.study.geekbrains.kinopoisk_films.di

import by.savushkin.study.geekbrains.kinopoisk_films.presentation.MainActivity
import by.savushkin.study.geekbrains.kinopoisk_films.presentation.fragments.MainViewModelFactory
import dagger.Component

@Component(modules = [AppModule::class, DataModule::class, DomainModule::class, NetworkModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun viewModelsFactory(): MainViewModelFactory
}