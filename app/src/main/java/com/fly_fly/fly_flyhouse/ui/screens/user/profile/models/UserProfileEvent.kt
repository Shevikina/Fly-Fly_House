package com.fly_fly.fly_flyhouse.ui.screens.user.profile.models

sealed class UserProfileEvent {
    data object EnterScreen : UserProfileEvent()
    data object ReloadScreen : UserProfileEvent()
    data object Logout : UserProfileEvent()
    data object CloseScreen : UserProfileEvent()
}