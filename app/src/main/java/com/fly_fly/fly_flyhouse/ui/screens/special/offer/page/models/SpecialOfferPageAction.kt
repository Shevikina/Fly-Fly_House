package com.fly_fly.fly_flyhouse.ui.screens.special.offer.page.models

sealed class SpecialOfferPageAction {
    data class ShowDialog(
        val title: String,
        val body: String,
        val buttonText: String
    ) : SpecialOfferPageAction()
}