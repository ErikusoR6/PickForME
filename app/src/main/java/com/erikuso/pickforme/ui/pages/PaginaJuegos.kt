package com.erikuso.pickforme.ui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.erikuso.pickforme.R
import com.erikuso.pickforme.model.Juego
import com.erikuso.pickforme.model.juegosEjemplo
import com.erikuso.pickforme.ui.components.EncabezadoPantalla
import com.erikuso.pickforme.ui.components.EncabezadoPantallaParams
import com.erikuso.pickforme.ui.components.TarjetaJuego
import com.erikuso.pickforme.ui.components.TarjetaJuegoParams
import com.erikuso.pickforme.ui.theme.PickForMeTheme

@Composable
fun PaginaJuegos(
    juegos: List<Juego>,
    onJuegoClick: (Juego) -> Unit,
    onAjustesClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        EncabezadoPantalla(
            params = EncabezadoPantallaParams(
                titulo = stringResource(R.string.app_name),
                subtitulo = stringResource(R.string.elegir_juego),
                acciones = {
                    IconButton(onClick = onAjustesClick) {
                        Icon(
                            imageVector = Icons.Filled.Settings,
                            contentDescription = stringResource(R.string.ajustes)
                        )
                    }
                }
            )
        )
        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(juegos) { juego ->
                TarjetaJuego(
                    params = TarjetaJuegoParams(
                        nombreJuego = juego.nombreJuego,
                        siglas = juego.siglas,
                        numeroPersonajes = juego.numeroPersonajes,
                        onClick = { onJuegoClick(juego) }
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PaginaJuegosPreview() {
    PickForMeTheme {
        PaginaJuegos(
            juegos = juegosEjemplo,
            onJuegoClick = {},
            onAjustesClick = {},
        )
    }
}