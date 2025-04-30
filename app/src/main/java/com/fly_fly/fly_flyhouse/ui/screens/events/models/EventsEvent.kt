package com.fly_fly.fly_flyhouse.ui.screens.events.models

sealed class EventsEvent {
    data object EnterScreen : EventsEvent()
    data object ReloadScreen : EventsEvent()
}