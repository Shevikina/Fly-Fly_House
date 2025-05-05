package com.fly_fly.fly_flyhouse.ui.screens.special.offer.page.views.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import com.fly_fly.fly_flyhouse.R
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.JetFlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.utils.advancedShadow
import com.fly_fly.fly_flyhouse.utils.getFormatted

@Composable
fun PriceField(
    price: Int,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .advancedShadow(Color.Black, 0.05f, 8.dp, 4.dp, 4.dp)
            .background(
                JetFlyFlyHouseTheme.colorScheme.secondary,
                JetFlyFlyHouseTheme.shapes.medium
            )
            .padding(vertical = 14.dp, horizontal = 17.dp)
    ) {
        Text(
            text = "${stringResource(id = R.string.price_title)}: ${price.getFormatted()} Kr",
            style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                color = JetFlyFlyHouseTheme.colorScheme.primary,
                fontWeight = FontWeight.Medium,
                textAlign = TextAlign.Center,
                lineHeight = 1.em,
                letterSpacing = 0.em
            )
        )
    }
}

@Preview
@Composable
private fun PriceFieldPreview() {
    FlyFlyHouseTheme {
        PriceField(
            price = 1500,
            modifier = Modifier
        )
    }
}