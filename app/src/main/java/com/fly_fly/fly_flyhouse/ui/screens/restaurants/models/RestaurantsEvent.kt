package com.fly_fly.fly_flyhouse.ui.screens.restaurants.models

sealed class RestaurantsEvent {
    data object EnterScreen : RestaurantsEvent()
    data object ReloadScreen : RestaurantsEvent()
    data object CloseScreen : RestaurantsEvent()
}