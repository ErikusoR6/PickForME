package com.erikuso.pickforme.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.erikuso.pickforme.ui.theme.PickForMeTheme

data class FiltroRolParams(
    val texto: String,
    val seleccionado: Boolean,
    val onClick: () -> Unit
)
@Composable
fun FiltroRol(
    params: FiltroRolParams,
    modifier: Modifier = Modifier
){
    Surface(
        onClick = params.onClick,
        modifier = modifier,
        shape = CircleShape,
        color = if (params.seleccionado) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface,
        border = if (params.seleccionado) null else BorderStroke(1.dp, MaterialTheme.colorScheme.outline)
    ) {
        Text(
            text = params.texto,
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            style = MaterialTheme.typography.labelMedium,
            color = if (params.seleccionado) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onSurfaceVariant
        )
    }

}
@Preview(showBackground = true)
@Composable
private fun FiltroRolPreview() {
    PickForMeTheme {
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            FiltroRol(params = FiltroRolParams("Todos", seleccionado = true, onClick = {}))
            FiltroRol(params = FiltroRolParams(texto = "Tanque", seleccionado = false, onClick = {}))
        }
    }
}