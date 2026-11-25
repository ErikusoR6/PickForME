package com.erikuso.pickforme.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.erikuso.pickforme.model.Rol
import com.erikuso.pickforme.model.juegosEjemplo
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
        val rolesDelJuego = juegosEjemplo.firstOrNull{it.nombreJuego == nombreJuego } ?.roles ?:emptyList()
        _uiState.update {
            it.copy(
                nombreJuego = nombreJuego,
                personajes = personajesDelJuego,
                roles = rolesDelJuego,
                personajeSeleccionado = personajesDelJuego.firstOrNull(),
                volverSolicitado = false,
                rolSeleccionado = null
            )
        }
    }

    fun onGirar() {
        _uiState.update { estado ->
            if (estado.personajesFiltrados.isEmpty()) {
                estado
            } else {
                estado.copy(personajeSeleccionado = estado.personajesFiltrados.random())
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

    fun onRolSeleccionado(rol: Rol?){
        _uiState.update { estado ->
            val nuevo = estado.copy(rolSeleccionado = rol)
            nuevo.copy(personajeSeleccionado = nuevo.personajesFiltrados.firstOrNull())
        }
    }


}