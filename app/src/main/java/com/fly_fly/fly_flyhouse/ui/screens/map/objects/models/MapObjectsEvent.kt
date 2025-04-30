package com.fly_fly.fly_flyhouse.ui.screens.map.objects.models

sealed class MapObjectsEvent {
    data object EnterScreen : MapObjectsEvent()
    data object ReloadScreen : MapObjectsEvent()
}