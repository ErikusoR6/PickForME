package com.erikuso.pickforme.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFFE85B3E),
    onPrimary = Color.White,
    primaryContainer = Color(0xFFFFE1D7),
    secondary = Color(0xFFB7791F),
    tertiary = Color(0xFF2F8F68),
    onTertiary = Color.White,
    background = Color(0xFFF4F1EC),
    onBackground = Color(0xFF282321),
    surface = Color(0xFFFFFDF9),
    onSurface = Color(0xFF282321),
    surfaceVariant = Color(0xFFEDE9E3),
    onSurfaceVariant = Color(0xFF807770),
    outline = Color(0xFFDED8D1),
)

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF9272F0),
    onPrimary = Color.White,
    primaryContainer = Color(0xFF2F2650),
    secondary = Color(0xFFE0B04A),
    tertiary = Color(0xFF2F8F68),
    onTertiary = Color.White,
    background = Color(0xFF171719),
    onBackground = Color(0xFFF5F0E9),
    surface = Color(0xFF222225),
    onSurface = Color(0xFFF5F0E9),
    surfaceVariant = Color(0xFF2D2D31),
    onSurfaceVariant = Color(0xFFA7A0A0),
    outline = Color(0xFF39383C),
)

@Composable
fun PickForMeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}