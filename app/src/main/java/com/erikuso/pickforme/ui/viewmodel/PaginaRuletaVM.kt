package com.erikuso.pickforme.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.erikuso.pickforme.model.personajesEjemplo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class PaginaRuletaVM : ViewModel() {
    private val _uiState = MutableStateFlow(PaginaRuletaUiState())
    val uiState: StateFlow<PaginaRuletaUiState> = _uiState.asStateFlow()

    fun onJuegoCargado(nombreJuego: String) {
        val personajesDelJuego = personajesEjemplo.filter { it.juego == nombreJuego }
        _uiState.update {
            it.copy(
                nombreJuego = nombreJuego,
                personajes = personajesDelJuego,
                personajeSeleccionado = personajesDelJuego.firstOrNull(),
                volverSolicitado = false
            )
        }
    }

    fun onGirar() {
        _uiState.update { estado ->
            if (estado.personajes.isEmpty()) {
                estado
            } else {
                estado.copy(personajeSeleccionado = estado.personajes.random())
            }
        }
    }

    fun onAjusteClick() {

    }

    fun onAtras(){
        _uiState.update { it.copy(volverSolicitado = true) }
    }

    fun onVolverAtendido(){
        _uiState.update { it.copy(volverSolicitado = false) }
    }


}