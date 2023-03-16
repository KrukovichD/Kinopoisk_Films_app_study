package by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO


import com.google.gson.annotations.SerializedName

data class VotesDTO(
    @SerializedName("await")
    val await: Int,
    @SerializedName("filmCritics")
    val filmCritics: Int,
    @SerializedName("imdb")
    val imdb: Int,
    @SerializedName("kp")
    val kp: Int,
    @SerializedName("russianFilmCritics")
    val russianFilmCritics: Int
)