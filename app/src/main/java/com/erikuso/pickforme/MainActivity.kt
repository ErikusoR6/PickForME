package com.erikuso.pickforme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.erikuso.pickforme.model.juegosEjemplo
import com.erikuso.pickforme.ui.pages.PaginaJuegos
import com.erikuso.pickforme.ui.theme.PickForMeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PickForMeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PaginaJuegos(
                        juegos = juegosEjemplo,
                        onJuegoClick = { },
                        onAjustesClick = { },
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}