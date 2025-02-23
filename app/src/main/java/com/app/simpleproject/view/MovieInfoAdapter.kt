package com.app.simpleproject.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.app.simpleproject.databinding.MovieCastBinding
import com.app.simpleproject.databinding.MoviePosterBinding
import com.app.simpleproject.model.Movie
import com.bumptech.glide.Glide

class MovieInfoAdapter(private val movies:Movie, private val context:Context):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val posterView: Int = 0
    private val castView: Int = 1

    private var binding: ViewBinding?=null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            posterView -> {
                PosterViewHolder(MoviePosterBinding.inflate(LayoutInflater.from(parent.context), parent, false)).apply {
                    binding = MoviePosterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                }
            }
            else -> {
                CastViewHolder(MovieCastBinding.inflate(LayoutInflater.from(parent.context), parent, false)).apply {
                    binding = MovieCastBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                }
            }

        }
    }

    override fun getItemCount(): Int {
        return 2
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is CastViewHolder -> {
                holder.castList.adapter = CastAdapter(movies.actors)
                holder.castList.layoutManager = LinearLayoutManager(context)
            }
            is PosterViewHolder -> {
                Glide.with(context).load(movies.image).into(holder.moviePoster)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
//        return when(position){
//            0 -> posterView
//            else -> castView
//        }

        return if(position == 0) posterView else castView
    }
}

class PosterViewHolder(private val itemview:MoviePosterBinding):RecyclerView.ViewHolder(itemview.root){
    val moviePoster = itemview.moviePoster
}
class CastViewHolder(private val itemview: MovieCastBinding):RecyclerView.ViewHolder(itemview.root){
    val castList = itemview.castList
}