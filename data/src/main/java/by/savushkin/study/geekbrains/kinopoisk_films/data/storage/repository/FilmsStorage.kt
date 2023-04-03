package by.savushkin.study.geekbrains.kinopoisk_films.data.storage.repository

import by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO.FilmDTO


interface FilmsStorage {
    fun getById(Id: Int): FilmDTO

    fun getList(): List<FilmDTO>

    fun save(film: FilmDTO): Boolean
}
