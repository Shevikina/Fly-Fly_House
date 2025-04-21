package com.fly_fly.fly_flyhouse.ui.screens.home.models.events

sealed class EntertainmentsEvent {
    data object EnterScreen : EntertainmentsEvent()
    data object ReloadScreen : EntertainmentsEvent()
}