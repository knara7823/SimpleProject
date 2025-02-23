package com.app.simpleproject.model

data class Movie(
    val image:String,
    val title:String,
    val data: Data,
    val actors:List<Actor>
)


data class Actor(
    val name:String,
    val profession:Profession,
    val url:String
)

enum class Profession{
    DIRECTOR, ACTOR, ACTRESS
}


enum class Data{
    CAST, POSTER
}