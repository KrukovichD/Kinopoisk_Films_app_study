package by.savushkin.study.geekbrains.kinopoisk_films.domain.repository

import by.savushkin.study.geekbrains.kinopoisk_films.domain.model.FilmData

interface FilmRepository {

    fun getFilmById(id:Int): FilmData?

    fun getFilmsList(): List<FilmData>
}