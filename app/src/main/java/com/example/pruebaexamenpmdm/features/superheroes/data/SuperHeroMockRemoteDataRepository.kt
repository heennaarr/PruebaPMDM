package com.example.pruebaexamenpmdm.features.superheroes.data

import com.example.pruebaexamenpmdm.features.superheroes.domain.Superhero

class SuperHeroMockRemoteDataRepository {

    val superheroes = listOf(
        Superhero("1", "Spiderman" , "Telarañas","https://upload.wikimedia.org/wikipedia/commons/5/52/Spider-Man.jpg"),
        Superhero("2", "Batman" , "Intelecto" , "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRp6bQa-oRymMK6pBhXmsKGaenNpIAj2mYVXg&s" ),
        Superhero("3" , "Hulk", "Fuerza" , "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFcsgxvOEity9i8dfQaq7TpPB1VDofsyb9ig&s")

    )

    fun getSuperheroes(): List<Superhero>{
        return superheroes
    }


}