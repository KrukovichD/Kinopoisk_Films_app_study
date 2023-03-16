package by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO


import com.google.gson.annotations.SerializedName

data class RatingDTO(
    @SerializedName("await")
    val await: Double,
    @SerializedName("filmCritics")
    val filmCritics: Double,
    @SerializedName("imdb")
    val imdb: Double,
    @SerializedName("kp")
    val kp: Double,
    @SerializedName("russianFilmCritics")
    val russianFilmCritics: Double
)