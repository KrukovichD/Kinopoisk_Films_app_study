package by.savushkin.study.geekbrains.kinopoisk_films.data.repository

import by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO.FilmDTO
import by.savushkin.study.geekbrains.kinopoisk_films.data.network.NetworkRepository
import by.savushkin.study.geekbrains.kinopoisk_films.data.storage.repository.FilmsStorage
import by.savushkin.study.geekbrains.kinopoisk_films.domain.model.FilmData
import by.savushkin.study.geekbrains.kinopoisk_films.domain.repository.FilmRepository


class FilmRepositoryImpl (private val filmsStorage: FilmsStorage, private val networkRepository: NetworkRepository) : FilmRepository {

    fun saveFilm(filmDTO: FilmDTO): Boolean =
        filmsStorage.save(filmDTO)

    override fun getFilmsList(): List<FilmData> =
        Converters().fIlmListToFilmDataList(filmsStorage.getList())

    override fun getFilmById(id: Int): FilmData? =
        Converters().filmToFilmData(filmsStorage.getById(id))




}