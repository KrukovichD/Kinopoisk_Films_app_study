package by.savushkin.study.geekbrains.kinopoisk_films.data.network

import by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO.FilmDTO


interface NetworkRepository {
    fun getListFilms(): List<FilmDTO>
}