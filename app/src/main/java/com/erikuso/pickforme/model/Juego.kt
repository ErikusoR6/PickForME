package com.erikuso.pickforme.model

data class Juego(
    val nombreJuego: String,
    val siglas: String,
    val numeroPersonajes: Int,
    val roles: List<Rol>)

val juegosEjemplo = listOf(
    Juego("Marvel Rivals","MR",55,listOf(Rol.TANQUE, Rol.DPS, Rol.SOPORTE)),
    Juego("Overwatch","OW",54,listOf(Rol.TANQUE, Rol.DPS, Rol.SOPORTE)),
    Juego("Rainbow Six Siege","R6",78,listOf(Rol.ATACANTE, Rol.DEFENSOR)),
    Juego("League of Legends","LoL",173,listOf(Rol.TOP, Rol.JUNGLA, Rol.MEDIO,Rol.ADC, Rol.SOPORTE))
)

