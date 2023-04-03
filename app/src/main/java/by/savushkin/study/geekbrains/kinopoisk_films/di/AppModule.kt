package by.savushkin.study.geekbrains.kinopoisk_films.di

import android.content.Context
import by.savushkin.study.geekbrains.kinopoisk_films.domain.usecase.GetFilmDetailUC
import by.savushkin.study.geekbrains.kinopoisk_films.domain.usecase.GetFilmsListUC
import by.savushkin.study.geekbrains.kinopoisk_films.presentation.fragments.MainViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class AppModule(val context: Context) {

    @Provides
    fun provideContext(): Context = context

    @Provides
    fun provideMainViewModelFactory(
        getFilmsListUC: GetFilmsListUC,
        getFilmDetailUC: GetFilmDetailUC
    ): MainViewModelFactory {
        return MainViewModelFactory(
            getFilmsListUC = getFilmsListUC,
            getFilmDetailUC = getFilmDetailUC
        )
    }


}