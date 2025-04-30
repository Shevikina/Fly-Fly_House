package com.fly_fly.fly_flyhouse.ui.screens.home.views.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.JetFlyFlyHouseTheme
import com.microsoft.fluent.mobile.icons.R

@Composable
fun ServicesWidget() {
    Column(verticalArrangement = Arrangement.spacedBy(24.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = stringResource(id = com.fly_fly.fly_flyhouse.R.string.our_services_title),
                style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                    color = JetFlyFlyHouseTheme.colorScheme.onBackground,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 21.09.sp
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = stringResource(id = com.fly_fly.fly_flyhouse.R.string.other_button),
                style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                    color = JetFlyFlyHouseTheme.colorScheme.primary,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    lineHeight = 14.06.sp
                ),
                modifier = Modifier.clickable { println("clicked") }
            )
        }
        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(13.dp)) {
                ServiceCard(
                    label = "Наши объекты на карте",
                    vectorDrawableId = R.drawable.ic_fluent_globe_location_20_filled,
                    iconColor = JetFlyFlyHouseTheme.colorScheme.primary.copy(0.5f),
                    modifier = Modifier.weight(1f)
                ) {}
                ServiceCard(
                    label = "Наши мероприятия",
                    vectorDrawableId = R.drawable.ic_fluent_megaphone_loud_20_filled,
                    iconColor = JetFlyFlyHouseTheme.colorScheme.primary.copy(0.5f),
                    modifier = Modifier.weight(1f)
                ) {}
            }
            Row(horizontalArrangement = Arrangement.spacedBy(13.dp)) {
                ServiceCard(
                    label = "Наши развлечения",
                    vectorDrawableId = R.drawable.ic_fluent_guardian_20_filled,
                    iconColor = JetFlyFlyHouseTheme.colorScheme.primary.copy(0.5f),
                    modifier = Modifier.weight(1f)
                ) {}
                ServiceCard(
                    label = "Наши рестораны",
                    vectorDrawableId = R.drawable.ic_fluent_bowl_salad_20_filled,
                    iconColor = Color(0xFF56CB03),
                    modifier = Modifier.weight(1f)
                ) {}
            }
        }
    }
}

@Preview(locale = "Ru")
@Composable
private fun ServicesWidgetPreview() {
    FlyFlyHouseTheme {
        Box(
            modifier = Modifier
                .background(JetFlyFlyHouseTheme.colorScheme.background)
                .padding(32.dp)
        ) {
            ServicesWidget()
        }
    }
}
