package by.savushkin.study.geekbrains.kinopoisk_films.domain.usecase

import by.savushkin.study.geekbrains.kinopoisk_films.domain.model.FilmData
import by.savushkin.study.geekbrains.kinopoisk_films.domain.repository.FilmRepository

class GetFilmsListUC (private val filmRepository: FilmRepository) {
    fun execute(): List<FilmData> =
        filmRepository.getFilmsList()
}