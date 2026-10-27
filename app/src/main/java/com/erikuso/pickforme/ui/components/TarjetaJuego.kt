package com.erikuso.pickforme.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.Icons
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.erikuso.pickforme.model.Juego
import com.erikuso.pickforme.model.juegosEjemplo
import com.erikuso.pickforme.ui.theme.PickForMeTheme

@Composable
fun TarjetaJuego(
    juego: Juego,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    Card(onClick = onClick,
        modifier = modifier.fillMaxWidth()
    ){
        Row(modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ){
            Box(modifier = Modifier.size(56.dp).background(MaterialTheme.colorScheme.primary,
                MaterialTheme.shapes.medium),
                contentAlignment = Alignment.Center){
                Text(
                    text = juego.siglas,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
            Column(modifier = Modifier.weight(1f)){
                Text(
                    text = juego.nombreJuego,
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.onSurface

                )
                Text(
                    text = "${juego.numeroPersonajes} personajes",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

            }
            Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight, contentDescription = null,tint = MaterialTheme.colorScheme.onSurfaceVariant)
        }

    }


}
@Preview(showBackground = true)
@Composable
private fun TarjetaJuegoPreview(){
    PickForMeTheme() {
        TarjetaJuego(juego = juegosEjemplo[1], onClick ={})
    }
}

