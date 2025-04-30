package com.fly_fly.fly_flyhouse.ui.screens.special.offer.page

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.fly_fly.fly_flyhouse.ui.screens.special.offer.page.models.SpecialOfferPageEvent
import com.fly_fly.fly_flyhouse.ui.screens.special.offer.page.views.SpecialOfferPageViewDisplay

@Composable
fun SpecialOfferPageScreen(offerId: Int, navController: NavController) {
    SpecialOfferPageViewDisplay(offerId) { event ->
        when (event) {
            is SpecialOfferPageEvent.CloseScreen -> {
                navController.popBackStack()
            }

            else -> {}
        }

    }
}