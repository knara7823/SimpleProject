package com.app.simpleproject.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.simpleproject.databinding.FragmentMovieInfoBinding
import com.app.simpleproject.model.Movie

class FragmentMovieInfo(private val movie:Movie):Fragment() {
    private var binding:FragmentMovieInfoBinding?=null
    private var movieInfoAdapter: MovieInfoAdapter?=null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = FragmentMovieInfoBinding.inflate(layoutInflater, container, false).apply {
            binding = this
        }
        return view.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        movieInfoAdapter = MovieInfoAdapter(movie, requireContext())
        binding?.apply {
            recyclerView.adapter =movieInfoAdapter
            recyclerView.layoutManager = LinearLayoutManager(requireContext())
        }
    }
}