package com.fly_fly.fly_flyhouse.ui.screens.home.models

import com.fly_fly.fly_flyhouse.ui.navigation.NavScreen

sealed class HomeEvent {
    data object EnterScreen : HomeEvent()
    data object ReloadScreen : HomeEvent()
    data class OpenScreen(val screen: NavScreen) : HomeEvent()
}