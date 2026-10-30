package com.erikuso.pickforme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.erikuso.pickforme.model.Juego
import com.erikuso.pickforme.model.juegosEjemplo
import com.erikuso.pickforme.model.personajesEjemplo
import com.erikuso.pickforme.ui.pages.PaginaJuegos
import com.erikuso.pickforme.ui.pages.PaginaRuleta
import com.erikuso.pickforme.ui.theme.PickForMeTheme

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
                var juegoElegido by remember { mutableStateOf<Juego?>(null) }
                var personajeElegido by remember { mutableStateOf(personajesEjemplo[0]) }

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val juego = juegoElegido

                    if (juego == null) {
                        PaginaJuegos(
                            juegos = juegosEjemplo,
                            onJuegoClick = { elegido -> juegoElegido = elegido },
                            onAjustesClick = { },
                            modifier = Modifier.padding(innerPadding)
                        )
                    } else {
                        BackHandler { juegoElegido = null }

                        PaginaRuleta(
                            nombreJuego = juego.nombreJuego,
                        personajes = personajesEjemplo,
                        personajeSeleccionado = personajeElegido,
                        onGirar = {personajeElegido = personajesEjemplo.random() },
                        onAtras = { juegoElegido = null },
                        onAjusteClick = { },
                        modifier = Modifier.padding(innerPadding)
                        )
                    }
                }
            }
        }
    }
}