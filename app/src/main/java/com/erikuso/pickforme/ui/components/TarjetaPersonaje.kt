package com.erikuso.pickforme.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.erikuso.pickforme.model.Personaje
import com.erikuso.pickforme.model.personajesEjemplo
import com.erikuso.pickforme.ui.theme.PickForMeTheme

@Composable
fun TarjetaPersonaje(
    personaje: Personaje,
    seleccionado: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = onClick,
        modifier = modifier
            .width(88.dp)
            .height(100.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.primaryContainer),
        border = if (seleccionado) BorderStroke(3.dp, MaterialTheme.colorScheme.primary) else null
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            AsyncImage(
                model = personaje.imagenUr1,
                contentDescription = personaje.nombre,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
//            Text(
//                text = personaje.siglas,
//                modifier = Modifier
//                    .align(Alignment.TopCenter)
//                    .padding(8.dp),
//                style = MaterialTheme.typography.headlineMedium,
//                color = MaterialTheme.colorScheme.onPrimaryContainer
//            )
//            Text(
//                text = personaje.nombre,
//                modifier = Modifier
//                    .align(Alignment.BottomCenter)
//                    .padding(8.dp),
//                style = MaterialTheme.typography.labelMedium,
//                color = MaterialTheme.colorScheme.onPrimaryContainer,
//                maxLines = 1,
//                overflow = TextOverflow.Ellipsis
//            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TarjetaPersonajePreview() {
    PickForMeTheme {
        TarjetaPersonaje(
            personaje = personajesEjemplo[0],
            seleccionado = true,
            onClick = {}
        )
    }
}