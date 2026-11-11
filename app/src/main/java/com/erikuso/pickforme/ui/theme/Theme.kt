package com.erikuso.pickforme.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = PrimarioClaro,
    onPrimary = Color.White,
    primaryContainer = ContenedorPrimarioClaro,
    secondary = SecundarioClaro,
    tertiary = TerciarioClaro,
    onTertiary = Color.White,
    background = FondoClaro,
    onBackground = TextoClaro,
    surface = SuperficieClaro,
    onSurface = TextoClaro,
    surfaceVariant = VarianteSuperficieClaro,
    onSurfaceVariant = DeVarianteSuperficieClaro,
    outline = ContornoClaro,
)

private val DarkColorScheme = darkColorScheme(
    primary = PrimarioOscuro,
    onPrimary = Color.White,
    primaryContainer = ContenedorPrimarioOscuro,
    secondary = SecundarioOscuro,
    tertiary = TerciarioOscuro,
    onTertiary = Color.White,
    background = FondoOscuro,
    onBackground = TextoOscuro,
    surface = SuperficieOscuro,
    onSurface = TextoOscuro,
    surfaceVariant = VarianteSuperficieOscuro,
    onSurfaceVariant = DeVarianteSuperficieOscuro,
    outline = ContornoOscuro,
)

@Composable
fun PickForMeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        Typography = Tipografia,
        content = content
    )
}