package by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO


import com.google.gson.annotations.SerializedName

data class WatchabilityDTO(
    @SerializedName("items")
    val items: List<ItemDTO>
)