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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.erikuso.pickforme.R
import com.erikuso.pickforme.model.Personaje
import com.erikuso.pickforme.model.Rol
import com.erikuso.pickforme.model.personajesEjemplo
import com.erikuso.pickforme.ui.components.EncabezadoPantalla
import com.erikuso.pickforme.ui.components.EncabezadoPantallaParams
import com.erikuso.pickforme.ui.components.FichaPersonaje
import com.erikuso.pickforme.ui.components.FichaPersonajeParams
import com.erikuso.pickforme.ui.components.FiltroRol
import com.erikuso.pickforme.ui.components.TarjetaPersonaje
import com.erikuso.pickforme.ui.components.TarjetaPersonajeParams
import com.erikuso.pickforme.ui.theme.PickForMeTheme
import com.erikuso.pickforme.ui.components.FiltroRolParams
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
            params = EncabezadoPantallaParams(
                titulo = nombreJuego,
                subtitulo = stringResource(R.string.ruleta_personaje),
                centrado = true,
                navegacion = {
                    IconButton(onClick = onAtras) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = stringResource(R.string.volver)
                        )
                    }
                },
                acciones = {
                    IconButton(onClick = onAjusteClick) {
                        Icon(
                            imageVector = Icons.Filled.Settings,
                            contentDescription = stringResource(R.string.ajustes)
                        )
                    }
                }
            )
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                FiltroRol(
                    params = FiltroRolParams(
                        texto = stringResource(R.string.todos),
                        seleccionado = true,
                        onClick = {}
                    )
                )
            }
            items(Rol.entries) { rol ->
                FiltroRol(
                    params = FiltroRolParams(
                        texto = rol.etiqueta,
                        seleccionado = false,
                        onClick = {}
                    )
                )
            }
        }
        LazyRow(
            userScrollEnabled = false,
            contentPadding = PaddingValues(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(personajes) { personaje ->
                TarjetaPersonaje(
                    params = TarjetaPersonajeParams(
                        nombre = personaje.nombre,
                        imagenUr1 = personaje.imagenUr1,
                        seleccionado = personaje == personajeSeleccionado,
                        onClick = {}
                    )
                )
            }
        }

        Button(
            onClick = onGirar,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(stringResource(R.string.girar_ruleta))
        }

        FichaPersonaje(
            params = FichaPersonajeParams(
                nombre = personajeSeleccionado.nombre,
                siglas = personajeSeleccionado.siglas,
                rol = personajeSeleccionado.rol.etiqueta,
                descripcion = personajeSeleccionado.descripcion,
                habilidades = personajeSeleccionado.habilidades
            ),

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