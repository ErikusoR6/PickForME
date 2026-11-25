package com.erikuso.pickforme.ui.viewmodel


import com.erikuso.pickforme.model.Personaje
import com.erikuso.pickforme.model.Rol

data class PaginaRuletaUiState(
    val  nombreJuego: String ="",
    val personajes: List<Personaje> = emptyList(),
    val personajeSeleccionado: Personaje? = null,
    val volverSolicitado: Boolean = false,
    val roles: List<Rol> = emptyList(),
    val rolSeleccionado: Rol? = null
) {
    val personajesFiltrados: List<Personaje>
        get() = if (rolSeleccionado == null) personajes
        else personajes.filter { it.rol == rolSeleccionado }
}


