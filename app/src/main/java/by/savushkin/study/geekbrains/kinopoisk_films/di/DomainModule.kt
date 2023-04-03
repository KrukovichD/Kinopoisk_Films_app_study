package by.savushkin.study.geekbrains.kinopoisk_films.di

import by.savushkin.study.geekbrains.kinopoisk_films.domain.repository.FilmRepository
import by.savushkin.study.geekbrains.kinopoisk_films.domain.usecase.GetFilmDetailUC
import by.savushkin.study.geekbrains.kinopoisk_films.domain.usecase.GetFilmsListUC
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideGetFilmDetailCase(filmRepository: FilmRepository):GetFilmDetailUC{
        return GetFilmDetailUC(filmRepository = filmRepository)
    }


    @Provides
    fun provideGetFilmListCase(filmRepository: FilmRepository):GetFilmsListUC{
        return GetFilmsListUC(filmRepository = filmRepository)
    }



}