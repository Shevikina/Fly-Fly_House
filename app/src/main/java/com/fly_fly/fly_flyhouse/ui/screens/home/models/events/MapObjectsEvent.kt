package com.fly_fly.fly_flyhouse.ui.screens.home.models.events

sealed class MapObjectsEvent {
    data object EnterScreen : MapObjectsEvent()
    data object ReloadScreen : MapObjectsEvent()
}