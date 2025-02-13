package com.fly_fly.fly_flyhouse.ui.screens.home.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.JetFlyFlyHouseTheme

@Composable
fun ServiceCard(
    label: String,
    vectorDrawableId: Int,
    iconColor: Color,
    modifier: Modifier = Modifier
) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(9.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .shadow(
                4.dp,
                JetFlyFlyHouseTheme.shapes.medium,
                spotColor = Color.Black.copy(0.05f)
            )
            .background(
                JetFlyFlyHouseTheme.colorScheme.secondary.copy(0.5f),
                JetFlyFlyHouseTheme.shapes.medium
            )
            .border(
                2.dp,
                JetFlyFlyHouseTheme.colorScheme.primary.copy(0.1f),
                JetFlyFlyHouseTheme.shapes.medium
            )
            .padding(vertical = 12.dp)
            .padding(start = 13.dp, end = 10.dp)
    ) {
        Icon(
            painter = painterResource(id = vectorDrawableId),
            contentDescription = null,
            tint = iconColor,
            modifier = Modifier
                .background(
                    iconColor.copy(iconColor.alpha * 0.1f),
                    CircleShape
                )
                .padding(6.dp)
        )
        Text(
            text = label,
            style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                lineHeight = 14.06.sp,
                color = JetFlyFlyHouseTheme.colorScheme.onSurface
            )
        )
    }
}

@Preview
@Composable
private fun ServiceCardPreview() {
    FlyFlyHouseTheme {
        Box(
            modifier = Modifier
                .background(JetFlyFlyHouseTheme.colorScheme.background)
                .padding(32.dp)
        ) {
            ServiceCard(
                label = "Наши объекты на карте",
                vectorDrawableId = com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_globe_location_24_filled,
                iconColor = JetFlyFlyHouseTheme.colorScheme.primary.copy(0.5f),
                modifier = Modifier.width(160.dp)
            )
        }
    }
}