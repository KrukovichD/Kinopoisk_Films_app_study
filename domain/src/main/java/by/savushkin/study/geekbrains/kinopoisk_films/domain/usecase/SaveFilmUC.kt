package by.savushkin.study.geekbrains.kinopoisk_films.domain.usecase

import by.savushkin.study.geekbrains.kinopoisk_films.domain.model.FilmData
import by.savushkin.study.geekbrains.kinopoisk_films.domain.repository.FilmRepository

class SaveFilmUC(private val filmRepository: FilmRepository) {
    /* fun execute(filmData: FilmData): Boolean =
        filmRepository.saveFilm(

            //затычка
            FilmData(
                id = 462682,
                name = "Волк с Уолл-стрит",
                posterUrl = "https://st.kp.yandex.net/images/film_big/462682.jpg"
            )
        )

        */

}