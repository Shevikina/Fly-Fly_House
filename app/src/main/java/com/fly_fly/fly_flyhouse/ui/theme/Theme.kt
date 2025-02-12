package com.fly_fly.fly_flyhouse.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

private val DarkColorScheme = darkColorScheme(
    background = BackgroundColor,
    primary = PrimaryColor,
    secondary = SecondaryColor,
    surface = SurfaceColor,
    onPrimary = OnPrimaryColor,
    onSecondary = OnSecondaryColor,
    onBackground = OnBackgroundColor,
    onSurface = OnSurfaceColor
)

private val LightColorScheme = lightColorScheme(
    background = BackgroundColor,
    primary = PrimaryColor,
    secondary = SecondaryColor,
    surface = SurfaceColor,
    onPrimary = OnPrimaryColor,
    onSecondary = OnSecondaryColor,
    onBackground = OnBackgroundColor,
    onSurface = OnSurfaceColor
)

val LocalFlyFlyHouseColors = staticCompositionLocalOf<ColorScheme> {
    error("No colors provided")
}

val LocalFlyFlyHouseTypography = staticCompositionLocalOf<Typography> {
    error("No font provided")
}

val LocalFlyFlyHouseShape = staticCompositionLocalOf<JetFlyFlyHouseShapes> {
    error("No shapes provided")
}

object JetFlyFlyHouseTheme {
    val colorScheme: ColorScheme
        @Composable
        get() = LocalFlyFlyHouseColors.current

    val typography: Typography
        @Composable
        get() = LocalFlyFlyHouseTypography.current

    val shapes: JetFlyFlyHouseShapes
        @Composable
        get() = LocalFlyFlyHouseShape.current
}

@Composable
fun FlyFlyHouseTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    CompositionLocalProvider(
        LocalFlyFlyHouseColors provides colorScheme,
        LocalFlyFlyHouseTypography provides typography,
        LocalFlyFlyHouseShape provides shapes,
        content = content
    )
}