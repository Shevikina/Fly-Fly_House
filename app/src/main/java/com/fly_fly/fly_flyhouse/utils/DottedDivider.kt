package com.fly_fly.fly_flyhouse.utils

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun DottedDivider(
    modifier: Modifier = Modifier,
    color: Color = Color.Gray,
    thickness: Dp = 1.dp,
    dashWidth: Dp = 10.dp,
    gapWidth: Dp = 10.dp
) {
    val density = LocalDensity.current
    val dashWidthPx = with(density) { dashWidth.toPx() }
    val gapWidthPx = with(density) { gapWidth.toPx() }
    val strokeWidthPx = with(density) { thickness.toPx() }

    Canvas(
        modifier = modifier
            .fillMaxWidth()
            .height(thickness)
    ) {
        drawLine(
            color = color,
            start = Offset(0f, size.height / 2),
            end = Offset(size.width, size.height / 2),
            strokeWidth = strokeWidthPx,
            pathEffect = PathEffect.dashPathEffect(
                intervals = floatArrayOf(dashWidthPx, gapWidthPx),
                phase = 0f
            )
        )
    }
}