package com.erikuso.pickforme.ui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.erikuso.pickforme.model.Personaje
import com.erikuso.pickforme.model.Rol
import com.erikuso.pickforme.model.personajesEjemplo
import com.erikuso.pickforme.ui.components.EncabezadoPantalla
import com.erikuso.pickforme.ui.components.FichaPersonaje
import com.erikuso.pickforme.ui.components.FiltroRol
import com.erikuso.pickforme.ui.components.TarjetaPersonaje
import com.erikuso.pickforme.ui.theme.PickForMeTheme
import kotlin.Boolean

@Composable
fun PaginaRuleta(
    nombreJuego: String,
    personajes: List<Personaje>,
    personajeSeleccionado: Personaje,
    onGirar: () -> Unit,
    onAtras: () -> Unit,
    onAjusteClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        EncabezadoPantalla(
            titulo = nombreJuego,
            subtitulo = "RULETA DE PERSONAJES",
            centrado = true,
            navegacion = {
                IconButton(onClick = onAtras) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Volver"
                    )
                }
            }
        ) {
            IconButton(onClick = onAjusteClick) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "Ajustes")
            }
        }
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                FiltroRol(texto = "Todos", seleccionado = true, onClick = {})
            }
            items(Rol.entries) { rol ->
                FiltroRol(texto = rol.etiqueta, seleccionado = false, onClick = {})
            }
        }
        LazyRow(
            userScrollEnabled = false,
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(personajes) { personaje ->
                TarjetaPersonaje(
                    personaje = personaje,
                    seleccionado = personaje == personajeSeleccionado,
                    onClick = {}

                )
            }
        }

        Button(
            onClick = onGirar,
            modifier = Modifier.padding(horizontal = 16.dp)
                .align(Alignment.CenterHorizontally)

        ) {
            Text("Girar Ruleta")
        }

        FichaPersonaje(
            personaje = personajeSeleccionado,
            modifier = Modifier.padding(horizontal = 16.dp)


        )

    }
}
@Preview(showBackground = true)
@Composable
private fun PaginaRuletaPreview() {
    PickForMeTheme {
        PaginaRuleta(
            nombreJuego = "Marvel Rivals",
        personajes = personajesEjemplo,
        personajeSeleccionado = personajesEjemplo[0],
        onGirar = {},
        onAjusteClick = {},
        onAtras = {}
        )
    }
}