package by.savushkin.study.geekbrains.kinopoisk_films.domain.usecase

import by.savushkin.study.geekbrains.kinopoisk_films.domain.repository.FilmRepository

class GetFilmDetailUC(private val filmRepository:FilmRepository) {
    fun execute(id:Int){
        filmRepository.getFilmById(id)
    }
}