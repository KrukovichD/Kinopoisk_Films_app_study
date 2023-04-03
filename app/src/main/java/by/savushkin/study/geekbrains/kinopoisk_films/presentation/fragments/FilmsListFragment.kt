package by.savushkin.study.geekbrains.kinopoisk_films.presentation.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import by.savushkin.study.geekbrains.kinopoisk_films.App
import by.savushkin.study.geekbrains.kinopoisk_films.MainViewModel
import by.savushkin.study.geekbrains.kinopoisk_films.R
import by.savushkin.study.geekbrains.kinopoisk_films.databinding.FilmsItemBinding
import by.savushkin.study.geekbrains.kinopoisk_films.databinding.FragmentFilmsListBinding
import by.savushkin.study.geekbrains.kinopoisk_films.di.AppComponent
import by.savushkin.study.geekbrains.kinopoisk_films.domain.model.FilmItemList

class FilmsListFragment : Fragment() {
    private var _binding: FragmentFilmsListBinding? = null
    private val recyclerViewAdapter = RecyclerViewAdapter()
    private val viewModel: MainViewModel by viewModels { getAppComponent().viewModelsFactory() }

    private fun Fragment.getAppComponent(): AppComponent =
        (requireNotNull(activity).application as App).appComponent

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFilmsListBinding.inflate(
            inflater, container, false
        )
        val manager = GridLayoutManager(activity, 2)

        _binding!!.rvListFilms.layoutManager = manager

        _binding!!.rvListFilms.adapter = recyclerViewAdapter

        viewModel.fetchData()
        //viewModel.getList()

        viewModel.films.observe(
            viewLifecycleOwner
        ) {
            if (it != null) {
                recyclerViewAdapter.setItems(it)
            }
        }

        recyclerViewAdapter.onItemClickListener = {
            Log.d("fs", "onClick")
            val bundle = Bundle().apply {
                putInt("id", it.id)
            }
            findNavController().navigate(R.id.filmDetailFragment, bundle)
        }
        return _binding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

private class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val items = mutableListOf<FilmItemList>()
    var onItemClickListener: ((FilmItemList) -> Unit)? = null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = ViewHolder(
        FilmsItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.binding.cvFilmCard.setOnClickListener {
            onItemClickListener?.invoke(items[position])
        }
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    fun setItems(
        items: List<FilmItemList>
    ) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    class ViewHolder(
        val binding: FilmsItemBinding
    ) : RecyclerView.ViewHolder(
        binding.root
    ) {

        fun bind(
            filmItem: FilmItemList
        ) = with(binding) {
            //ivPoster
            tvFilmFame.text = filmItem.name
        }
    }
}