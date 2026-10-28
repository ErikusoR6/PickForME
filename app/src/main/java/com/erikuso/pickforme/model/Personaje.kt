package com.erikuso.pickforme.model

enum class Rol(val etiqueta: String) {
    TANQUE("Tanque"),
    DPS("DPS"),
    SOPORTE("Soporte")
}

data class Personaje(
    val nombre: String,
    val siglas: String,
    val rol: Rol,
    val descripcion: String,
    val habilidades: List<String>
)

val personajesEjemplo = listOf(
    Personaje(
        nombre = "Emma Frost",
        siglas = "EF",
        rol = Rol.TANQUE,
        descripcion = "Para Emma Frost, la guerra es la forma más pura de arte. Con sus formidables habilidades telepáticas, " +
                "teje intrincadamente una red mental mortal que atrapa a sus enemigos, mientras que su indestructible forma de " +
                "diamante le permite liderar a sus compañeros sin miedo a la refriega. ¡Siempre elegante y serena, Emma reina como " +
                "la única y verdadera reina del campo de batalla!",
        habilidades = listOf("Habilidad 1", "Habilidad 2", "Habilidad 3","Habilidad 4", "Definitiva")
    ),

)