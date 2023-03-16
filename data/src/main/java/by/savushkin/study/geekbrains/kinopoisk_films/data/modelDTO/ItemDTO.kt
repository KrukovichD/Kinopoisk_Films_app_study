package by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO


import com.google.gson.annotations.SerializedName

data class ItemDTO(
    @SerializedName("logo")
    val logo: LogoDTO,
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)