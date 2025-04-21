package com.fly_fly.fly_flyhouse.models.events

sealed class RestaurantsEvent {
    data object EnterScreen : RestaurantsEvent()
    data object ReloadScreen : RestaurantsEvent()
}