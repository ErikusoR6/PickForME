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
        habilidades = listOf("Pulso Telepático", "Escudo Mental", "Forma de Diamante","Lanza Psíquica", "Seduccion Psiónica")
    ),
    Personaje(
        nombre = "Moon Knight",
        siglas = "MK",
        rol = Rol.DPS,
        descripcion = "Al ser el avatar del dios egipcio de la venganza, el mismísimo Konshu mejoró el cuerpo de Marc Spector. " +
                "Moon Knight, envuelto en un aura luminosa que atraviesa la oscuridad, surca la noche, listo para hacer arder " +
                "a sus enemigos con los Ankhs sagrados de su maestro.",
        habilidades = listOf("Dardo Creciente", "Cuchilla Lunar", "Gancho Lunar","Ankh Ancestral", "Mano de Khonshu")
    ),
    Personaje(
        nombre = "Gambito",
        siglas = "G",
        rol = Rol.SOPORTE,
        descripcion = "Encantador y de espíritu libre, Remy LeBeau manipula la energía cinética con una habilidad incomparable. " +
                "Con un movimiento de muñeca, sus cartas de juego cargadas se convierten en proyectiles explosivos para los enemigos " +
                "o curan a sus aliados mediante el cambio cinético. Cuando el carismático Gambito ilumina el campo de batalla, ¡siempre juega para ganar!",
        habilidades = listOf("Embestida del Bayou", "Carga Cajún", "Corazones Curativos","Rompiendo Picas", "Escalera Real Furiosa")
    ),
)