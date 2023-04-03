package by.savushkin.study.geekbrains.kinopoisk_films

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import by.savushkin.study.geekbrains.kinopoisk_films.domain.model.FilmItemList
import by.savushkin.study.geekbrains.kinopoisk_films.domain.usecase.GetFilmDetailUC
import by.savushkin.study.geekbrains.kinopoisk_films.domain.usecase.GetFilmsListUC
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield
import javax.inject.Inject


class MainViewModel @Inject constructor(
    private val getFilmsListUC: GetFilmsListUC,
    private val getFilmDetailUC: GetFilmDetailUC
) : ViewModel() {
    private val _films = MutableLiveData<List<FilmItemList>>()
    val films: LiveData<List<FilmItemList>> = _films

    private val errorHandler = CoroutineExceptionHandler { context, error ->
        logOut("Suspend Exception Result")
    }

    fun getList() {
        val list = ArrayList<FilmItemList>()
        list.add(
            FilmItemList(
                id = 462682,
                name = "Волк с Уолл-стрит",
                posterUrl = "https://st.kp.yandex.net/images/film_big/462682.jpg"
            )
        )
        list.add(
            FilmItemList(
                id = 1318972,
                name = "Гнев человеческий",
                posterUrl = "https://st.kp.yandex.net/images/film_big/1318972.jpg"
            )
        )
        _films.postValue(list)
    }

    fun fetchData() {
        viewModelScope.launch(errorHandler) {
            logOut("Suspend Fetch Started")
            val result = getFilmsListUC.execute()
            yield()
            val list = ArrayList<FilmItemList>()
            for (data in result)
                list.add(data.filmItem)
            _films.postValue(list)
        }
    }

    fun logOut(message: String) {
        Log.d("Track", "$message ${Thread.currentThread()}")
    }
}

