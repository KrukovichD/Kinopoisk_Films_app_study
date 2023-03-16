package by.savushkin.study.geekbrains.kinopoisk_films.data.modelDTO


import by.savushkin.study.geekbrains.kinopoisk_films.data.network.modelDTO.ExternalIdDTO
import com.google.gson.annotations.SerializedName

data class FilmDTO(
    @SerializedName("alternativeName")
    val alternativeName: String = "",
    @SerializedName("color")
    val color: String = "",
    @SerializedName("description")
    val description: String = "",
    @SerializedName("enName")
    val enName: String = "",
    @SerializedName("externalId")
    val externalId: ExternalIdDTO? = null,
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("logo")
    val logo: LogoDTO? = null,
    @SerializedName("movieLength")
    val movieLength: Int = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("names")
    val names: List<NameDTO>? = null,
    @SerializedName("poster")
    val poster: PosterDTO,
    @SerializedName("rating")
    val rating: RatingDTO,
    @SerializedName("releaseYears")
    val releaseYears: List<ReleaseYearDTO>? = null,
    @SerializedName("shortDescription")
    val shortDescription: String = "",
    @SerializedName("type")
    val type: String = "",
    @SerializedName("votes")
    val votes: VotesDTO? = null,
    @SerializedName("watchability")
    val watchability: WatchabilityDTO? = null,
    @SerializedName("year")
    val year: Int = 0
)