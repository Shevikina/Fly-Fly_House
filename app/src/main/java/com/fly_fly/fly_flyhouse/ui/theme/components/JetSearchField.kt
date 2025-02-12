package com.fly_fly.fly_flyhouse.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.JetFlyFlyHouseTheme

@Composable
fun JetSearchField(
    hint: String,
    value: String = "",
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier
            .shadow(
                4.dp,
                ambientColor = Color.Black.copy(0.02f)
            )
            .background(
                JetFlyFlyHouseTheme.colorScheme.surface,
                JetFlyFlyHouseTheme.shapes.small
            )
            .padding(11.dp)
    ) {
        Icon(
            painter = painterResource(id = com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_search_48_regular),
            tint = JetFlyFlyHouseTheme.colorScheme.primary,
            modifier = Modifier.size(24.dp),
            contentDescription = null
        )
        Spacer(Modifier.width(15.75.dp))
        Text(
            text = if (value.isEmpty()) hint else value,
            style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                color = JetFlyFlyHouseTheme.colorScheme.onSecondary.copy(0.75f)
            )
        )
    }
}

@Preview
@Composable
private fun JetSearchFieldPreview() {
    FlyFlyHouseTheme {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(JetFlyFlyHouseTheme.colorScheme.background)
                .padding(32.dp)
        ) {
            JetSearchField(
                hint = stringResource(id = com.fly_fly.fly_flyhouse.R.string.search_hint).plus(" ..."),
                "",
                Modifier.fillMaxWidth()
            )
        }
    }
}