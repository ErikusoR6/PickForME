package com.erikuso.pickforme.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.erikuso.pickforme.ui.theme.PickForMeTheme
import androidx.compose.ui.res.stringResource
import com.erikuso.pickforme.R

data class EncabezadoPantallaParams(
    val titulo: String,
    val subtitulo: String,
    val centrado: Boolean = false,
    val navegacion: @Composable () -> Unit = {},
    val acciones: @Composable () -> Unit = {}
)

@Composable
fun EncabezadoPantalla(
    params: EncabezadoPantallaParams,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        params.navegacion()
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = if (params.centrado) Alignment.CenterHorizontally else Alignment.Start
        ) {

            Text(

                text = params.subtitulo,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = params.titulo,
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
        params.acciones()
    }
}

@Preview(showBackground = true)
@Composable
private fun EncabezadoPantallaPreview() {
    PickForMeTheme {
        EncabezadoPantalla(
            params = EncabezadoPantallaParams(
                titulo = stringResource(R.string.app_name),
                subtitulo = stringResource(R.string.elegir_juego),
                acciones = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Filled.Settings,
                            contentDescription = stringResource(R.string.ajustes)
                        )
                    }
                }
            )
        )

    }
}

