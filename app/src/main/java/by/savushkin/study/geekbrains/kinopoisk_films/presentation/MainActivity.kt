package by.savushkin.study.geekbrains.kinopoisk_films.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import by.savushkin.study.geekbrains.kinopoisk_films.App
import by.savushkin.study.geekbrains.kinopoisk_films.MainViewModel
import by.savushkin.study.geekbrains.kinopoisk_films.R
import by.savushkin.study.geekbrains.kinopoisk_films.presentation.fragments.MainViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModelFactory: MainViewModelFactory
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (applicationContext as App).appComponent.inject(this)
        viewModel = ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]
    }
}