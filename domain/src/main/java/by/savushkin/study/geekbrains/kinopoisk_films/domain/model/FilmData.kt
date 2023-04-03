package by.savushkin.study.geekbrains.kinopoisk_films.domain.model

data class FilmData(
    val filmItem: FilmItemList,    //Основные данные по фильму
    val ratingAwait: Double,       //Рейтинг (по ожиданиям)
    val movieLength: Int,          //Продолжительность
    val year: Int,                 //Год выхода
    val description: String,       //Описание

)
