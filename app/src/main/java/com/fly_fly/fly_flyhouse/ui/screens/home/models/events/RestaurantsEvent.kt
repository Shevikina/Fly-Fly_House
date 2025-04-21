package com.fly_fly.fly_flyhouse.ui.screens.home.models.events

sealed class RestaurantsEvent {
    data object EnterScreen : RestaurantsEvent()
    data object ReloadScreen : RestaurantsEvent()
}