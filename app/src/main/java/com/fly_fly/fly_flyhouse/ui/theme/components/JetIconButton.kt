package com.fly_fly.fly_flyhouse.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.JetFlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.utils.advancedShadow
import com.microsoft.fluent.mobile.icons.R

@Composable
fun JetIconButton(
    vectorDrawableId: Int,
    modifier: Modifier = Modifier,
    shape: CornerBasedShape = RoundedCornerShape(8.dp),
    contentPadding: PaddingValues = PaddingValues(10.dp),
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .advancedShadow(Color.Black, 0.05f, 8.dp, 4.dp, 4.dp)
            .background(
                JetFlyFlyHouseTheme.colorScheme.secondary,
                shape
            )
            .padding(contentPadding)
            .clickable(onClick = onClick)
    ) {
        Icon(
            painter = painterResource(id = vectorDrawableId),
            contentDescription = "Icon button",
            tint = JetFlyFlyHouseTheme.colorScheme.primary
        )
    }
}

@Preview
@Composable
private fun JetIconButtonPreview() {
    FlyFlyHouseTheme {
        Box(
            modifier = Modifier
                .background(JetFlyFlyHouseTheme.colorScheme.background)
                .padding(32.dp)
        ) {
            JetIconButton(
                vectorDrawableId = R.drawable.ic_fluent_qr_code_24_regular,
                contentPadding = PaddingValues(10.dp),
                shape = JetFlyFlyHouseTheme.shapes.small
            ) {
                println("Clicked")
            }
        }
    }
}