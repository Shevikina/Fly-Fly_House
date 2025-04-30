package com.fly_fly.fly_flyhouse.ui.screens.home.views.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fly_fly.fly_flyhouse.R
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.JetFlyFlyHouseTheme

@Composable
fun SpecialOffersWidget() {
    Column(verticalArrangement = Arrangement.spacedBy(24.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = stringResource(id = R.string.special_offers_title),
                style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                    color = JetFlyFlyHouseTheme.colorScheme.onBackground,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    lineHeight = 21.09.sp
                )
            )
            Spacer(modifier = Modifier.weight(1f))
            IconButton(onClick = { println("Filtered") }, modifier = Modifier.size(24.dp)) {
                Icon(
                    imageVector = ImageVector.vectorResource(com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_filter_24_filled),
                    contentDescription = null,
                    tint = JetFlyFlyHouseTheme.colorScheme.primary
                )
            }
        }
        SpecialOfferCard(
            title = "Экскурсия по крейсеру “Альт”",
            description = "Десятки палуб, секретные лаборатории и технологичные дроиды уже ...",
            imagePath = "file:///android_asset/App4_Image2.jpg",
            price = 1500
        ) {}
    }
}

@Preview
@Composable
private fun SpecialOffersWidgetPreview() {
    FlyFlyHouseTheme {
        Box(
            modifier = Modifier
                .background(JetFlyFlyHouseTheme.colorScheme.background)
                .padding(32.dp)
        ) {
            SpecialOffersWidget()
        }
    }
}