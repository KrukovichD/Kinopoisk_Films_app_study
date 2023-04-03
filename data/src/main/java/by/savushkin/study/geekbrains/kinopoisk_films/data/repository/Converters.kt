package by.savushkin.study.geekbrains.kinopoisk_films.data.repository

import by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO.FilmDTO
import by.savushkin.study.geekbrains.kinopoisk_films.domain.model.FilmData
import by.savushkin.study.geekbrains.kinopoisk_films.domain.model.FilmItemList

internal class Converters {

    fun fIlmListToFilmDataList(_filmList: List<FilmDTO>): List<FilmData> =
        ArrayList<FilmData>().apply {
            for (film in _filmList) {
                this.add(
                    filmToFilmData(film)
                )
            }
        }

    fun filmToFilmData(film: FilmDTO): FilmData =
        FilmData(
            filmItem = filmToFilmItem(film),
            ratingAwait = film.rating.await,
            movieLength = film.movieLength,
            year = film.year,
            description = film.description,
        )

    fun filmToFilmItem(film: FilmDTO): FilmItemList =
        FilmItemList(
            id = film.id,
            name = film.name,
            posterUrl = film.poster.url
        )
}