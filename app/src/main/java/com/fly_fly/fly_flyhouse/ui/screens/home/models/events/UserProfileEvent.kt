package com.fly_fly.fly_flyhouse.ui.screens.home.models.events

sealed class UserProfileEvent {
    data object EnterScreen : UserProfileEvent()
    data object ReloadScreen : UserProfileEvent()
    data object Logout : UserProfileEvent()
}