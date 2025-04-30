package com.fly_fly.fly_flyhouse.ui.screens.map.objects.models

import com.fly_fly.fly_flyhouse.ui.navigation.NavScreen

sealed class MapObjectsEvent {
    data object EnterScreen : MapObjectsEvent()
    data object ReloadScreen : MapObjectsEvent()
    data object CloseScreen : MapObjectsEvent()
    data class OpenScreen(val screen: NavScreen) : MapObjectsEvent()
}