package com.erikuso.pickforme.ui.components

import androidx.compose.foundation.layout.Arrangement
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

@Composable
fun EncabezadoPantalla(
    titulo: String,
    subtitulo: String,
    modifier: Modifier = Modifier,
    centrado: Boolean = false,
    navegacion: @Composable () -> Unit = {},
    acciones: @Composable () -> Unit = {},

){
    Row(
        modifier = modifier.fillMaxWidth().padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        navegacion()
        Column( modifier = Modifier.weight(1f),
            horizontalAlignment = if (centrado) Alignment.CenterHorizontally else Alignment.Start){

            Text(

                text = subtitulo,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = titulo,
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
        acciones()
    }
}
@Preview(showBackground = true)
@Composable
private fun EncabezadoPantallaPreview() {
    PickForMeTheme {
        EncabezadoPantalla(titulo = "PickForME", subtitulo = "ELIGE TU JUEGO"){
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Filled.Settings, contentDescription = "Ajustes")
            }
        }

    }
}

