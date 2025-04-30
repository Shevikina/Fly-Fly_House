package com.fly_fly.fly_flyhouse.ui.screens.special.offer.page.models

sealed class SpecialOfferPageEvent {
    data object EnterScreen : SpecialOfferPageEvent()
    data object ReloadScreen : SpecialOfferPageEvent()
    data object CloseScreen : SpecialOfferPageEvent()
}