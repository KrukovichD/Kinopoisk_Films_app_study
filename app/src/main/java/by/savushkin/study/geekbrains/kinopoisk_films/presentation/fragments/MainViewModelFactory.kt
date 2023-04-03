package by.savushkin.study.geekbrains.kinopoisk_films.presentation.fragments

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import by.savushkin.study.geekbrains.kinopoisk_films.MainViewModel
import by.savushkin.study.geekbrains.kinopoisk_films.domain.usecase.GetFilmDetailUC
import by.savushkin.study.geekbrains.kinopoisk_films.domain.usecase.GetFilmsListUC

class MainViewModelFactory(
    private val getFilmsListUC: GetFilmsListUC,
    private val getFilmDetailUC: GetFilmDetailUC
) : ViewModelProvider.Factory {

    @SuppressWarnings("Unchecked")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(
            getFilmsListUC = getFilmsListUC,
            getFilmDetailUC = getFilmDetailUC
        ) as T
    }
}