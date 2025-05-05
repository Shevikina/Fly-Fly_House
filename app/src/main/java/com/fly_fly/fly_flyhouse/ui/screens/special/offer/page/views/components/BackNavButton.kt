package com.fly_fly.fly_flyhouse.ui.screens.special.offer.page.views.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.JetFlyFlyHouseTheme

@Composable
fun BackNavButton(
    modifier: Modifier = Modifier,
    shape: CornerBasedShape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp),
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .sizeIn(48.dp, 48.dp)
            .background(
                color = JetFlyFlyHouseTheme.colorScheme.onSecondary,
                shape = shape
            )
            .clip(shape)
            .clickable(onClick = onClick)
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_chevron_left_16_filled),
            contentDescription = null,
            tint = JetFlyFlyHouseTheme.colorScheme.secondary,
            modifier = Modifier.sizeIn(24.dp, 24.dp)
        )
    }
}

@Preview
@Composable
private fun BackNavButtonPreview() {
    FlyFlyHouseTheme {
        BackNavButton(
            modifier = Modifier,
            onClick = {}
        )
    }
}