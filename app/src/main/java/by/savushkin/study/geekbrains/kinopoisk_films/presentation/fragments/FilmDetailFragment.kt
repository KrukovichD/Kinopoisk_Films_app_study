package by.savushkin.study.geekbrains.kinopoisk_films.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.savushkin.study.geekbrains.kinopoisk_films.databinding.FragmentFilmDetailBinding


class FilmDetailFragment : Fragment() {
    private var _binding: FragmentFilmDetailBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFilmDetailBinding.inflate(
            inflater, container, false)
        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       _binding!!.tvId.text = arguments?.getInt("id").toString()

    }
}