package com.fly_fly.fly_flyhouse.models.events

sealed class HomeEvent {
    data object EnterScreen : HomeEvent()
    data object ReloadScreen : HomeEvent()
}