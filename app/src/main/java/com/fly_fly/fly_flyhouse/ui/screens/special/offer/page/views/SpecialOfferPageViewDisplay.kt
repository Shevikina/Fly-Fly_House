package com.fly_fly.fly_flyhouse.ui.screens.special.offer.page.views

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.fly_fly.fly_flyhouse.ui.screens.special.offer.page.models.SpecialOfferPageEvent
import com.fly_fly.fly_flyhouse.ui.theme.FlyFlyHouseTheme

@Composable
fun SpecialOfferPageViewDisplay(
    offerId: Int,
    dispatcher: (SpecialOfferPageEvent) -> Unit
) {
    // макет готов, а я пока нет

    // TODO: Добавить dispatcher.invoke(SpecialOfferPageEvent.CloseScreen)
}

@Preview
@Composable
private fun SpecialOfferPageViewDisplayPreview() {
    FlyFlyHouseTheme {
        SpecialOfferPageViewDisplay(0) {}
    }
}