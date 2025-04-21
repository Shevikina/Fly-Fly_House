package com.fly_fly.fly_flyhouse.models.events

sealed class SpecialOfferPageEvent {
    data object EnterScreen : SpecialOfferPageEvent()
    data object ReloadScreen : SpecialOfferPageEvent()
}