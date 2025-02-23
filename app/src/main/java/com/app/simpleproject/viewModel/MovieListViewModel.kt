package com.app.simpleproject.viewModel

import androidx.lifecycle.ViewModel
import com.app.simpleproject.model.Actor
import com.app.simpleproject.model.Data
import com.app.simpleproject.model.Movie
import com.app.simpleproject.model.Profession

class MovieListViewModel : ViewModel() {
    val list = mutableListOf<Movie>()

    init {
        list.add(
            Movie(
                "https://images.atomtickets.com/image/upload/w_520,h_780,q_auto/v1730654751/ingestion-images-archive-prod/archive/1730654751128_333994_cops_0.jpg",
                "Paddington",
                Data.POSTER, mutableListOf<Actor>().apply {
                    add(Actor("John Swing", Profession.DIRECTOR, ""))
                    add(Actor("John Swing", Profession.ACTOR, ""))
                    add(Actor("John Swing", Profession.ACTRESS, ""))
                    add(Actor("John Swing", Profession.ACTOR, ""))
                    add(Actor("John Swing", Profession.ACTRESS, ""))
                }
            )
        )
        list.add(
            Movie(
                "https://images.atomtickets.com/image/upload/w_520,h_780,q_auto/v1734629458/ingestion-images-archive-prod/archive/1734629457574_380851_cops_0.jpg",
                "Harry Potter",
                Data.POSTER, mutableListOf<Actor>().apply {
                    add(Actor("John Swing", Profession.DIRECTOR, ""))
                    add(Actor("John Swing", Profession.ACTOR, ""))
                    add(Actor("John Swing", Profession.ACTRESS, ""))
                    add(Actor("John Swing", Profession.ACTOR, ""))
                    add(Actor("John Swing", Profession.ACTRESS, ""))
                }
            )
        )
        list.add(
            Movie(
                "https://images.atomtickets.com/image/upload/w_520,h_780,q_auto/v1/ingestion-images-archive-prod/archive/49ab650b2591.jpg",
                "Suit Gandam",
                Data.POSTER, mutableListOf<Actor>().apply {
                    add(Actor("John Swing", Profession.DIRECTOR, ""))
                    add(Actor("John Swing", Profession.ACTOR, ""))
                    add(Actor("John Swing", Profession.ACTRESS, ""))
                    add(Actor("John Swing", Profession.ACTOR, ""))
                    add(Actor("John Swing", Profession.ACTRESS, ""))
                }
            )
        )
        list.add(
            Movie(
                "https://images.atomtickets.com/image/upload/w_520,h_780,q_auto/v1737746765/ingestion-images-archive-prod/archive/1737746765077_320187_cops_0.jpg",
                "The Unbreakable Boy",
                Data.POSTER, mutableListOf<Actor>().apply {
                    add(Actor("John Swing", Profession.DIRECTOR, ""))
                    add(Actor("John Swing", Profession.ACTOR, ""))
                    add(Actor("John Swing", Profession.ACTRESS, ""))
                    add(Actor("John Swing", Profession.ACTOR, ""))
                    add(Actor("John Swing", Profession.ACTRESS, ""))
                }
            )
        )
        list.add(
            Movie(
                "https://images.atomtickets.com/image/upload/w_520,h_780,q_auto/v1723680450/ingestion-images-archive-prod/archive/1723680450046_356955_cops_0.jpg",
                "Moana",
                Data.POSTER, mutableListOf<Actor>().apply {
                    add(Actor("John Swing", Profession.DIRECTOR, ""))
                    add(Actor("John Swing", Profession.ACTOR, ""))
                    add(Actor("John Swing", Profession.ACTRESS, ""))
                    add(Actor("John Swing", Profession.ACTOR, ""))
                    add(Actor("John Swing", Profession.ACTRESS, ""))
                }
            )
        )

    }

}