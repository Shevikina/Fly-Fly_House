package com.fly_fly.fly_flyhouse.models.events

sealed class EventsEvent {
    data object EnterScreen : EventsEvent()
    data object ReloadScreen : EventsEvent()
}