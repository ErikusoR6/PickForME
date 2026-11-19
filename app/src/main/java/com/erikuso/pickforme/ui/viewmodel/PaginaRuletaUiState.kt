package com.erikuso.pickforme.ui.viewmodel


import com.erikuso.pickforme.model.Personaje

data class PaginaRuletaUiState(
    val  nombreJuego: String ="",
    val personajes: List<Personaje> = emptyList(),
    val personajeSeleccionado: Personaje? = null,
    val volverSolicitado: Boolean = false
)
