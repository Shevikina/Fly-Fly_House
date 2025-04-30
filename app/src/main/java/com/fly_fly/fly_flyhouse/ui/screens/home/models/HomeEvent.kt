package com.fly_fly.fly_flyhouse.ui.screens.home.models

sealed class HomeEvent {
    data object EnterScreen : HomeEvent()
    data object ReloadScreen : HomeEvent()
}