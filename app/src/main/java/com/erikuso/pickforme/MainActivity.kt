package com.erikuso.pickforme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.erikuso.pickforme.ui.pages.PaginaJuegos
import com.erikuso.pickforme.ui.pages.PaginaRuleta
import com.erikuso.pickforme.ui.theme.PickForMeTheme
import com.erikuso.pickforme.ui.viewmodel.PaginaJuegosVM
import com.erikuso.pickforme.ui.viewmodel.PaginaRuletaVM

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContent {
//            PickForMeTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    PaginaJuegos(
//                        juegos = juegosEjemplo,
//                        onJuegoClick = { },
//                        onAjustesClick = { },
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }

        //NAVEGACION BASICA QUE LE PEDI A CLAUDE PARA PROBAR
        setContent {
            PickForMeTheme {
                val juegosVM: PaginaJuegosVM = viewModel()
                val juegosState by juegosVM.uiState.collectAsState()
                val ruletaVM: PaginaRuletaVM = viewModel()
                val ruletaState by ruletaVM.uiState.collectAsState()


                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val juego = juegosState.juegoElegido

                    if (juego == null) {
                        PaginaJuegos(
                            vm = juegosVM,
                            modifier = Modifier.padding(innerPadding)
                        )
                    } else {
                        LaunchedEffect(juego.nombreJuego) {
                            ruletaVM.onJuegoCargado(juego.nombreJuego)
                        }
                        LaunchedEffect(ruletaState.volverSolicitado) {
                            if (ruletaState.volverSolicitado) {
                                ruletaVM.onVolverAtendido()
                                juegosVM.onVolver()

                            }
                        }
                        BackHandler { juegosVM.onVolver() }

                        PaginaRuleta(
                            vm = ruletaVM,
                            modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }
}