package com.example.pruebaexamenpmdm.features.superheroes.domain

interface SuperheroRepository {
    fun getSuperheroes(): List<Superhero>
}