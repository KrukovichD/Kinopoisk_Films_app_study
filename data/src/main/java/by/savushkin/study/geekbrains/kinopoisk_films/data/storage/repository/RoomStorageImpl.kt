package by.savushkin.study.geekbrains.kinopoisk_films.data.storage.repository

import android.content.Context
import by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO.FilmDTO
import by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO.PosterDTO
import by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO.RatingDTO


//Реализация потом
class RoomStorageImpl(context: Context) : FilmsStorage {
    override fun getById(Id: Int): FilmDTO {
        return FilmDTO(
            id = 462682,
            name = "Волк с Уолл-стрит",
            poster = PosterDTO(
                previewUrl = "",
                url = "https://st.kp.yandex.net/images/film_big/462682.jpg"
            ),
            rating = RatingDTO(
                await = 6.1,
                filmCritics = 0.0,
                imdb = 0.0,
                kp = 0.0,
                russianFilmCritics = 0.0
            )
        )
    }

    override fun getList(): List<FilmDTO> {
        val list = ArrayList<FilmDTO>()
        list.add(
            FilmDTO(
                id = 462682,
                name = "Волк с Уолл-стрит",
                poster = PosterDTO(
                    previewUrl = "",
                    url = "https://st.kp.yandex.net/images/film_big/462682.jpg"
                ),
                rating = RatingDTO(
                    await = 6.1,
                    filmCritics = 0.0,
                    imdb = 0.0,
                    kp = 0.0,
                    russianFilmCritics = 0.0
                )
            )
        )
        return list

    }

    override fun save(film: FilmDTO): Boolean {
        return true
    }
}