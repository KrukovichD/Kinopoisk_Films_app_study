package by.savushkin.study.geekbrains.kinopoisk_films.data.model

object Response {
    data class Result(val query: Query)
    data class Query(val searchinfo: SearchInfo)
    data class SearchInfo(val totalhits: Int)
}