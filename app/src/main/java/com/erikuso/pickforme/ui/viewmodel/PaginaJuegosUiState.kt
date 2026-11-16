package com.erikuso.pickforme.ui.viewmodel

import com.erikuso.pickforme.model.Juego

data class PaginaJuegosUiState(
    val  juegos: List<Juego> ,
    val juegoElegido: Juego? = null
)
