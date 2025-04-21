package com.fly_fly.fly_flyhouse.ui.screens.home.models.events

sealed class HomeEvent {
    data object EnterScreen : HomeEvent()
    data object ReloadScreen : HomeEvent()
}