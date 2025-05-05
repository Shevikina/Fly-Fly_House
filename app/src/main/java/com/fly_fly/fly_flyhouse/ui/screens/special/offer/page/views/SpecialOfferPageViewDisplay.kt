package com.fly_fly.fly_flyhouse.ui.screens.special.offer.page.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.fly_fly.fly_flyhouse.R
import com.fly_fly.fly_flyhouse.data.local.Database
import com.fly_fly.fly_flyhouse.ui.screens.special.offer.page.models.SpecialOfferPageEvent
import com.fly_fly.fly_flyhouse.ui.screens.special.offer.page.views.components.BackNavButton
import com.fly_fly.fly_flyhouse.ui.screens.special.offer.page.views.components.PriceField
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.JetFlyFlyHouseTheme
import com.fly_fly.fly_flyhouse.ui.theme.components.JetTextButton

@Composable
fun SpecialOfferPageViewDisplay(
    offerId: Int,
    dispatcher: (SpecialOfferPageEvent) -> Unit
) {
    val info = Database.offerList.first { it.id == offerId }

    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        AsyncImage(
            model = info.imagePath,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(198.dp)
                .clip(RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 32.dp))
                .background(Color.Gray)
        )

        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = info.title,
            style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                color = JetFlyFlyHouseTheme.colorScheme.onSurface,
                fontWeight = FontWeight.Bold,
                lineHeight = 1.em,
                letterSpacing = 0.em
            )
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = info.description,
            style = JetFlyFlyHouseTheme.typography.bodyLarge.copy(
                color = JetFlyFlyHouseTheme.colorScheme.onSecondary,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                lineHeight = 1.em,
                letterSpacing = 0.em
            ),
            modifier = Modifier.padding(horizontal = 32.dp)
        )

        Spacer(modifier = Modifier.height(22.dp))
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 14.dp)
        ) { PriceField(price = info.price) }
    }

    Box(Modifier.fillMaxSize()) {
        BackNavButton(Modifier.align(Alignment.TopStart)) { dispatcher.invoke(SpecialOfferPageEvent.CloseScreen) }
        JetTextButton(
            text = stringResource(id = R.string.send_application_button),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .padding(32.dp),
            onClick = {}
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFBFAFF)
@Composable
private fun SpecialOfferPageViewDisplayPreview() {
    FlyFlyHouseTheme {
        SpecialOfferPageViewDisplay(0) {}
    }
}