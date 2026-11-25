package com.erikuso.pickforme.model

enum class Rol(val etiqueta: String) {
    TANQUE("Tanque"),
    DPS("DPS"),
    SOPORTE("Soporte"),

    ATACANTE("Atacante"),

    DEFENSOR("Defensor"),

    TOP("Top"),

    JUNGLA("Jungla"),

    MEDIO("Medio"),

    ADC("Adc"),
}

data class Personaje(
    val nombre: String,
    val siglas: String,
    val juego: String,
    val rol: Rol,
    val descripcion: String,
    val habilidades: List<String>,
    val imagenUr1: String = "",
    val imagenSplashArt: String = ""
)

val personajesEjemplo = personajesMarvelRivals + personajesOverwatch + personajesRainbowSix + personajesLoL;