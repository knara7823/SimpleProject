package com.app.simpleproject.view

import android.os.Bundle
import android.util.Log
import android.view.View.OnClickListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.simpleproject.databinding.ActivityMainBinding
import com.app.simpleproject.viewModel.MovieListViewModel

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    private var movieAdapter:MovieAdapter?=null
    private var movieVIewModel:MovieListViewModel?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(this.root)
            binding = this
        }
        movieVIewModel = ViewModelProvider(this)[MovieListViewModel::class.java]
        setupRecyclerView()


    }

    private fun setupRecyclerView(){
        movieVIewModel?.let { viewModel ->
            movieAdapter = MovieAdapter(viewModel.list, this@MainActivity){
                val movie = it
                binding?.let {
                    supportFragmentManager.beginTransaction().replace(it.main.id, FragmentMovieInfo(movie))
                        .addToBackStack(null)
                        .commit()
                }

            }
        }
        binding?.recyclerView?.apply {
            adapter = movieAdapter
            layoutManager = GridLayoutManager(this@MainActivity, 2)
        }

    }

}