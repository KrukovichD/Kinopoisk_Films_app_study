package by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO


import com.google.gson.annotations.SerializedName

data class ReleaseYearDTO(
    @SerializedName("end")
    val end: Int,
    @SerializedName("start")
    val start: Int
)