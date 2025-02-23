package com.app.simpleproject.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.simpleproject.databinding.MovieCastItemBinding
import com.app.simpleproject.model.Actor

class CastAdapter(private val castList: List<Actor>) : RecyclerView.Adapter<CastItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CastItemViewHolder {
        val view = MovieCastItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CastItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return castList.size
    }

    override fun onBindViewHolder(holder: CastItemViewHolder, position: Int) {
        holder.apply {
            name.text = castList[position].name
            profession.text = castList[position].profession.name
        }
    }
}

class CastItemViewHolder(private val itemview: MovieCastItemBinding) :
    RecyclerView.ViewHolder(itemview.root) {
    val name = itemview.name
    val profession = itemview.profession
}