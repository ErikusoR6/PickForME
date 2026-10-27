package com.erikuso.pickforme.ui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.erikuso.pickforme.model.Juego
import com.erikuso.pickforme.model.juegosEjemplo
import com.erikuso.pickforme.ui.components.TarjetaJuego
import com.erikuso.pickforme.ui.theme.PickForMeTheme

@Composable
fun PaginaJuegos(
    juegos: List<Juego>,
    onJuegoClick: (Juego) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(juegos) { juego ->
            TarjetaJuego(
                juego = juego,
                onClick = { onJuegoClick(juego) }
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PaginaJuegosPreview() {
    PickForMeTheme {
        PaginaJuegos(juegos = juegosEjemplo, onJuegoClick = {})
    }
}