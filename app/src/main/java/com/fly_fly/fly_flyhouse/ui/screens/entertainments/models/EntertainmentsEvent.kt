package com.fly_fly.fly_flyhouse.ui.screens.entertainments.models

sealed class EntertainmentsEvent {
    data object EnterScreen : EntertainmentsEvent()
    data object ReloadScreen : EntertainmentsEvent()
    data object CloseScreen : EntertainmentsEvent()
}