package by.savushkin.study.geekbrains.kinopoisk_films

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import by.savushkin.study.geekbrains.kinopoisk_films.domain.model.FilmData

class FilmsListViewModel : ViewModel() {
    private val _films = MutableLiveData<List<FilmData>>()
    val films: LiveData<List<FilmData>> = _films


    fun getList() {
        val list = ArrayList<FilmData>()
        list.add(
            FilmData(
                id = 462682,
                name = "Волк с Уолл-стрит",
                posterUrl = "https://st.kp.yandex.net/images/film_big/462682.jpg"
            )
        )
        list.add(
            FilmData(
                id = 1318972,
                name = "Гнев человеческий",
                posterUrl = "https://st.kp.yandex.net/images/film_big/1318972.jpg"
            )
        )
        _films.postValue(list)
    }
}

class SleepTrackerViewModelFactory() : ViewModelProvider.Factory {
    internal fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FilmsListViewModel::class.java)) {
            return FilmsListViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}