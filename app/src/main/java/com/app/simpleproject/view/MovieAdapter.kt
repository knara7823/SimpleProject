package com.app.simpleproject.view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.simpleproject.databinding.MovieItemBinding
import com.app.simpleproject.model.Movie
import com.bumptech.glide.Glide

class MovieAdapter(private val movies: List<Movie>, private val context: Context, private val onItemClick: (Movie) -> Unit) :
    RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = MovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(view) {
            onItemClick(movies[it])
        }
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        Glide.with(context).load(movies[position].image).into(holder.imageView)
        holder.itemView.setOnClickListener {

        }
    }
}

class MovieViewHolder(itemView: MovieItemBinding, private var onItemCLick: (Int) -> Unit) :
    RecyclerView.ViewHolder(itemView.root) {
    init {
        itemView.moviePic.setOnClickListener {
            onItemCLick(adapterPosition)
        }
    }

    val imageView = itemView.moviePic
}