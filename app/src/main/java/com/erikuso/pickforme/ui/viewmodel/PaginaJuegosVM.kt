package com.erikuso.pickforme.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.erikuso.pickforme.model.Juego
import com.erikuso.pickforme.model.juegosEjemplo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class PaginaJuegosVM : ViewModel() {
    private val _uiState = MutableStateFlow(PaginaJuegosUiState(juegos = juegosEjemplo))
    val uiState: StateFlow<PaginaJuegosUiState> = _uiState.asStateFlow()
    fun onJuegoClick(juego: Juego){
        _uiState.update { it.copy(juegoElegido = juego) }

    }
    fun onVolver(){
        _uiState.update { it.copy(juegoElegido = null) }

    }
    fun onAjusteClick(){

    }
}