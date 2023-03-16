package by.savushkin.study.geekbrains.kinopoisk_films.data.network

import by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO.FilmDTO

class KinopoiskApiRepositiryImp: NetworkRepository {
    override fun getListFilms(): List<FilmDTO> {
        TODO("Not yet implemented")
    }
    private fun fetchData(){}
}
sealed class Result {
    class NetworkError(val message: String) : Result()
    class NetworkResult(val message: String) : Result()
}