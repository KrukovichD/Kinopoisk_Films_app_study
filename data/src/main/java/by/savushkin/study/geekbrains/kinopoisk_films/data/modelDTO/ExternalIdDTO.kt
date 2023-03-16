package by.savushkin.study.geekbrains.kinopoisk_films.data.network.modelDTO


import com.google.gson.annotations.SerializedName

data class ExternalIdDTO(
    @SerializedName("imdb")
    val imdb: String,
    @SerializedName("kpHD")
    val kpHD: String,
    @SerializedName("tmdb")
    val tmdb: Int
)