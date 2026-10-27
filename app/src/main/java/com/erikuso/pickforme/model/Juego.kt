package com.erikuso.pickforme.model

data class Juego(val nombreJuego: String, val siglas: String, val numeroPersonajes: Int )

val juegosEjemplo = listOf(
    Juego("Marvel Rivals","MR",54),
    Juego("Overwatch","OW",54),
    Juego("Rainbow Six Siege","R6",78),
    Juego("League of Legends","LoL",173)

)

